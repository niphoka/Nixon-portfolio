public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("This is an exercise for variables \n");
        int myNum = 3;
        char myChar = 'B';
        String myString = "What goes around comes around";
        boolean myBool = false;
        final int myFin = 500;
        System.out.println("This will print an integer: " + myNum);
        System.out.println("This will print a character: " + myChar);
        System.out.println("This will print a string: " + myString);
        System.out.println("This will print a boolean: " + myBool);
        System.out.println("This will print a final / constant: " + myFin);
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("This is a practice for casting\n");

        System.out.println("Wide casting (from small to large)");
        int myInt = 30;
        double newDoub = myInt;
        System.out.println(newDoub);
        System.out.println();
        
        System.out.println("Narrow casting (from large to small)");

        double myDoub = 12.99;
        int newInt = (int) myDoub;
        System.out.println(newInt);
        System.out.println();
        
        System.out.println("Real life example");
    
        int studentPoints = 70;
        int totalPoints = 80;
        System.out.println("If a student gets 70 out of 80 points on a exam, the final grade is: " + (float) studentPoints / totalPoints * 100);
        /*We need to convert studentPoints or totalPoints (one or the other) variables from integer to double so that result is accurate, otherwise, it will always end up in zero (0), see below:
        + studentPoints / totalPoints * 100); THIS WILL RESULT IN 0, A FAILURE IN THE CODE
        */
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("This is practice for Operators\n");
        System.out.println("Arithmetic operators");
        int num1 = 5;
        int num2 = 10;
        System.out.println(num1 + " plus " + num2 + " equals: " + (num1 + num2)); //This code does addition
        System.out.println(num1 + " conatenated with " + num2 + " equals: " + num1 + num2); //This code does concatenation
        System.out.println();
        
        System.out.println("Assignment operators");
        int num3 = 10;
        num3 += 5;
        System.out.println(num3);
        System.out.println();
        
        System.out.println("Comparison operators");
        int num4 = 14;
        int num5 = 56;
        System.out.println(num4 > num5);
        System.out.println();
        
        System.out.println("Logical operators");
        int num6 = 99;
        int num7 = 98;
        int num8 = 89;
        int num9 = 88;
        System.out.println(num6 > num9 && num7 > num8);
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("String methods\n");
        String myStr = "Otorrinolaringologia";
        System.out.println("The length of " + myStr + " is: " + myStr.length());
        System.out.println(myStr + " in upper case: " + myStr.toUpperCase());
        System.out.println(myStr + " in lower case: " + myStr.toLowerCase());
        System.out.println("The position of rino in " + myStr + " is: " + myStr.indexOf("rino"));
        System.out.println();
        
        System.out.println("Concatenation\n");
        String name = "Gary";
        String lastName = " Snail";
        System.out.println("This is done with +: " + name + lastName);
        System.out.println("This is done with .concat method: " + name.concat(lastName));
        
        int myTen = 10;
        int myTwen = 20;
        System.out.println(myTen + " + " + myTwen + " is: " + (myTen + myTwen));
        System.out.println(myTen + " concatenated with " + myTwen + " is: " + myTen + myTwen);
        System.out.println();
        
        System.out.println("Special characters\n");
        System.out.println("We are the so-called \"Vikings\" of the North");
        System.out.println("It\'s fine dude");
        System.out.println("The character \\");
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Math method\n");
        int firstNum = 64;
        int secondNum = -7;
        double thirdNum = 13.99;
        System.out.println(Math.max(firstNum,secondNum));
        System.out.println(Math.min(firstNum,secondNum));
        System.out.println(Math.abs(secondNum));
        System.out.println(Math.round(thirdNum));
        System.out.println(Math.sqrt(firstNum));
        System.out.println();
        
        System.out.println("Random number formula and regular approach");
        int randNum = (int)(Math.random() * 101);
        System.out.println(randNum);
        System.out.println(Math.random()); /*The random() method returns a random number between 0 and 1.
            This method never returns exactly 1, but it can return 0.*/
    }
}

