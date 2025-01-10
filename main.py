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

print("***Tuples***\n")

myTup = ("Monday","Tuesday","Wedneday","Tuesday")
print(f"{myTup}\n")
print(f"Lengh of myTup tupple: {len(myTup)}\n")

realTup = ("dog",)#Notice the comma
print(f"realTup: {realTup}")
fakeTup = ("dog")#No comma here
print(f"fakeTup: {fakeTup}")
print(f"realTup is a true tuple: {type(realTup)}")
print(f"fakeTup is a string, not a tuple: {type(fakeTup)}\n")

tupConstructor = tuple(("onion","garlic","celery"))
print(f"Created with tuple() constructor/method: {tupConstructor}")

'''Python Collections (Arrays)
There are four collection data types in the Python programming language:

List is a collection which is ordered and changeable. Allows duplicate members.
Tuple is a collection which is ordered and unchangeable. Allows duplicate members.
Set is a collection which is unordered, unchangeable*, and unindexed. No duplicate members.
Dictionary is a collection which is ordered** and changeable. No duplicate members.

*Set items are unchangeable, but you can remove and/or add items whenever you like.
**As of Python version 3.7, dictionaries are ordered. In Python 3.6 and earlier, dictionaries are unordered.

When choosing a collection type, it is useful to understand the properties of that type. 
Choosing the right type for a particular data set could mean retention of meaning, and, 
it could mean an increase in efficiency or security.'''

==================================================================================================================================================

print("***Update Tuples***\n")

'''Tuples are unchangeable, meaning that you cannot change, add, or remove items once the tuple is created but there are some workarounds'''

print("Original tuple")
myTup = ("mango","banana","orange")
print(f"{myTup}\n")

print("Convert tuple to a list, add or remove items and convert back")
myList = list(myTup)
myList[1] = "kiwi" 
myList.append("papaya")
myList.remove("mango")
myTup = tuple(myList)
print(f"{myTup}\n")

print("Add a tuple into a tuple")
myTup2 = ("coconut",)
myTup += myTup2
print(myTup)
#del myTup This deletes whole tuple and no longer exists/is not printable

==================================================================================================================================================

print("***Unpacking a tuple***\n")

fruitTup = ("melon","grape","banana")
print(f"Packed tuple:\n{fruitTup} \n")

''' When we create a tuple, we normally assign values to it. This is called "packing" a tuple.

But, in Python, we are also allowed to extract the values back into variables. This is called "unpacking" '''

print("Unpacked tuple:")
(one,two,three) = fruitTup#Variables called one, two and three
print(one)
print(two)
print(three)
print()

'''Note: The number of variables must match the number of values in the tuple, if not, 
you must use an asterisk to collect the remaining values as a list.'''

veggyTup = ("onion","celery","garlic","potato")
print(f"Another packed tuple:\n{veggyTup}\n")

print("Unpacked tuple with asterisk:")
(one,*red,two) = veggyTup
print(one)
print(two)
print(red)

''' If the asterisk is added to another variable name than the last, 
Python will assign values to the variable until the number of values left matches the number of variables left '''

==================================================================================================================================================

print("***Loop a tuple***\n")

print("For loop using the item")
fruitTup = ("melon","grape","banana")
for i in fruitTup:
    print(i)
print()    
    
print("For loop using the index")    
veggyTup = ("onion","celery","garlic","potato")
for i in range (len(veggyTup)):
    print(i)
print()    
    
print("While loop using item") 
aniTup = ("chicken","dog","cat")
x = 0
while x < len(aniTup):
    print(aniTup[x])
    x += 1

==================================================================================================================================================

print("***Sets***\n")

#A set is a collection which is unordered, unchangeable*, and unindexed
#* Note: Set items are unchangeable, but you can remove items and add new items.

mySet = {False,"mango",True,"avocado",1,0,"mango","avocado"}
print(mySet)

#Sets cannot have two items with the same value
#Note: The values False and 0, True and 1 are considered the same value in sets, and are treated as duplicates

==================================================================================================================================================

print("***Sets***\n")

mySet = {False,"mango",True,"avocado",1,0,"mango","avocado"}
for i in mySet:
    print(i)
print()    

print(f"Check if mango exists in mySet: {"mango" in mySet}\n")    

print("Add tomato item with add() method")
mySet.add("tomato")
print(f"{mySet}\n")

otherSet = {"one","two","three"}
mySet.update(otherSet)
print(f"Fuse/combine mySet and otherSet in one\n{mySet}\n")

print("Remove avocado item with remove() method")
mySet.remove("avocado")
print(f"{mySet}\n")
''' Note: If the item to remove does not exist, remove() will raise an error'''

print("Remove two item with discard() method")
mySet.discard("two")
print(f"{mySet}\n")
'''Note: If the item to remove does not exist, discard() will NOT raise an error'''

print("Remove a random item with pop() method")
x = mySet.pop()
print(f"{mySet}\n")
'''Note: Sets are unordered, so when using the pop() method, you do not know which item that gets removed'''


==================================================================================================================================================


