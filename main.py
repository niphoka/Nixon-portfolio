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

print("***Dictionaries***\n")

carDict = {
    "brand":"Ford",
    "model":"Mustang",
    "year":"1964" }

print(f"Accesing item by key name:\n{carDict["model"]}\n")
print(f"Accesing item with get() method:\n{carDict.get("year")}\n")
print(f"Returns all keys in dictionary with keys() method:\n{carDict.keys()}\n")
print(f"Returns all values in dictionary with values() method:\n{carDict.values()}\n")
print(f"Returns all items from a dictionary as tuples inside a list with items() method:\n{carDict.items()}\n")

print("If statement used with IN")
if "model" in carDict:
    print("Key model exists in dictionary")
print()

carDict["year"] = "2020"
print(f"Change value of an item by referring to its key:\n{carDict}\n")

carDict.update({"model":"Explorer"})
print(f"Change value of an item by using update() method:\n{carDict}\n")

carDict["color"] = "red"
print(f"Add an item to dictionary by using new key and value:\n{carDict}\n")

carDict.update({"value":"$150000"})
print(f"Add an item to dictionary by using update() method:\n{carDict}\n")

==================================================================================================================================================

print("***For loop in Dictionaries***\n")

carDict = {
    "brand":"Ford",
    "model":"Mustang",
    "year":"1964" }

print("Print all keys")
for i in carDict:
    print(i)
print()    
    
print("Print all values")    
for x in carDict:
    print(carDict[x])
print()

print("Print all keys with method")
for i in carDict.keys():
    print(i)
print()    
    
print("Print all values with method")    
for x in carDict.values():
    print(x)
print()   

print("Print keys and values with method")    
for i,x in carDict.items():
    print(f"{i}: {x}")

==================================================================================================================================================

print("***Nested Dictionaries***\n")

zoo = {
    "animal1" : {
        "name" : "zebra",
        "year" : 1990 },
    "animal2" : {
        "name" : "lion",
        "year" : 1980 },
    "animal3" : {
        "name" : "giraffe",
        "year" : 2000 }}

print("Print lion item from inside animal2 dictionary which is inside zoo dictionary")
print(f"{zoo["animal2"]["name"]}\n")

print("Unformatted for loop to print items, keys and dictionaries")
for x,y in zoo.items():
    print(x,y)
print()

print("Formatted for loop to print items, keys and dictionaries")
for x,obj in zoo.items():
    print(x)
    for y in obj:
        print(y + " : ", obj[y])

==================================================================================================================================================

print("***While loops***\n")

print("While loop with break")
x = 1
while x < 6:
    print(x)
    if x == 4:
        print("Stopping on four")
        break
    x += 1 #Pay attention to this here
    
print()#This is just for formatting

print("While loop with continue")
i = 0
while i < 6:
    i += 1 #Pay attention to this here
    if i == 5:
        print("Five was here")
        continue
    print(i) 

print()#This is just for formatting

print("While loop with Else statement")
y = 1
while y < 6:
    print(y)
    y += 1 #Pay attention to this here
else:
    print("variable 'y' is no longer less than 6")

==================================================================================================================================================

print("***Functions***\n")

def myFunc(fName):
    print(fName + " Trump")
myFunc("Nathan")
myFunc("Jennifer")
print()

def myFunc2(fname, lname):#This function expects 2 arguments, and gets 2 arguments, no more, no less
    print(fname + " " + lname)
myFunc2("Emily", "Richardson")    
print()

def myFunc3(*food):#If you do not know how many arguments that will be passed into your function, add a * before the parameter name in the function definition. This is called *args in documentation
    print("My favorite food is " + food[2])
myFunc3("tacos","lasagna","salmon","roasted chicken")    
print()

def myFunc4(food1, food2, food3):#This is called *kwargs in documentation
    print("The food I like the least is " + food2)
myFunc4(food1 = "gummy bears", food2 = "soup", food3 = "beans")    
print()