===============================================================================================================================================
    
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Booleans\n");
        int driveAge = 18;
        int userAge = 17;
        System.out.println("Is " + driveAge + " > " + userAge + "?" + " = " + (driveAge > userAge));
        System.out.println();
        int voteeAge = 19;
        int votingAge = 23;
        if (voteeAge > votingAge)
        {
            System.out.println("User can vote");
        }
        else
        {
            System.out.println("User CANNOT vote");
        }
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("If, else if, else practice\n");
        int aNum = 10;
        if (aNum < 5)
        {
            System.out.println("Dog");
        }
        else if (aNum < 10)
        {
            System.out.println("Cat");
        }
        else
        {
            System.out.println("Bird");
        }
        System.out.println();
        System.out.println("Short hand If,Else\n");
        int price = 50;
        String result = (price < 30) ? "Doggy" : "Kitty";
        System.out.println(result);
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Real life examples with If\n");
        int numLock = 1324; //Example #1
        if (numLock == 1324)
        {
            System.out.println("Code is valid, door is opened");
        }
        else
        {
            System.out.println("Code is NOT valid, door remains closed");
        }
        System.out.println();
        
        int anyNum = 33; //Example #2
        if (anyNum % 2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        System.out.println();
        
        int currentAge = 18;//Example #3
        int votingAge = 20;
        if (currentAge >= votingAge)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You cannot vote");
        }
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        int fruit = 4;//This indicates which case to select
        switch (fruit)
        {
            case 1:
                System.out.println("Mango");
                break;
            case 2:
                System.out.println("Papaya");
                break;
            case 3:
                System.out.println("Tamarindo");
                break;
            default://Used when there is no case match
                System.out.println("Avocado");
        }
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("While loop\n");
        int num = 0;
        while (num < 5)
        {
            System.out.println(num);
            num++;
        }
        System.out.println();
        
        System.out.println("Do While loop\n");
        int integ = 0;
        do 
        {
            System.out.println(integ);
            integ++;
        }
        while (integ < 5);
        System.out.println();
        
        System.out.println("Real life example 1\n");
        int counter = 3;
        while (counter > 0)
        {
            System.out.println(counter + " minutes to explode");
            counter--;
        }
        System.out.println("Game over");
        System.out.println();
        
        System.out.println("Real life example 2.0\n");//This and 2.5 achieve the same goal with different approach
        int gameCount = 1;
        while (gameCount < 5) //This does not have equals sign
        {
            if (gameCount <= 5)//and this does
            {
                System.out.println("Hold it..." + gameCount);
                gameCount++;//The increase is inside the If
            }
        }
        System.out.println("Go!");//Result is outside If and While
        System.out.println();
        
        System.out.println("Real life example 2.5\n");
        int gameCount2 = 1;
        while (gameCount2 <= 5)//This has equals sign
        {
            if (gameCount2 < 5)//and this does not
            {
                System.out.println("Hold your gun " +  gameCount2);
            }
            else
            {
                System.out.println("Fire!");//Result is inside If
            }
            gameCount2++;//The increase is outside the If and inside the While
        }
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("For loop\n");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i);
        }
        System.out.println();
        
        for (int j = 0; j < 10; j+=2)//This prints even numbers
        {
            System.out.println(j);
        }
        System.out.println();
        
        System.out.println("Nested For loop\n");
        for (int a = 1; a <3; a++)
        {
            System.out.println("Outer " + a);
            for (int b = 1; b < 4; b++)
            {
                System.out.println("    Inner " + b);
            }    
        }
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Foreach loop\n");
        String[] cars = {"Toyota", "Honda", "Mazda", "Mitsubishi"};
        for (String car : cars)
        {
            System.out.println(car);
        }
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Real life examples \n");
        System.out.println("Count to 100 in tens");
        for (int counter = 0; counter <=100; counter+=10)
        {
            System.out.println(counter);
        }
        System.out.println();
        
        System.out.println("Count to 10 in pairs");
        for (int pair = 0; pair<=10; pair+=2)
        {
            System.out.println(pair);
        }
        System.out.println();
        
        System.out.println("Multiplication table for a given number");
        int number = 9;
        for (int multiplier = 1; multiplier <=10; multiplier++)
        {
            System.out.println(number + "x" + multiplier + " = " + number*multiplier);
        }
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Break in For loop\n");
        for (int i = 0; i <= 10; i++)
        {
            if (i == 4)
            {
                System.out.println("Break and do not continue to 10\n");
                break;
            }
            System.out.println(i);
        }    
    
            
        System.out.println("Continue in For loop\n");
        for (int x = 0; x <=10; x++)
        {
            if (x == 4)
            {
                System.out.println("Skip 4 and continue to 10");
                continue;
            }
           System.out.println(x);
        }
    }
}

