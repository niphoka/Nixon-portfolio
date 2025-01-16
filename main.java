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

import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("****Hashmaps***\n");
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Costa Rica", "San Jose");
        capitalCities.put("USA", "Washington DC");
        System.out.println("Hashmap: " + capitalCities + "\n");
        
        System.out.println("Get capital city of one country: " + capitalCities.get("Costa Rica") + "\n");
        
        capitalCities.remove("England");
        System.out.println("Remove England from hashmap: " + capitalCities + "\n");
        
        //capitalCities.clear() Deletes all contents, leaving an empty hashmap
        
        System.out.println("Size of hashmap: " + capitalCities.size() + "\n");
        
        System.out.println("Foreach loop to show keys");
        for (String i : capitalCities.keySet())
        {
            System.out.println(i);
        }
        System.out.println("\n");
        
        System.out.println("Foreach loop to show values");
        for (String x : capitalCities.values())
        {
            System.out.println(x);
        }
        System.out.println("\n");
        
        System.out.println("Foreach loop to show both, keys and values");
        for (String j : capitalCities.keySet())
        {
            System.out.println("Key: " + j + " - " + "Value: " + capitalCities.get(j));
        }
    }
}

===============================================================================================================================================

import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("****Hashmap example***\n");
        HashMap<String, Integer> names = new HashMap<String, Integer>();
        
        names.put("Rob", 32);
        names.put("Alexa", 29);
        names.put("Lebron", 45);
        names.put("Jessiquanda", 22);
        System.out.println("Hashmap with string as key and integer as value:\n" + names + "\n");
        
        System.out.println("Foreach loop to show both, keys and values");
        for (String j : names.keySet())
        {
            System.out.println("Key: " + j + " - " + "Value: " + names.get(j));
        }
    }
}

===============================================================================================================================================

import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***HashSets***\n");
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Land Rover");
        cars.add("BMW");
        cars.add("Chevrolet");
        System.out.println(cars + "\n");
        
        //cars.remove("Audi");
        //cars.clear();

        System.out.println("Check if cars HashSet has BMW: " + cars.contains("BMW"));
        System.out.println("Check the size of cars HashSet: " + cars.size() + "\n");
        
        System.out.println("For each loop on HashSet");
        for (String i : cars)
        {
            System.out.println(i);
        }
    }
}

===============================================================================================================================================

import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***HashSet example***\n");
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);

        for (int i = 1; i <= 10; i++)
        {
            if (numbers.contains(i))
            {
                System.out.println(i + " was found in the set");
            }
            else
            {
                System.out.println(i + " was not found");
            }
        }
    }
}   

===============================================================================================================================================

import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Iterators***\n");
        ArrayList<String> pet = new ArrayList<String>();
        pet.add("dog");
        pet.add("cat");
        pet.add("turtle");
        pet.add("hamster");
        
        Iterator<String> iter = pet.iterator();
        
        // System.out.println("Prints first item of ArrayList via iterator using next() method: " + iter.next() + "\n");
        
        while (iter.hasNext())//Returns true if there are more elements in the iteration	
        {
            System.out.println(iter.next());//Returns the next element in the iteration	
        }
    }
}
    
===============================================================================================================================================

import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Iterators example***\n");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(5);
        numbers.add(90);
        
        Iterator<Integer> iter = numbers.iterator();
        
        while (iter.hasNext())//Returns true if there are more elements in the iteration	
        {
            //Integer i = iter.next();This does the same as below
            int item = iter.next();//Returns the next element in the iteration	

            if (item > 10)
            {
                iter.remove();
            }
        }
        System.out.println(numbers);
    }
}

/*Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing 
size at the same time that the code is trying to loop.*/

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Wrapper classes***\n");
        
        //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

        Integer myNum = 10;
        Double myDou = 5.99;
        Character myChar = 'Z';
        System.out.println(myNum);
        System.out.println(myDou);
        System.out.println(myChar + "\n");
        
        System.out.println("Print using intValue() method: " + myNum.intValue());
        System.out.println("Print using doubleValue() method: " + myDou.doubleValue());
        System.out.println("Print using charValue() method: " + myChar.charValue() + "\n");
        
        Integer myInt = 1300;
        String myStr = myInt.toString();
        System.out.println("Casting/changing wrapper object, 1300 as integer, to string to then get its size: " + myStr.length());
    }
}

===============================================================================================================================================

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Exceptions - Try/Catch/Finally***\n");
        try
        {
            int[] myArray = {1,2,3};
            System.out.println(myArray[10]);/*Without try, this will give error:
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at Main.main*/
        }
        catch (Exception ex)
        {
            System.out.println("Error: Index out of bounds");
        }
        finally
        {
            System.out.println("Try/Catch/Finally has ended");
        }
    }
}
/*The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs*/