def myFunc5(**kid):#If you do not know how many keyword arguments that will be passed into your function, add two asterisk: ** before the parameter name in the function definition
    print("His last name is " + kid["lname"])
myFunc5(fname = "Robert", lname = "Jacobsen")    

==================================================================================================================================================

print("***Functions part 2***\n")

def countryFunc(country = "Costa Rica"):
    print("I am from " + country)
countryFunc("Germany")
countryFunc()# Default parameter
countryFunc("Spain")
print()

def foodFunc(food):
    for i in food:
        print(i)
fruits = ["lemon","papaya","banana"]# Passing a list as an argument of a function
foodFunc(fruits)        
print()

def mathFunc(x):
    return x * 5# Return values in functions
print(mathFunc(3))   
print(mathFunc(5))  
print()

def positionFunc(x, /):# Positional-only arguments
    print(x)
positionFunc(3)  
# positionFunc(x = 3) This shows error since keyword arguments are not allowed
print()

def keywordFunc(*, x):# Keyword-only arguments 
    print(x)
keywordFunc(x = 3)
# keywordFunc(3) This shows error since positional arguments are not allowed
print()

def combineFunc(a,b,/,*,c,d):#Any argument before the / , are positional-only, and any argument after the *, are keyword-only.
    print(a+b+c+d)
combineFunc(2,3,c=4,d=5)  
print()

# def triRecursion(x):# Function calls itself (recursion)
#     if(x > 0):
#         result = x + triRecursion(x - 1) # This takes argument 6 and substracts 1, so it goes: 6 - 1 then print, 5 - 1 then print, 4 - then print and so on
#         print(result)
#     else:# Once argument reaches 0, then recursion goes from 1 to 6, one by one, adding the number plus the previous result, starting from 0
#         result = 0
#     return result # For example, 1 + previous result(0) = 1, 2 + previous(1) = 3, 3 + previous (3) = 6, 4 + previous (6) = 10, 5 + previous (10) = 15 and 6 + previous (15) = 21
# print("Recursion: ")
# triRecursion(6)

def tri_recursion(x):# This is a simplified and rustic version from the one seen on StacOverflow
    if(x > 0):
        print('Run loop x - 1 =',x)
        holder = tri_recursion(x - 1)
        result = x + holder
        print('x =',x,'+ previous result =',holder,'result =',result)
    else:
        result = 0
        print('Result from loop = ', x)
    return result

print("\n\nRecursion Example Results")
tri_recursion(6)

'''
Recursion Example Results
                         start loop k 6
                     start loop k 5
                 start loop k 4
             start loop k 3
         start loop k 2
     start loop k 1
i reached when k = 0
 end loop 0
     i am k( 1 )+previous result( 0 )= 1
     end loop 1
         i am k( 2 )+previous result( 1 )= 3
         end loop 2
             i am k( 3 )+previous result( 3 )= 6
             end loop 3
                 i am k( 4 )+previous result( 6 )= 10
                 end loop 4
                     i am k( 5 )+previous result( 10 )= 15
                     end loop 5
                         i am k( 6 )+previous result( 15 )= 21
                         end loop 6
                         
Taken from https://stackoverflow.com/questions/52578602/how-does-a-python-recursive-function-works-for-tri-recursion-function                         
'''                         

==================================================================================================================================================

print("***Lambda functions***\n")
'''A lambda function is a small anonymous function.

A lambda function can take any number of arguments, but can only have one expression'''

x = lambda a : a + 10 # One argument
print(x(5))

y = lambda a,b : a * b # Two arguments
print(y(6,6))

z = lambda a,b,c : a + b * c # Three arguments
print(z(2,3,4))

#The power of lambda is better shown when you use them as an anonymous function inside another function, as seen below

def myLambdaFunc(n):
    return lambda a : a ** n # Not multiplied but elevated to the power of
myDouble = myLambdaFunc(2)
myTriple = myLambdaFunc(3)
print(myDouble(9))
print(myTriple(3))