===============================================================================================================================================
    
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Break in While loop\n");
        int i = 0;
        while (i <= 10)
        {
            System.out.println(i);
            i++;
            if (i == 4)
            {
                System.out.println("Break and do not continue to 10\n");
                break;
            }
        }    
    
            
        System.out.println("Continue in While loop\n");
        int x = 0;
        while (x <= 10)
        {
            System.out.println(x);
            x++;
            if (x == 4)
            {
                System.out.println("Skip 4 and continue to 10");
                continue;
            }
        }
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Arrays\n");
        String[] cars = {"BMW","Ford","Toyota","Audi"};
        System.out.println(cars[2]);
        cars[2] = "Mazda";
        System.out.println(cars[2]);
        System.out.println(cars.length);
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("For loop with arrays\n");
        String[] cars = {"BMW","Ford","Toyota","Audi"};
        for (int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }
        System.out.println();
        System.out.println("Foreach loop with arrays\n");
        for (String i : cars)
        {
            System.out.println(i);
        }
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Real life examples for Arrays\n");
        System.out.println("Average from a list of ages");
        
        int[] ages = {10, 34, 57, 98, 69, 15};
        
        float average, sum = 0;
        int length = ages.length;
        
        for (int age : ages)
        {
            sum+= age;
        }
        
        average = sum / length;
        
        System.out.println("The average age in ages = {10, 34, 57, 98, 69, 15} is: " + average);
        System.out.println();
        
        System.out.println("Lowest from a list of ages");
        
        int[] Ages = {20, 77, 45, 12, 1, 35, 69};
        
        int lowestAge = Ages[0];
        
        for (int Age : Ages)
        {
            if (lowestAge > Age)
            {
                lowestAge = Age;
            }
        }
        
        System.out.println("The lowest age in myAges = {20, 77, 45, 12, 1, 35, 69} is: " + lowestAge);
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Multidimensional Arrays\n");
        
        System.out.println("For loop with multidimensional arrays");
        String[][] myArray = {{"Ostrich","Donkey","Bird"},{"Jiraffe","Elefant","Dog"}};
        for (int i = 0; i < myArray.length; i++)//Notice the int here
        {
            for (int j = 0; j < myArray[i].length; j++)//Notice the int here
            {
                System.out.println(myArray[i][j]);
            }
        }
        System.out.println();
        
        System.out.println("Foreach loop with multidimensional arrays");
        String[][] aniArray = {{"Whale","Rabbit","Cat"},{"Fish","Fox","Rat"}};
        for (String[] row : aniArray)//Notice the String here
        {
            for (String animal : row)//Notice the String here
            {
                System.out.println(animal);
            }
        }
    }
}

===============================================================================================================================================

public class Main
{
    static void myMethod()
    {
        System.out.println("I got executed from another method");
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Methods***");
        myMethod();
        myMethod();
        myMethod();
    }
}

===============================================================================================================================================

public class Main
{
    static void myMethod(String firstName)
    {
        System.out.println(firstName + " Davis");
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Method Parameters***");
        myMethod("Jhon");
        myMethod("Mary");
        myMethod("Shaniqua");
    }
}

===============================================================================================================================================

public class Main
{
    static void myMethod(String firstName, int age)
    {
        System.out.println(firstName + " is " + age + " years old");
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Multiple Parameters***");
        myMethod("Jhon", 25);
        myMethod("Mary", 35);
        myMethod("Shaniqua", 45);
    }
}

===============================================================================================================================================

public class Main
{
    static void checkAge(int age)
    {
        if (age < 18)
        {
            System.out.println("You cannot vote");
        }
        else
        {
            System.out.println("You can vote");
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Method with If***");
        checkAge(17);
    }
}

===============================================================================================================================================

public class Main
{
    static int numMethod(int num)
    {
        return 5 + num;
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Return value - One Parameter***\n");
        System.out.println(numMethod(3));
    }
}

===============================================================================================================================================

public class Main
{
    static int numMethod(int x, int y)
    {
        return x + y;
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Return value - Two Parameters and Arguments***\n");
        //System.out.println(numMethod(3, 6)); Just this line is valid
        
        int result = numMethod(3, 6);//Typing this
        System.out.println(result);//and this is recommended and makes the code easier to read and manage
    }
}

===============================================================================================================================================

public class Main
{
    public static int additionMethod(int x, int y)
    {
        return x + y;
    }
    
