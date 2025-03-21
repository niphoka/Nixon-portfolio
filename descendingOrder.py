def descending_order(num):
    stringList = [int(d) for d in str(num)]#First convert num/user input to a list in string format using list comprehension
    stringList.sort(reverse=True)#Then sort list in reverse
    joinList = ''.join(map(str, stringList))#Now join the list items without a comma
    stringToInt = int(joinList)#Finally, convert previous string into an integer
    return stringToInt


print(descending_order(42145))#Input as an example, it will result in 54421
