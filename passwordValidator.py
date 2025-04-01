def password(st):
    charLength = 8
    return (len(st) >= charLength) and any(char.isupper() for char in st) and any(char.islower() for char in st) and any(char.isdigit() for char in st)

'''
First check for Length: Create a variable and assign it value of 8, then create condition of at least 8 chars 
Second check for Uppercase: any() to check if there is at least one uppercase, used with For loop
Then check for Lowercase: any() to check if there is at least one lowercase, used with For loop
Finally check for Digit: any() to check if there is at least one digit, used with For loop
If any of above are not met, it will return False.
'''	

#Another option slightly modified to look prettier

# def password(st):
#     charLength = 8
#     return (len(st) >= charLength and 
#             any(char.isupper() for char in st) and 
#             any(char.islower() for char in st) and 
#             any(char.isdigit() for char in st))

# print(password("Password1"))  # True
# print(password("pass1"))      # False
# print(password("PASSWORD"))   # False
# print(password("Pass"))       # False