    //Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.

    public static double additionMethod(double x, double y)
    {
        return x + y;
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Method overloading***\n");
        int myInt = additionMethod(5, 3);
        System.out.println("Method overloading integer result: " + myInt);
        
        double myDouble = additionMethod(5.5, 3.3);
        System.out.println("Method overloading double result: " + myDouble);
    }
}

===============================================================================================================================================

public class Main
{
    static int varGlobal = 100;//This is a global variable. Global variables are available from within any scope, global and local
    
    public static void myFunc()
    {
        int varLocal = 10;/*This is a local variable. A local variable cannot be used outside the function it belongs to (in this case, myFunc)
    If you try to access it outside the function, an error occurs*/
        System.out.println("Local variable: " + varLocal);
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Local and Global variables***\n");
        myFunc();
        System.out.println("Global variable: " + varGlobal);
        
    /* When doing this:
    
    public class Main
{
    int varGlobal = 100;
    
    This is received:
    
    ERROR!
/tmp/nfNWXYJOUI/Main.java:14: error: non-static variable varGlobal cannot be referenced from a static context
        System.out.println("Global variable: " + varGlobal);
                                                 ^
1 error

    ***Explanation***
    Static methods are tied to the class itself, so they don't know which instance of a non-static variable to use. Non-static variables are unique to each instance of a class, and depend on class instances to store and manipulate data. 

    ***Possible solutions***
    To fix this error, you can:
    - Create an instance of the class 
    - Make the class member static 
    - Add the static keyword to the object 
    - Have all members non-static and instantiate the class
    
    The Java compiler will include the exact location of the variable or method in the error message */    
    }
}

===============================================================================================================================================

public class Main
{
    public static int sum(int numer)
{
    if (numer > 0)
    {
        return numer + sum(numer - 1);
    }
    else
    {
        return 0;
    }
}

/* When the sum() function is called, it adds parameter numer to the sum of all numbers smaller than numer and returns the result. 
When numer becomes 0, the function just returns 0. When running, the program follows these steps:

10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

Since the function does not call itself when numer is 0, the program stops there and returns the result */

    public static void main(String[] args)
    {
        System.out.println("***Recursion in Functions***\n");
        int result = sum(10);
        System.out.println(result);
    }
}
/* The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never terminates, 
or one that uses excess amounts of memory or processor power. 
However, when written correctly recursion can be a very efficient and mathematically-elegant approach to programming.*/

===============================================================================================================================================

public class Main
{
    public static int sum(int start, int end)
    {
        if (end > start)
        {
            return end + sum(start, end - 1);
        }
        else
        {
            return end;
        }
    }
    /* The program does this:

    10 + sum(5, 9)
    10 + ( 9 + sum(8) )
    10 + ( 9 + ( 8 + sum(7) ) )
    ...
    10 + 9 + 8 + 7 + 6 + 5  >> It stops at 5 since we have specified a range from 5 to 10*/
    
    public static void main(String[] args)
    {
        System.out.println("Another example on Function Recursion and Halting\n")
        int result = sum(5, 10);
        System.out.println(result);
    }
    //In this example, the function adds a range of numbers between a start and an end. The halting condition for this recursive function is when end is not greater than start
}

===============================================================================================================================================

public class Main
{
    int x = 5;
    
    public static void main(String[] args)
    {
        System.out.println("***OOP - Classes and Objects***\n");
        Main myObject = new Main();
        System.out.println(myObject.x);
    }
}

===============================================================================================================================================

public class Main
{
    int x = 5;
    int y = 10;
    
    public static void main(String[] args)
    {
        System.out.println("***Multiple objects of a class***\n");
        Main myObject1 = new Main();
        Main myObject2 = new Main();

        System.out.println(myObject1.x);
        System.out.println(myObject2.y);
    }
}

===============================================================================================================================================

public class Main
{
    int x = 5;
    int y = 10;
}

class Second
{
    public static void main(String[] args)
    {
        System.out.println("***Multiple classes***\n");
        Main myObject1 = new Main();
        Main myObject2 = new Main();

        System.out.println(myObject1.x);
        System.out.println(myObject2.y);
    }
}

===============================================================================================================================================

public class Main
{
    int x = 5;
    
