#If the bill was $150.00, split between 5 people, with 12% tip.
#Each person should pay (150.00 / 5) * 1.12 = 33.6
#Format the result to 2 decimal places = 33.60

#Write your code below this line 👇

#We first need to take user's input and convert them as integer or float
total_bill = float(input("Welcome to the tip calculator! \nPlease enter the total of the bill: $" ))
total_people = int(input("Please enter the total of people to split the bill: "))
total_tip = float(input("Please enter the percentage tip to give to the waiter/waitress, 10, 12 or 15%: "))

#After we have our variables with the input value, we need to make the calculations

#This is to calculate the percentage value
percentage = (total_bill / total_people) * (total_tip / 100)

#This is to take a preliminary result
subtotal = total_bill / total_people + percentage

#This is an option, in my case I detected a bug with amount $150, 5 people and 12% tip where it would output one digit after the dot "."
# subtotal2 = round(subtotal, 2)

#This one works best with .format
grand_total= "{:.2f}".format(subtotal)

#And then print the result using F string
print(f"Each person should pay ${grand_total}")