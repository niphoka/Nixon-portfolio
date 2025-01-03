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

==================================================================================================================================================

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

==================================================================================================================================================


print("***Change items on a List***\n")

fruitList = ["orange","banana","mango","kiwi","grape","apple","melon"]
print("List:\n 0)orange, 1)banana, 2)mango, 3)kiwi, 4)grape, 5)apple, 6)melon\n")

fruitList[1] = "avocado"
print(f"We now replace banana for avocado:\n {fruitList}\n")

fruitList[3:5] = ["papaya","lemon"]
print(f"Let us replace kiwi and grape for papaya and lemon\n {fruitList}\n")

fruitList[6:7] = ["guava","tamarindo"]
print(f"We can substitute melon and add guava and tamarindo\n {fruitList}\n")

fruitList[0:2] = ["strawberry"]
print(f"We can also replace orange and avocado for strawberry\n {fruitList}\n")

fruitList.insert(0, "blueberry")
print(f"Let us insert blueberry without deleting anything else\n {fruitList}")

==================================================================================================================================================

 print("***Add items to a List***\n")

fruitList = ["orange","banana","mango","kiwi"]
print("List:\n 0)orange, 1)banana, 2)mango, 3)kiwi\n")

fruitList.append("lemon")#Adds lemon to the end of the list
print(fruitList)

fruitList.insert(5, "papaya")#Adds papaya to the specified index number
print(fruitList)

veggyList = ["carrot","spinach","celery" ]
fruitList.extend(veggyList)#Adds veggyList to the end of the list
print(fruitList)

'''The extend() method does not have to append lists, you can add any iterable object (tuples, sets, dictionaries etc.)'''

normalList = ["One","Two","Three"]
normalTupple = ("Four","Five","Six")
normalList.extend(normalTupple)
print(normalList)

normalDict = {"greet":"Hey", "subject":"You"}
normalList.extend(normalDict)
print(normalList)

==================================================================================================================================================

print("***Remove items from a List***\n")

fruitList = ["orange","banana","mango","kiwi","banana","papaya","apple"]
print(f"{fruitList}\n")

fruitList.remove("mango")
print(f"Let us remove mango from fruitList\n {fruitList}\n")

fruitList.remove("banana")
print(f"Now let's remove the first occurrence of a repeated item, banana\n {fruitList}\n")

fruitList.pop(0)
print(f"Let's try to remove orange by index using pop method\n {fruitList}\n")

fruitList.pop()
print(f"If we do not specify an index, pop will remove last item, apple\n {fruitList}\n")

del fruitList[1]
print(f"We use del with index to delete an item, banana\n {fruitList}\n")

fruitList.clear()
print(f"We can delete list contents but list still remains\n {fruitList}\n")

del fruitList
'''print(fruitList)

ERROR!
Traceback (most recent call last):
  File "<main.py>", line 25, in <module>
NameError: name 'fruitList' is not defined '''

==================================================================================================================================================

print("***For loop through items from a List***\n")

fruitList = ["orange","banana","mango","kiwi","banana","papaya","apple"]

print("Show items from a list")
for i in fruitList:
    print(i)
print("\n")

print("Show index of items from a list")
for i in range(len(fruitList)):
    print(i)
print("\n")

print("List comprehension")    
[print(x) for x in fruitList]  

==================================================================================================================================================

print("***While loop through items from a List***\n")

fruitList = ["orange","banana","mango","kiwi","banana","papaya","apple"]

print("Show items from a list")
i = 0
while i < len(fruitList):
    print(fruitList[i])
    i += 1

print("\n")

i = 0
print("Show index of items from a list")
while i < len(fruitList):
    print(i)
    i += 1
    
==================================================================================================================================================

print("***List comprehension***\n")

itemList = ["orange","cherry","onion","oister","carrot","celery","tuna"]

print(f"Original list\n{itemList}\n")

#Find items beginning with letter C and add them to a new list
cList = []

for i in itemList:
    if "c" in i:
        cList.append(i)
print(f"List only with letter C using regular for loop\n{cList}\n")


#Find items beginning with letter C and add them to a new list
oList = [x for x in itemList if "o" in x]
print(f"List only with letter O using list comprehension\n{oList}\n")

nList = [i for i in itemList if i != "tuna"]#Pay attention to order in for loop here
print(f"List with no tuna in it\n{nList}\n")

xList = [i for i in range(10) if i < 5]
print(f"Iterate using comprehension\n{xList}\n")

uList = [x.upper() for x in itemList]
print(f"Use of methods inside comprehension\n{uList}\n")

sList = ["dog" for i in itemList]
print(f"Substitue all items for a new sigle one\n{sList}\n")

tList = [x if x != "tuna" else "salmon" for x in itemList]#Pay attention to order in for loop here and compare it to above
print(f"Substitute tuna for salmon\n{tList}\n")

'''If there is no else, for loop goes first:
    
    [i for i in itemList if i != "tuna"]
    
   otherwise, for loop goes last:
   
    [x if x != "tuna" else "salmon" for x in itemList]'''

==================================================================================================================================================

print("***Sorting a list***\n")

itemList = ["ostrich","donkey","zebra","antilope","bird","cheetah"]
numList = [55, 89, 10, 23, 69, 33, 99]
print(f"Original list\n{itemList}\n")
print(f"Original integer list\n{numList}\n")

print("Sort from a to z / ascending order")
itemList.sort()
print(itemList)

numList.sort()
print(f"{numList}\n")

print("Sort from z to a / descending order")
itemList.sort(reverse = True)
print(itemList)

numList.sort(reverse = True)
print(f"{numList}\n")

print("Customize sort by creating a custom function to calculate which number from numList is closer to 50 after susbracting 50 and applying absolute value")
def sortFunc(n):
    return abs(n - 50)
numList.sort(key = sortFunc)
print(f"{numList}\n")

print("Sorting a list with some items in caps will give unexpected results since capital letters take prescedence over non caps, no matter the alphabetical order\n")

someList = ["dog","Cat","bird", "Zebra"]
print(f"Original list\n{someList}\n")

someList.sort()
print(f"List sorted according to caps prescedence\n{someList}\n")

someList.sort(key = str.lower)
print(f"After telling Sort method to consider all caps as lower\n{someList}\n")

someList.reverse()
print(f"Reversing order regardles of alphabet\n{someList}\n")

==================================================================================================================================================

print("***Copy a list***\n")

petList = ["dog","cat","bird","fish"]
copyList = petList.copy()
print(f"Copied with copy() method: {copyList}")

doppelgangerList = list(petList)
print(f"Copied with list() method: {doppelgangerList}")

duplicateList = petList[:]
print(f"Copied with [:] slice: {duplicateList}")

==================================================================================================================================================

print("***Join lists***\n")

petList = ["dog","cat","bird","fish"]
wildList = ["wolf","tiger","eagle","shark"]

animalList = petList + wildList
print(f"Join 2 lists by using + symbol:\n{animalList}\n")


for x in wildList:
    petList.append(x)
print(f"Join 2 lists by using for loop and append() method:\n{petList}\n") 

''' or
for i in petList:
    wildList.append(i)
print(wildList) '''
    
numList = [1,2,3,4]
letterList = ["a","b","c","d"]
newList = numList.extend(letterList)
print(f"Join 2 lists by using extend() method:\n{numList}")

==================================================================================================================================================