    public static void main(String[] args)
    {
        System.out.println("***Class attributes - Accessing them***\n");
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}

===============================================================================================================================================

public class Main
{
    int x;
    
    public static void main(String[] args)
    {
        System.out.println("***Class attributes - Modifying them***\n");
        Main myObj = new Main();
        myObj.x = 40;
        System.out.println(myObj.x);
    }
}

===============================================================================================================================================

public class Main
{
    int x = 10;
    
    public static void main(String[] args)
    {
        System.out.println("***Class attributes - Override them***\n");
        Main myObj = new Main();
        myObj.x = 69;
        System.out.println(myObj.x);
    }
}

===============================================================================================================================================

public class Main
{
    final int x = 20;//Final equal constant(cannot be changed)
    
    public static void main(String[] args)
    {
        System.out.println("***Class attributes - Cannot override them***\n");
        Main myObj = new Main();
        myObj.x = 35;// will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}

===============================================================================================================================================

public class Main
{
    int x =5;
    
//Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged

    public static void main(String[] args)
    {
        System.out.println("***Multiple objects on a class ***\n");
        Main myObj = new Main(); //Object 1
        Main myObj2 = new Main(); //Object 2
        myObj2.x = 25;
        
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
    }
}

===============================================================================================================================================

public class Main
{
    String firstName = "Mark"; //Attribute
    String lastName = "Twain"; //Attribute
    int age = 58; //Attribute
    
//Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged

    public static void main(String[] args)
    {
        System.out.println("***Multiple Attributes on a class ***\n");
        Main myObj = new Main();

        System.out.println("Full name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Age: " + myObj.age);
    }
}

===============================================================================================================================================

public class Main
{
    static void myMethod()
    {
        System.out.println("Hello Java!");
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Class Methods***\n");
        myMethod();
    }
}

===============================================================================================================================================

public class Main
{
    static void myStaticMethod()
    {
        System.out.println("Static methods can be called without creating objects\n");
    }
    
    public void myPublicMethod()
    {
        System.out.println("Public methods must be called by creating objects\n");
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Static vs Public Methods***\n");
        myStaticMethod();
        //myPublicMethod(); If called in this position, it will give an error
        
        Main myObj = new Main();
        myObj.myPublicMethod();
    }
}

===============================================================================================================================================

public class Main
{
    public void fullThrottle()//Method
    {
        System.out.println("The car is going as fas as it can!");
    }
    
    public void speed(int maxSpeed)//Method with Parameter
    {
        System.out.println("Max speed is: " + maxSpeed);
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Access methods with an object***\n");
        Main myCar = new Main();//Create object
        
        myCar.fullThrottle();//Call method
        myCar.speed(200);//Call method
    }
}

===============================================================================================================================================

public class Main 
{
  public void fullThrottle() 
  {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}

class Second {
  public static void main(String[] args) 
  {
    System.out.println("***Multiple classes***\n")
    Main myCar = new Main();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

===============================================================================================================================================

public class Main //Class
{
    int x;//Attribute
    
    public Main()//Constructor
    {
        x = 5;//Initial value
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Constructors***\n");
        Main myObj = new Main();//Call constructor
        System.out.println(myObj.x);//Print value of 5
    }
}

/*Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 
However, then you are not able to set initial values for object attributes.*/

===============================================================================================================================================

public class Main
{
    String brandName;
    String modelName;
    String modelColor;
    int modelYear;
    
    public Main(String brand, String model, String color, int year)
    {
        brandName = brand;
        modelName = model;
        modelColor = color;
        modelYear = year;
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Constructors with Parameters***\n");
        Main myCar = new Main("Ford", "Mustang", "Yellow", 1969);
        System.out.println(myCar.brandName + " " + myCar.modelName + ", " + myCar.modelColor + ", " + myCar.modelYear);
    }
}

===============================================================================================================================================

public class Main
{
    final int x = 10;//attribute cannot be modified
    final double PI = 3.14;
    
    public static void main(String[] args)
    {
        System.out.println("***Java Modifiers - Final***\n");
        Main myObj = new Main();
        //myObj.x = 50; >> error: cannot assign a value to final variable
        //myObj.PI = 2.50; >> error: cannot assign a value to final variable
        System.out.println(myObj.x);
        System.out.println(myObj.PI);
    }
}

===============================================================================================================================================

public class Main
{
    static void myStaticMethod()
    {
        System.out.println("Static methods can be called without creating objects of the class\n");
    }
    
    public void myPublicMethod()
    {
        System.out.println("Public methods must be called by creating objects\n");
    }
    
     public static void main(String[] args)
    {
        System.out.println("***Java Modifiers - Static vs Public***\n");
        myStaticMethod();//Static can be called as simple as this
        
        Main myObj = new Main();//Public requires some extra steps
        myObj.myPublicMethod();
    }
}

===============================================================================================================================================

abstract class Main
{
    public String fName = "John";
    public int age = 24;
    public abstract void study();//Abstract method
}

class Student extends Main
{
    public int gradYear = 2018;
    public void study()//Body of abstract method is provided here
    {
        System.out.println("Studying abstract methods all day long");
    }
}

//An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass

class Second
{
    public static void main(String[] args)
    {
        System.out.println("***Java Modifiers - Abstract***\n");
        Student myObj = new Student();
        System.out.println("First name: " + myObj.fName);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation year: " + myObj.gradYear);
        myObj.study();
    }
}

===============================================================================================================================================

public class Person/*This must done/created/written on a separate file due to message:

error: class Person is public, should be declared in a file named Person.java
public class Person*/

{
    private String name;//Variable
    
    public String getName()//Variable with caps
    {
        return name;
    }
    
    public void setName(String newName)//Variable with caps and method with parameter
    {
        this.name = newName;
        //The "this" keyword is used to refer to the current object/variable
    }
}

/*The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case*/

public class Main

{
    public static void main(String[] args)
    {
        System.out.println("***Encapsulation***/n");
        Person myObj = new Person();
        myObj.setName("John");//This is done differently from usual when calling method
        System.out.println(myObj.getName);//Pay attention to this as well
    }
}
/*Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data*/

===============================================================================================================================================

//import java.util.*; This imports all classes from within
import java.util.Scanner;//Scanner is a simple, versatile, easy-to-use class that makes user input in Java relatively straightforward

class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Java Packages/API - Scanner class***\n");
        
        Scanner myObj = new Scanner(System.in);//System.in is used to read user input and must be passed as an argument to the Scanner class
        System.out.println("Enter username: ");
        
        String userName = myObj.nextLine();//Use the Scanner’s next () or nextLine() methods to convert user input into the appropriate type
        System.out.println("Username is: " + userName);
    }
}

===============================================================================================================================================

class Vehicle
{
    protected String brand = "Ford";//Attribute
    public void honk()//Method
    {
        System.out.println("Tuuuu tuuuu");
    }
}

class Main extends Vehicle
{
    private String model = "Mustang";//Attribute
    public static void main(String[] args)
    {
        System.out.println("***Inheritance***\n");
        Main myCar = new Main();//Creating object out of Main class
        myCar.honk();//Invoking method
        System.out.println(myCar.brand + " " + myCar.model);
    }
}

/* The final Keyword

If you don't want other classes to inherit from a class, use the final keyword.

If you try to access a final class, Java will generate an error:

final class Vehicle 
{
  ...
}

class Car extends Vehicle 
{
  ...
}

The output will be something like this:

Main.java:9: error: cannot inherit from final Vehicle
class Main extends Vehicle {
                  ^
1 error)*/    

===============================================================================================================================================

class Animal
{
    public void animalSound()
    {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("The dog goes: guau guau!");
    }
}

class Pig extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig goes: oink oink!");
    }
}

class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Polymorphism***\n");
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myPig = new Pig();
        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
        
    }
}
/*Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.*/

===============================================================================================================================================

class outerClass
{
    int x = 10;
    /* If you don't want outside objects to access the inner class, declare the class as private
    If you try to access a private inner class from an outside class, an error occurs:
    error: outerClass.innerClass has private access in outerClass
    
    private class innerClass */
    class innerClass 
    {
        int y = 5;
    }
}

class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Inner/Nested classes***\n");
        outerClass myOut = new outerClass();
        outerClass.innerClass myInn = myOut.new innerClass();
        System.out.println("Outer: " + myOut.x + " and inner: " + myInn.y);
    }
}