==================================================================================================================================================

print("***Lists as Arrays***\n")

''' Note: Python does not have built-in support for Arrays, but Python Lists can be used instead.

Note: This shows you how to use LISTS as ARRAYS, however, to work with arrays in Python you will have to import a library, like the NumPy library. '''

cars = ["Ford","Volvo","BMW"]

print(cars[0])

cars[0] = "Toyota"
print(cars[0])

print(len(cars))
print()

for i in cars:
    print(i)
    
cars.append("Honda")# By name
print(cars)

cars.insert(2,"Suzuki")# By index and name
print(cars)

cars.pop(1)# By index
print(cars)

cars.remove("Honda")# By name
print(cars)

==================================================================================================================================================

print("***Classes & objects - Init function***\n")

'''Use the __init__() function to assign values to object properties, or other operations that are necessary to do when the object is being created'''

class Person:
    def __init__(self,name,age):
        self.name = name
        self.age = age
person1 = Person("John",69)
print(f"{person1.name} is {person1.age} years old")

==================================================================================================================================================

print("***Classes & objects - Str function***\n")

'''The __str__() function controls what should be returned when the class object is represented as a string.

If the __str__() function is not set, the string representation of the object is returned'''

class Person:
    def __init__(self,name,age):
        self.name = name
        self.age = age
        
    def __str__(self):
        return f"{person1.name} is {person1.age} years old"
person1 = Person("John",69)
print(person1)


''' If you decide not to use str function:

class Person:
  def __init__(self, name, age):
    self.name = name
    self.age = age

p1 = Person("John", 36)

print(p1)

This will print a not so helpful value:

<__main__.Person object at 0x15039e602100>'''

==================================================================================================================================================

print("***Object Methods***\n")

'''Objects can also contain methods. Methods in objects are functions that belong to the object.'''

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        
 # Note: The self parameter is a reference to the current instance of the class, and is used to access variables that belong to the class
 
    def myFunc(self):# Insert a function that prints a greeting
        print(f"Hello my name is {self.name} and I am {self.age} years old")
        
p1 = Person("Bob", 55)# p1 is the object
p1.myFunc()# Execute function on the p1 object

==================================================================================================================================================

print("***Self Parameter***\n")

'''The self parameter is a reference to the current instance of the class, and is used to access variables that belong to the class.

It does not have to be named self, you can call it whatever you like, but it has to be the first parameter of any function in the class'''

class Person:
    def __init__(reference, name, age):
        reference.name = name
        reference.age = age
        
 
    def myFunc(reference):# Insert a function that prints a greeting
        print(f"Hello my name is {reference.name} and I am {reference.age} years old")
        
p1 = Person("Maya", 5)# p1 is the object
p1.myFunc()# Execute function on the p1 object

'''class definitions cannot be empty, but if you for some reason have a class definition with no content, put in the pass statement to avoid getting an error

class Person:
    pass 
    '''

==================================================================================================================================================

print("***Inheritance***\n")

class Person:# Parent class
    def __init__(self,fname,lname):
        self.firstn = fname
        self.lastn = lname
        
    '''def printname(self):
        print(self.firstn,self.lastn)'''

# When you add the __init__() function, the child class will no longer inherit the parent's __init__() function. Note: The __init__() function is called automatically every time the class is being used to create a new object.

'''class Student(Person): Child class - This does the same as the below class
     def __init__(self,fname,lname):
       Person.__init__(self,fname,lname)'''

# To keep the inheritance of the parent's __init__() function, add a call to the parent's __init__() function. Note: The child's __init__() function overrides the inheritance of the parent's __init__() function.

'''class Student(Person):# Child class - This is simpler
    def __init__(self,fname,lname):
        super().__init__(fname,lname)'''
 
# Python also has a super() function that will make the child class inherit all the methods and properties from its parent       
# By using the super() function, you do not have to use the name of the parent element, it will automatically inherit the methods and properties from its parent. 
        
