#Password Generator Project
import random

#Characters to choose from
letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

#User to input some data
print("Welcome to the PyPassword Generator!")
nr_letters = int(input("How many letters would you like in your password?\n"))
nr_symbols = int(input(f"How many symbols would you like?\n"))
nr_numbers = int(input(f"How many numbers would you like?\n"))

#Easy way, this will provide you eith a password in order or letters, numbers and symbols
# password = ""
#
# for char in range(nr_letters):
#   password += random.choice(letters)
#
# for char in range(nr_symbols):
#   password += random.choice(symbols)
#
# for char in range(nr_numbers):
#   password += random.choice(numbers)
#
# print(password)

# This is fine but not convenient from a security perspective, since a hacker can easily guess the password once the order or characters is guessed

#HARD WAY

#First we need an empty list
password_list = []

#Now we need to iterate through the input characters via a range (some teachers place:
#for char in range(0, nr_letters)
#for char in range(1, nr_letters -1)
#The above are also valid, I just modified it for simplicity

for char in range(nr_letters):
    #this will append the result of randomizing input letters into the empty list
    password_list += random.choice(letters)

for char in range(nr_symbols):
    #this will append the result of randomizing input symbols into the empty list
    password_list += random.choice(symbols)

for char in range(nr_numbers):
    #this will append the result of randomizing input numbers into the empty list
    password_list += random.choice(numbers)

#You can add multiple prints so that you can test and see the results of each stage of coding, in this case, a list
print(password_list)

#Now we ned to randomize the order on which the characters will appear in order to get a safe password
random.shuffle(password_list)

#We print again to see progress so far, which is another list, but randomized
print(password_list)

#Now we need to put everything together in a string-like format (not a list anymore), for that, we first create a variable with empty string
password = ""
#now we need to take the previous password_list, which has the already generated password in a list format and iterate through it
for i in password_list:
    #now we append the result of the previous iteration into the empty list
    password += i
    #and we print for the last time, now getting our desired result
print(f"Your password is {password}")