===============================================================================================================================================

class outerClass
{
    int x = 10;
    static class innerClass//Here static means that you can access inner class without creating an object of the outer class
    {
        int y = 5;
    }
}

///Note: just like static attributes and methods, a static inner class does not have access to members of the outer class
    
class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Static Inner/Nested classes***\n");
        //outerClass myOut = new outerClass();This is not needed due to static class
        outerClass.innerClass myInn = new outerClass.innerClass();//Declaration is also different
        System.out.println("Inner: " + myInn.y);
    }
}

===============================================================================================================================================

class outerClass
{
    int x = 10;
    class innerClass
    {
        public int myInnerMethod()
        {
            return x;//Outer variable is called inside inner method
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Access outer class from inner class***\n");
        outerClass myOut = new outerClass();
        outerClass.innerClass myInn = myOut.new innerClass();
        System.out.println("Inner method: " + myInn.myInnerMethod());
    }
}

===============================================================================================================================================

abstract class Animal//Abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class)
{
    public abstract void animalSound();//Abstract method (non access modifier) can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from)
    public void sleep()//Regular method
    {
        System.out.println("Zzzzz");
    }
}

class Pig extends Animal//Pig class inherits from Animal class
{
    public void animalSound()//Body of animalSound is provided here
    {
        System.out.println("The pig goes: oink oink");
    }
}

class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Abstraction***\n");
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

/* Why And When To Use Abstract Classes and Methods?

To achieve security - hide certain details and only show the important details of an object
Note: Abstraction can also be achieved with Interfaces */

===============================================================================================================================================

interface Animal
{
    public void animalSound();//Methods do not have body 
    public void sleep();
}

class Pig implements Animal//Pay attention to implements instead of extends
{
    public void animalSound()//Body is implemented here
    {
        System.out.println("The pig goes: oink oink");
    }
    
