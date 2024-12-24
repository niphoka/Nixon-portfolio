print("***Lists***\n")

mixList = ["apple",1,"melon",2]
print (mixList)
print(f"The type of mixList is: {type(mixList)}\n")

combList = list(("onion",3,"garlic",4))
print(combList)
print(f"The lenght of combList is: {len(combList)}")


''' There are four collection data types in the Python programming language:

List is a collection which is ordered and changeable. Allows duplicate members.
Tuple is a collection which is ordered and unchangeable. Allows duplicate members.
Set is a collection which is unordered, unchangeable*, and unindexed. No duplicate members.
Dictionary is a collection which is ordered** and changeable. No duplicate members.

*Set items are unchangeable, but you can remove and/or add items whenever you like.

**As of Python version 3.7, dictionaries are ordered. In Python 3.6 and earlier, dictionaries are unordered.  '''

===================================================================================================================================

print("***Access items on a List***\n")

fruitList = ["orange","banana","mango","kiwi","grape","apple","melon"]
print("List: 0)orange, 1)banana, 2)mango, 3)kiwi, 4)grape, 5)apple, 6)melon\n")
print("List: -7)orange, -6)banana, -5)mango, -4)kiwi, -3)grape, -2)apple, -1)melon\n")
print(f"The range [2:] covers {fruitList[2:]}")
print(f"The range [:2] covers {fruitList[:2]}")
print(f"The range [2:4] cover {fruitList[2:4]}")
print(f"The range [-2:] covers {fruitList[-2:]}")
print(f"The range [:-2] covers {fruitList[:-2]}")
print(f"The range [-4:-2] covers {fruitList[-4:-2]}\n")


print("***Check if item exist***\n")
if "kiwi" in fruitList:
    print("Kiwi is on list")

if "tomato" not in fruitList:
    print("Tomato is not on list")

===================================================================================================================================

 