class Student(Person):# Child class - This is simpler
    def __init__(self,fname,lname,year):# In this method we add the year parameter
        super().__init__(fname,lname)
        self.gradyear = year# Function Property

# If you add a method in the child class with the same name as a function in the parent class, the inheritance of the parent method will be overridden.

    def welcome(self):# Method/Function
        print("Welcome",self.firstn,self.lastn,"to the class of",self.gradyear)
        
# The year 2025 should be a variable, and passed into the Student class when creating student objects

x = Student("Mike","Olsen",2025)# And here we see the arguments      
x.welcome()

==================================================================================================================================================

print("***Iterator vs Iterable***\n")

'''Lists, tuples, dictionaries, and sets are all iterable objects. They are iterable containers which you can get an iterator from. All these objects have a iter() method which is used to get an iterator'''

aTupple = ("apple","banana","cherry")
iterable = iter(aTupple)
print(next(iterable))
print(next(iterable))
print(next(iterable))
print()

for i in aTupple:# We can also use a for loop to iterate through an iterable object
    print(i)
print()

aString = "kid"
itera = iter(aString)
print(next(itera))
print(next(itera))
print(next(itera))
print()

# The for loop actually creates an iterator object and executes the next() method for each loop.

for x in aString:
    print(x)
print()

==================================================================================================================================================

print("***Iterator - Manual iteration***\n")

'''To create an object/class as an iterator you have to implement the methods __iter__() and __next__() to your object.
As you have learned in the Python Classes/Objects chapter, all classes have a function called __init__(), which allows you to do some initializing when the object is being created.
The __iter__() method acts similar, you can do operations (initializing etc.), but must always return the iterator object itself.
The __next__() method also allows you to do operations, and must return the next item in the sequence'''

'''Create an iterator that returns numbers, starting with 1, and each sequence will increase by one (returning 1,2,3,4,5 etc.)'''

class Numbers:
    def __iter__(self):
        self.a = 1
        return self

    def __next__(self):
        x = self.a
        self.a += 1
        return x

aClass = Numbers()
iterable = iter(aClass)
print(next(iterable))# This is a manual approach of doing the iteration. one by one
print(next(iterable))
print(next(iterable))

==================================================================================================================================================

print("***Iterator - Stop iteration***\n")

'''To prevent the iteration from going on forever, we can use the StopIteration statement.

In the __next__() method, we can add a terminating condition to raise an error if the iteration is done a specified number of times'''

class Numbers:
    def __iter__(self):
        self.a = 1
        return self

    def __next__(self):
        if self.a <= 20:# Condition to define iteration
            x = self.a
            self.a += 1
            return x
        else:
            raise StopIteration# This will stop the iteration from going forever

aClass = Numbers()
iterable = iter(aClass)
for i in iterable:# More dynamic than iterating one by one
    print(i)

==================================================================================================================================================

print("***Polymorphism***\n")

'''Polymorphism is often used in Class methods, where we can have multiple classes with the same method name.

For example, say we have three classes: Car, Boat, and Plane, and they all have a method called move()'''

class Car:
    def __init__(self,brand,model):# Same fuction and paramters on all classes
        self.brand = brand
        self.model = model
        
    def move(self):# Same fuction and paramters on all classes
        print("Drive!")

class Boat:
    def __init__(self,brand,model):
        self.brand = brand
        self.model = model
    
    def move(self):
        print("Sail!")
        
class Plane:
    def __init__(self,brand,model):
        self.brand = brand
        self.model = model
    
    def move(self):
        print("Fly!")
        
car = Car("Ford","Mustang")
boat = Boat("Ibiza","Touring 20")
plane = Plane("Boeing","747")

for i in (car,boat,plane):
    print(i.brand,i.model)
    i.move()
    print()

==================================================================================================================================================

print("***Polymorphism and inheritance class***\n")

'''What about classes with child classes with the same name? Can we use polymorphism there?

Yes. If we use the example above and make a parent class called Vehicle, and make Car, Boat, Plane child classes of Vehicle, the child classes inherits the Vehicle methods, but can override them'''