    public void sleep()
    {
        System.out.println("Zzzzzzzz");
    }
}

class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Interfaces - Abstraction***\n");
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

/* Notes on Interfaces:

Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" 
object in the Main Class)

Interface methods do not have a body - the body is provided by the "implement" class

On implementation of an interface, you must override all of its methods

Interface methods are by default abstract and public

Interface attributes are by default public, static and final

An interface cannot contain a constructor (as it cannot be used to create objects)

Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with 
interfaces, because the class can implement multiple interfaces. 

Note: To implement multiple interfaces, separate them with a comma.

class DemoClass implements FirstInterface, SecondInterface {...} */

===============================================================================================================================================

public class Main
{
    enum Level
    {
        LOW,
        MEDIUM,
        HIGH
    }
    
    public static void main(String[] args)
    {
        System.out.println("***Enums - enum inside a class***\n");
        Level myLevel = Level.MEDIUM;
        System.out.println(myLevel);
    }
}

===============================================================================================================================================

enum Level
{
    LOW,
    MEDIUM,
    HIGH
}


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Enum in a switch statement***\n");
        Level myLevel = Level.HIGH;
        
        switch(myLevel)
        {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }    
    }
}

===============================================================================================================================================

enum Level
{
    LOW,
    MEDIUM,
    HIGH
}


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Loop through an Enum***\n");
        for (Level myLevel : Level.values())
        {
            System.out.println(myLevel);
        }
        
    }
}

/* Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.*/

===============================================================================================================================================

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);//Invokes Scanner class and assigns an object
        System.out.println("Please enter name, age and salary: (hit Enter key after each)");
        
        String name = userInput.nextLine();//String input
        int age = userInput.nextInt();//Interger input
        double salary = userInput.nextDouble();//Double input
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

===============================================================================================================================================

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects */

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("****Date and Time***\n");
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
        
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String dataFormatted = currentDateTime.format(DTFormat);
        System.out.println("Formatted date and time: " + dataFormatted);
    }
}

/* The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. For example:

Value	Example	Tryit
yyyy-MM-dd	"1988-09-29"	
dd/MM/yyyy	"29/09/1988"	
dd-MMM-yyyy	"29-Sep-1988"	
E, MMM dd yyyy	"Thu, Sep 29 1988" */

