''''
You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.

a can contain numbers or strings. x can be either.

Return true if the array contains the value, false if not.
''''

def check(ar, val):
    return any(i for i in ar if val in ar)

print(check ([66, 101], 66))#True
print(check(["what", "a", "nice", "dog"], "dawg"))#False

# 2 other possible options:
#     1) return any(any for i in ar if val in ar) 

#     2) for i in ar:
#         if val in ar:
#             return True
#         else:
#             return False  