class Vehicle:
    def __init__(self,brand,model):# This is declared only on parent class
        self.brand = brand
        self.model = model
                
    def move(self):# This function will be inherited to all children
        print("Drive!")
        
class Car(Vehicle):# Empty class, it will inherit function from parent
    pass

class Boat(Vehicle):
    def move(self):# Each children can override method with their own arguments
        print("Sail!")

class Plane(Vehicle):# Look how shorter the code is
    def move(self):
        print("Fly!")
        
car = Car("Ford","Mustang")
boat = Boat("Ibiza","Touring 20")
plane = Plane("Boeing","747")

for i in (car,boat,plane):
    print(i.brand,i.model)
    i.move()
    print()

==================================================================================================================================================

print("***Bult-in math functions***\n")

'''The min() and max() functions can be used to find the lowest or highest value in an iterable '''

lowest = min(5,10,15)
print(lowest)

highest = max(5,10,15)
print(highest)

absolute = abs(-7.75)# returns the absolute (positive) value of the specified number
print(absolute)

power = pow(4,3)# Return the value of 4 to the power of 3 (same as 4 * 4 * 4)
print(power)

==================================================================================================================================================

print("***Math module***\n")

import math

square = math.sqrt(64)# Returns the square root of a number
print(square)

'''The math.ceil() method rounds a number upwards to its nearest integer, and the math.floor() method rounds a number downwards to its nearest integer, and returns the result'''

ceiling = math.ceil(1.4)
print(ceiling)

floor = math.floor(1.4)
print(floor)

Pi = math.pi# returns the value of PI 
print(Pi)

==================================================================================================================================================

import re

print("***Python RegEx***\n")

txt = "The rain in Spain"

search = re.search("^The.*Spain$",txt)# Check if the string starts with "The" and ends with "Spain"
if search:
    print("We have a match")
else:
    print("No match")
print()    
    
findall = re.findall("ai",txt)# returns a list containing all matches 
print(findall)

findPortu = re.findall("Portugal",txt)# If no matches are found, an empty list is returned
print(findPortu)
print()

searcSpace = re.search("\\s",txt)# Search for the first white-space character in the string
print("The first white-space character is located in position",searcSpace.start())
print()

split = re.split("\\s",txt)# The split() function returns a list where the string has been split at each match. 
print(split)

split2 = re.split("\\s",txt,1)# You can control the number of occurrences by specifying the maxsplit parameter with a number
print(split2)
print()

substitute = re.sub("\\s","9",txt)# Replaces all white-space characters with the the text of your choice, in this case, the digit "9"
print(substitute)

substitute2 = re.sub("\\s","9",txt,2)# You can control the number of replacements by specifying the count parameter
print(substitute2)
print()

position = re.search(r"\bS\w+",txt)# Search for an upper case "S" character in the beginning of a word, and print its position. The "r" in the beginning is making sure that the string is being treated as a "raw string"
print(position.span())

sentence = re.search(r"\bS\w+",txt)# The string property returns the whole string
print(sentence.string)

word = re.search(r"\bS\w+",txt)# Search for an upper case "S" character in the beginning of a word, and print the word
print(word.group())

==================================================================================================================================================

print("***Try-Except***\n")

try:
    print(x)
except NameError:
    print("Variable x is not defined")
except:
    print("Something else went wrong")
else:
    print("Nothing went wrong")
finally:
    print("Code execution finished")
print()

i = -1
if i < 0:
    raise Exception("Sorry, no numbers below 0")
print()

y = "Maya"
if type(y) is not int:
    raise TypeError("Only integers are allowed")

==================================================================================================================================================

print("***Try-Except - File***\n")

try:
    file = open("test.txt")
    try:
        file.write("dog")
    except:
        print("Could not write to file")
    finally:
        file.close()
except:
    print("Could not open file")

==================================================================================================================================================

