''''
Your task is to complete the Cat class which extends Animal and replace the speak method to return the cats name + meows. e.g. 'Mr Whiskers meows.'

The name attribute is accessible in the class with self.name.

Reference: Python docs
''''


from preloaded import Animal

class Cat(Animal):
    def speak(self):
        return f"{self.name} meows."

# Example usage:
# Assuming you have an instance of Cat with a name attribute set
# my_cat = Cat("Mr Whiskers")
# print(my_cat.speak())  # Output: "Mr Whiskers meows."       

''''
Explanation:
Inheritance: The Cat class inherits from the Animal class.
speak Method: The speak method is overridden to return a string that includes the cat's name followed by "meows."
String Formatting: The f"{self.name} meows." syntax is used for string interpolation, which makes it easy to include the cat's name in the output.
Make sure that the Animal class has a name attribute that can be accessed through self.name. 
''''

#If you need to set the name when creating an instance of Cat, ensure that the constructor of the Animal class is called properly, like this:    

class Cat(Animal):
    def __init__(self, name):
        super().__init__(name)  # Call the constructor of the Animal class
        self.name = name
    
    def speak(self):
        return f"{self.name} meows."
      
#This way, when you create a Cat instance, you can provide a name, and the speak method will work as expected.
  