===============================================================================================================================================

public class Main
{
    static void checkAge(int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("Age less than 18");
        }
        else
        {
            System.out.println("Age is old enough");
        }
    }
    
    /*The throw statement allows you to create a custom error.

The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc*/

    public static void main(String[] args)
    {
        System.out.println("***Exceptions - Throw***\n");
        checkAge(15);
    }
    /*ERROR!
Exception in thread "main" java.lang.ArithmeticException: Age less than 18
	at Main.checkAge(Main.java:7)
	at Main.main(Main.java:17)*/
}

===============================================================================================================================================

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***RegEx***\n");
        /* Flags in the compile() method change how the search is performed. Here are a few of them:

Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.
Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet */

        Pattern pat = Pattern.compile("Maya|Luna|Bonete", Pattern.CASE_INSENSITIVE);
            // Find a match for any one of the patterns separated by "|"
        Matcher mat = pat.matcher("My child is called Maya mom!");
        
        /*In this example, The words "Maya, or Luna, or Bonete" are being searched for in a sentence.

First, the pattern is created using the Pattern.compile() method. The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that the search should be case-insensitive. The second parameter is optional.

The matcher() method is used to search for the pattern in a string. It returns a Matcher object which contains information about the search that was performed.

The find() method returns true if the pattern was found in the string and false if it was not found.*/

        
        // Pattern pat = Pattern.compile("[0-9]");
            // Find one character from the range 0 to 9
        // Matcher mat = pat.matcher("7 is my favorite number");
        
        // Pattern pat = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE); 
            // Find one character from the options between the brackets
        // Matcher mat = pat.matcher("Hello world from Java"); 
        
        // Pattern pat = Pattern.compile("m+", Pattern.CASE_INSENSITIVE); 
            // Matches any string that contains at least one m
        // Matcher mat = pat.matcher("My child is called Maya mom!"); 
        
        // Pattern pat = Pattern.compile("m{1,3}", Pattern.CASE_INSENSITIVE);
            // Matches any string that contains a sequence of X to Y n's
        // Matcher mat = pat.matcher("My child is called Maya mom!");        
        
        boolean matchFound = mat.find();
        if (matchFound)
        {
            System.out.println("Match found");
        }
        else
        {
            System.out.println("No match found");
        }
    }
}

===============================================================================================================================================

    //Threads allows a program to operate more efficiently by doing multiple things at the same time.

    // Threads can be used to perform complicated tasks in the background without interrupting the main program.

public class Main extends Thread
{
    public static void main(String[] args)
    {
        System.out.println("***Threads****\n");
        Main thread = new Main();
        thread.start();
        System.out.println("This code is running outside of the thread");
    }
    
    // A thread can be created by extending the Thread class and overriding its run() method
    
    public void run()
    {
        System.out.println("This code is running in a thread");
    }
}

===============================================================================================================================================

public class Main implements Runnable
{
    public static void main(String[] args)
    {
        System.out.println("***Threads with Runnable interface***\n");
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code us running outside of the thread");
    }
    
    public void run()
    {
        System.out.println("This code is running in a thread");
    }
}

/* Differences between "extending" and "implementing" Threads

The major difference is that when a class extends the Thread class, you cannot extend any other class, 
but by implementing the Runnable interface, it is possible to extend from another class as well, like: 
class MyClass extends OtherClass implements Runnable. */

===============================================================================================================================================

/*Concurrency Problems
Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run. 
When the threads and main program are reading and writing the same variables, the values are unpredictable. 
The problems that result from this are called concurrency problems.*/

public class Main extends Thread
{
    public static int amount = 0;
    public static void main(String[] args)
    {
        Main thread = new Main();
        thread.start();
        
        /*To avoid concurrency problems, it is best to share as few attributes between threads as possible. 
	If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether 
 	the thread has finished running before using any attributes that the thread can change.*/
        
        while (thread.isAlive())//Without this, values are unpredictable (unordered)
        {
            System.out.println("Waiting...");
        }
        
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    
    public void run()
    {
        amount++;
    }
}	

===============================================================================================================================================

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        /* A lambda expression is a short block of code which takes in parameters and returns a value. 
	Lambda expressions are similar to methods, 
 	but they do not need a name and they can be implemented right in the body of a method */
	    
        System.out.println("***Lambda***\n");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(6);
        numbers.add(9);
        numbers.add(3);
        numbers.add(1);
        numbers.forEach((n) -> {System.out.println(n * n);});//For each n in numbers, print the result of multiplying n * n
	// -> symbol signifies lambda usage
    }
}