print("***Machine Learning - Mean/Median/Mode***\n")

'''The mean value is the average value.

To calculate the mean, find the sum of all values, and divide the sum by the number of values:
    
    (99+86+87+88+111+86+103+87+94+78+77+85+86) / 13 = 89.77 '''

import numpy

speed = [99,86,87,88,111,86,103,87,94,78,77,85,86]# 13 numbers (1 on center, 6 on right and 6 on left)
mean = numpy.mean(speed)#Use the NumPy mean() method to find the average speed
print(mean)
print()

'''The median value is the value in the middle, after you have sorted all the values. It is important that the numbers are sorted before you can find the median.'''

median = numpy.median(speed)
print(median)
print()

#If there are two numbers in the middle, median divides the sum of the 2 most centered numbers by two and provides a result: (86 + 87) / 2 = 86.5

speed2 = [99,86,87,88,111,86,87,94,78,77,85,86]# 12 numbers (2 on center, 5 on right and 5 on left)
median2 = numpy.median(speed2)
print(median2)
print()


''''The Mode value is the value that appears the most number of times'''''
from scipy import stats

speed3 = [99,86,87,88,111,86,103,87,94,78,77,85,86]

mode = stats.mode(speed3)
print(mode)# This code works on certain IDEs, not sure why

#The mode() method returns a ModeResult object that contains the mode number (86), and count (how many times the mode number appeared (3)).

==================================================================================================================================================

print("***Standard Deviation***\n")

''''What is Standard Deviation?

Standard deviation is a number that describes how spread out the values are.

A low standard deviation means that most of the numbers are close to the mean (average) value.

A high standard deviation means that the values are spread out over a wider range.'''''

import numpy

speed = [86,87,88,86,87,85,86]
deviation = numpy.std(speed)# Most of the values are within the range of 0.9 from the mean value, which is 86.4.
print(deviation)
print()

speed2 = [32,111,138,28,59,77,97]
deviation2 = numpy.std(speed2)# Most of the values are within the range of 37.85 from the mean value, which is 77.4
print(deviation2)#As you can see, a higher standard deviation indicates that the values are spread out over a wider range.
print()

''' Variance is another number that indicates how spread out the values are.

In fact, if you take the square root of the variance, you get the standard deviation!

Or the other way around, if you multiply the standard deviation by itself, you get the variance!

To calculate the variance manually you have to do as follows:

1) Find the mean: Sum all the items and divide them by their total amount 
2) For each value, find the difference from the mean: Substract each item by their total from past calculation 
3) For each difference, find the square value: Square previous results
4) The variance is the mean/average number of these squared differences

Or we can use numpy to calculate variance '''

speed3 = [32,111,138,28,59,77,97]
variance = numpy.var(speed3)
print(variance)

''' Symbols
Standard Deviation is often represented by the symbol Sigma: σ

Variance is often represented by the symbol Sigma Squared: σ2 '''

==================================================================================================================================================

import numpy

print("***Percentile***\n")

'''Algebra: Percentile is the percent of scores that fall below a certain value in a given data set'''

ages = [5,31,43,48,50,41,7,11,15,39,80,82,32,2,8,6,25,36,27,61,31]# Ages of every person living on a street

''' What is the 75 percetile of the above array? Let us go through the manual process

1) First we take 75 and divide it by 100, to then multiply it by the total amount of items in the array, like this: 75 / 100 * 21 = 15.75
2) Now we round the result to the nearest whole number, in this case, 16
3) Then, we sort the array in ascending order:

x = sorted(ages)
print(x)

[2, 5, 6, 7, 8, 11, 15, 25, 27, 31, 31, 32, 36, 39, 41, 43, 48, 50, 61, 80, 82]

4) Later, we go to the array to find the item in the 16th position (43 on this ocassion)
5) Finally, we can say that 75% of the people in the street are younger than 43 years old '''

percentile = numpy.percentile(ages, 75)# This is the semi-automated process   
print(percentile)

==================================================================================================================================================