===============================================================================================================================================

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***ArrayList***\n");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");//Add item with Add method
        cars.add("Suzuki");
        cars.add(0,"Honda");//Add item using index
        
        System.out.println(cars);
        System.out.println(cars.get(1));//Access an item with Get method
        cars.set(2,"Mazda");//Susbstitute item with Set method
        System.out.println(cars);
        cars.remove(0);//Remove method using index
        System.out.println(cars);
        System.out.println(cars.size());//Get size
        cars.clear();//Delete ArrayList contents
        System.out.println(cars);
    }
}

/*The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different*/

===============================================================================================================================================

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***For loop in ArrayList***\n");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");//Add item with Add method
        cars.add("Suzuki");
        cars.add(0,"Honda");//Add item using index

        for (int i = 0; i < cars.size(); i++)//Use the size() method to specify how many times the loop should run
        {
            System.out.println(cars.get(i));
        }
    }
}

===============================================================================================================================================


import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Foreach loop in ArrayList***\n");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");//Add item with Add method
        cars.add("Suzuki");
        cars.add(0,"Honda");//Add item using index

        for (String i : cars)
        {
            System.out.println(i);
        }
    }
}

===============================================================================================================================================

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Foreach loop in ArrayList with integers***\n");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);//Add item with Add method
        numbers.add(20);
        numbers.add(0,30);//Add item using index
        numbers.add(80);
        numbers.add(60);
        numbers.add(50);

        for (int i : numbers)
        {
            System.out.println(i);
        }
    }
}

===============================================================================================================================================

import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Foreach loop in ArrayList sorted***\n");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");//Add item with Add method
        cars.add("Suzuki");
        cars.add(0,"Honda");//Add item using index
        cars.add("Aston Martin");
        cars.add("Chevrolet");
        Collections.sort(cars);

        for (String i : cars)
        {
            System.out.println(i);
        }
    }
}

===============================================================================================================================================

import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Foreach loop in ArrayList sorted integers***\n");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);//Add item with Add method
        numbers.add(20);
        numbers.add(0,30);//Add item using index
        numbers.add(80);
        numbers.add(60);
        numbers.add(50);
        Collections.sort(numbers);

        for (int i : numbers)
        {
            System.out.println(i);
        }
    }
}

===============================================================================================================================================

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Lexus");//This method is shared between ArrayLists and LinkedLists
        cars.add("Bentley");
        cars.add(1,"Rolls Royce");
/*
LinkedList Methods
For many cases, the ArrayList is more efficient as it is common to need access to random items in the list, but the LinkedList provides several methods to do certain operations more efficiently:

Method	Description	Try it
addFirst()	Adds an item to the beginning of the list	
addLast()	Add an item to the end of the list	
removeFirst()	Remove an item from the beginning of the list	
removeLast()	Remove an item from the end of the list	
getFirst()	Get the item at the beginning of the list	
getLast()	Get the item at the end of the list*/

        cars.addFirst("Aston Martin");//This method is exclusive of LinkedLists
        cars.addLast("Mercedes Benz");
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
    }
}
/*
ArrayList vs. LinkedList

The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. This means that you can add items, change items, remove items and clear the list in the same way.

However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

How the ArrayList works
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

How the LinkedList works
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

When To Use
Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.*/

===============================================================================================================================================
    
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Sorting a list***\n");
        
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Maseratti");
        cars.add("Lamborgini");
        cars.add("Jaguar");
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(69);
        numbers.add(95);
        numbers.add(38);
        
        System.out.println("Sort from a to z / ascending order");
        Collections.sort(cars);
        
        for(String i : cars)
        {
            System.out.println(i);
        }
        System.out.println();

        Collections.sort(numbers);
        for(int x : numbers)
        {
            System.out.println(x);
        }
        System.out.println();

        
        System.out.println("Sort from z to a / descending order");
        Collections.sort(cars, Collections.reverseOrder());
        
        for(String i : cars)
        {
            System.out.println(i);
        }
        System.out.println();
       
        Collections.sort(numbers, Collections.reverseOrder());
        for(int x : numbers)
        {
            System.out.println(x);
        }
    }
}

===============================================================================================================================================