===============================================================================================================================================

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main
{
    public static void main(String[] args)
    {
        /* Lambda expressions can be stored in variables if the variable's type is an interface which has only one method. The lambda expression should have the same number of parameters and the same return type as that method. Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util package) used by lists */
        
        System.out.println("***Lambda Consumer interface***\n");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(6);
        numbers.add(9);
        numbers.add(3);
        numbers.add(1);
        Consumer<Integer> consumer = (n) -> {System.out.println(n * n);};
        numbers.forEach(consumer);
    }
}

===============================================================================================================================================

interface StringFunc
{
    String run(String str);
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Lambda as a parameter on a method***\n");
        StringFunc exclaim = (s) -> s + "!";
        StringFunc ask = (s) -> s + "?";
        printFormat("Hello", exclaim);
        printFormat("Hello", ask);//This method will be used as a class below
    }
    
    //To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type. Calling the interface's method will run the lambda expression
    
    public static void printFormat(String str, StringFunc format)
    {
        String result = format.run(str);
        System.out.println(result);
    }
}
	
===============================================================================================================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*In the List Sorting Chapter, you learned how to sort lists alphabetically and numerically, but what if the list has objects in it?

To sort objects you need to specify a rule that decides how objects should be sorted. For example, if you have a list of cars you might want to sort them by year, the rule could be that cars with an earlier year go first.

The Comparator and Comparable interfaces allow you to specify what rule is used to sort objects.

Being able to specify a sorting rule also allows you to change how strings and numbers are sorted.*/

class Car
{
    public String brand;
    public String model;
    public int year;
    
    public Car(String b, String m, int y)
    {
        brand = b;
        model = m;
        year = y;
    }
}

/*An object that implements the Comparator interface is called a comparator.

The Comparator interface allows you to create a class with a compare() method that compares two objects to decide which one should go first in a list.

The compare() method should return a number which is:

Negative if the first object should go first in a list.
Positive if the second object should go first in a list.
Zero if the order does not matter.*/

class sortByYear implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        Car a = (Car) obj1;
        Car b = (Car) obj2;
        
        if (a.year < b.year) return -1;
        if (a.year > b.year) return 1;
        return 0;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Advanced Sorting - Comparator***\n");
        ArrayList<Car> myCar = new ArrayList<Car>();
        myCar.add(new Car ("Toyota","Rav4",2018));
        myCar.add(new Car ("Ford","Mustang",1970));
        myCar.add(new Car ("Honda","CRV",2000));
        
        Comparator comp = new sortByYear();
        Collections.sort(myCar, comp);
        
        for (Car c : myCar)
        {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
        
    }
}

===============================================================================================================================================

import java.util.ArrayList;
import java.util.Collections;

class Car
{
    public String brand;
    public String model;
    public int year;
    
    public Car(String b, String m, int y)
    {
        brand = b;
        model = m;
        year = y;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Advanced Sorting - Lambda instead of Comparator***\n");
        ArrayList<Car> myCar = new ArrayList<Car>();
        myCar.add(new Car ("Toyota","Rav4",2018));
        myCar.add(new Car ("Ford","Mustang",1970));
        myCar.add(new Car ("Honda","CRV",2000));
        
        /*To make the code shorter, the comparator can be replaced with a lambda expression which has the same arguments and return value as the compare() method */
        
        Collections.sort(myCar, (obj1, obj2) -> { //Lambda used here to simplify code
            Car a = (Car) obj1;
            Car b = (Car) obj2;
            
            if (a.year < b.year) return -1;
            if (a.year > b.year) return 1;
            return 0; });
        
        for (Car c : myCar)
        {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}	
	
===============================================================================================================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class sortEvenFirst implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        Integer a = (Integer) obj1;
        Integer b = (Integer) obj2;
        
        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;
        
        if (aIsEven == bIsEven) // If both numbers are even or both are odd then use normal sorting rules
        {
            if (a > b) return -1;
            if (a < b) return 1;
            return 0;
        }
        else
        {
            if (aIsEven) // If a is even then it goes first, otherwise b goes first
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***Advanced Sorting - Comparator special rules***\n");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(33);
        numbers.add(20);
        numbers.add(77);
        numbers.add(84);
        numbers.add(13);
        numbers.add(6);
        
        Comparator comp = new sortEvenFirst();
        Collections.sort(numbers, comp);
        
        for (int i : numbers)
        {
            System.out.println(i);
        }
    }
}

===============================================================================================================================================


