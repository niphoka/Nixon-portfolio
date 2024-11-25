using System;
namespace firstApp
{ 
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine ("Hola C#, ");
            Console.WriteLine ("Hola Python");
            
            string personName = "Bob";
            Console.WriteLine(personName);
            
            int myNum = 8;
            Console.WriteLine(myNum);
            
            double difNum = 12.5;
            Console.WriteLine("I have " + difNum + " cents in my pocket");
            
            char difChar = 'D';
            Console.WriteLine(difChar);
            
            bool difBool = false;
            Console.WriteLine(difBool);
            
            const double difPi = 3.14159;
            Console.WriteLine(difPi);
            
            Console.WriteLine(difPi + difNum);
            Console.WriteLine(difChar + personName);
        }
    }
}    





using System;

namespace secondApp
{
    class Program
    {
        static void Main(string [] args)
        {
        //Implicit casting - from less to more    
        int myInt = 5;
        double myDoub = myInt;
        Console.WriteLine(myDoub);
        
        //Explicit casting - from more to less
        double yourDoub = 9.87;
        int yourInt = (int) yourDoub;
        Console.WriteLine(yourInt);
        Console.WriteLine(yourDoub);
        
        
        int dNum = 10;
        double dDouble = 15.6;
        bool dBool = true;
        
        Console.WriteLine("From integer to string " + Convert.ToString(dNum));
        Console.WriteLine("From integer to double " + Convert.ToDouble(dNum));
        Console.WriteLine("From double to integer " + Convert.ToInt32(dDouble));
        Console.WriteLine("From boolean to string " + Convert.ToString(dBool));
        
        }
    }
}




using System;

namespace thirdApp
{
    class Program
    {
        static void Main(string[] args)
        {
            //Program to calcultate total price
            int items;
            double costPerItem;
            double totalCost;
            char currency = '$';
            
            Console.WriteLine("Welcome to the cost calculator");
            Console.WriteLine("Please enter the amount of items: ");
            items = Convert.ToInt32(Console.ReadLine()); /*This conversion is done since Console.ReadLine returns a string, 
            no matter the data type entered*/

            /* The error message seen, if the conversion is not done, is this:

            ===Cannot implicitly convert type 'string' to 'int'=== */

            /* Note on Convert.ToInt32: Please be aware that numbers that are too high, like adding 5000 items times $50.99 will result in $0
            this is cause the number is too high to be stored as an integer, and so Convert.ToInt64 is required, but before that, 
            the Long type number must be converted to double, which is not done on this code for now*/
            
            Console.WriteLine("Please enter the cost per item: ");
            costPerItem = Convert.ToDouble(Console.ReadLine());/*Remember to convert from String to the data type you need*/
            
            totalCost = items * costPerItem;
            Console.WriteLine("Please wait a moment............");
            Console.WriteLine("The total cost for all items is: " + currency + totalCost);
            
        }
    }
}




using System;

namespace fourthApp
{
    class Program
    {
        static void Main(string [] args)
        {
            Console.WriteLine("***Arithmetic operators***");
            Console.WriteLine("x equals 8 and y equals 4");
            int x=8;
            int y=4;
            Console.WriteLine("Addition of x and y is: " + (x+y));
            Console.WriteLine("Substraction is: " +  (x-y));
            Console.WriteLine("Division is: " + (x/y));
            Console.WriteLine("Modulus is: " + (x%y));
            Console.WriteLine("Increment is: " + (++x));
            Console.WriteLine("Decrement is: " + (--y)) ;
            Console.WriteLine("\n\n");

            Console.WriteLine("***Assignment operators***");
            int a = 5;
            int b = 3;
            Console.WriteLine("a incremented: " + (a+=3));
            Console.WriteLine("b decremented: " + (b-=1));
            Console.WriteLine("a modulus: " + (a%=2));
            
            int c = 7;
            int d = 4;
            Console.WriteLine("Bitwise |= and ^= need to be studied deeper later");
            Console.WriteLine(c);
            
            Console.WriteLine((a |= 4));
            Console.WriteLine((a ^= 4));
            Console.WriteLine();
            
            Console.WriteLine("***Comparison Operators***");
            int e=3;
            int f=6;
            int g=9;
            
            Console.WriteLine("e is greater than g: " + (e>g));
            Console.WriteLine();
            Console.WriteLine("***Logical Operators***");
            Console.WriteLine("f==e && g>f: " + (f==e && g>f));
            Console.WriteLine("f==e || g>f: " + (f==e || g>f));

            
            
        }
    }
}





using System;

namespace fifthApp
{
    class Program
    {
        static void Main(string [] args)
        {
            //Math class applying everyting learned and done so far to make program more dynamic
            
            int firstNum;
            int secondNum;
            Console.WriteLine("***This program shows you the highest number***");
            Console.WriteLine("Please enter a decimal number: ");
            firstNum = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Now enter another decimal number: ");
            secondNum = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Between " + firstNum + " " + "and" + " " + secondNum + ", the highest number is: " + Math.Max(firstNum,secondNum));
            Console.WriteLine("\n\n");
            
            
            int oneNum;
            int twoNum;
            Console.WriteLine("***This program shows you the lowest number***");
            Console.WriteLine("Please enter a decimal number: ");
            oneNum = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Please enter another decimal number: ");
            twoNum = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Between " + oneNum + " " + "and" + " " + twoNum + ", the lowest number is: " + Math.Min(twoNum,oneNum));
            Console.WriteLine("\n\n");
            
            Console.WriteLine("***This program will show you the square root of any number***");
            Console.WriteLine("Please enter a decimal number: ");
            int anyNum = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("The square root of " + anyNum + " is: " + Math.Sqrt(anyNum));
            Console.WriteLine("\n\n");
            
            Console.WriteLine("***This program will show you the absolute value (positive) of a number***");
            Console.WriteLine("Please write a negative number: ");
            int absNum = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("The absolute value of " + absNum + " " + "is: " + Math.Abs(absNum));
            Console.WriteLine("\n\n");
            
            Console.WriteLine("***This program will round any rational number to its closest whole number***");
            Console.WriteLine("Please enter a rational number (with a dot decimal): ");
            double ratNum = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("The number " + ratNum + " " + "rounded results in: " + Math.Round(ratNum));
        }
    }
}





using System;

namespace sixthApp 
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("***String length***");
            string bigText = "This is a very large string used for this lesson";
            Console.WriteLine(bigText);
            Console.WriteLine("The above string length is: " + bigText.Length);
            Console.WriteLine();
            
            Console.WriteLine("***String upper and lower***");
            Console.WriteLine("Now we will swap to upper case: " + bigText.ToUpper());
            Console.WriteLine();
            Console.WriteLine("Now to lower case: " + bigText.ToLower());
            Console.WriteLine();
            
            //Concatenation
            Console.WriteLine("***Concatenation with + symbol***");
            string name1 = "Maya ";
            string name2 = "Bonete";
            Console.WriteLine(name1 + name2);
            Console.WriteLine();

            Console.WriteLine("***Concatenation with .Concat function***" );
            string name3 = "Nheka ";
            string name4 = "Luna";
            string fullName = string.Concat(name3, name4);
            Console.WriteLine(fullName);
            Console.WriteLine();

            Console.WriteLine("***String interpolation with $ sign and {} characters***");
            string name5 = "China";
            string name6 = " Rufi";
            string justName = $"Both names are: {name5} {name6}";
            Console.WriteLine(justName);
            Console.WriteLine();
            
            Console.WriteLine("***Access strings***");
            string someText = "Nheka";
            Console.WriteLine("This will show the letter from a given text using index number: " + someText[0]);
            Console.WriteLine("This will show the index of a given letter from a text: " + someText.IndexOf("N"));
            Console.WriteLine();
            
            Console.WriteLine("***Combination of IndexOf and Substrings***");
            //We first create a string variable
            string petName = "Boneton Comelon";
            Console.WriteLine("We first show the full name");
            Console.WriteLine(petName);
            
            /*We then store the character position, taken from index function, into a new variable
            IndexOf will first get the index/position of a given string and show it as a decimal number, that is why we need an integer type to store*/
            int characPos = petName.IndexOf("C");
            
            /*Now we store the result from the Substring method into a new variable
            Substring will get a substring  out of a string, in other words, it will take a portion/word from a string and display it starting out of the character/letter we provide as input, in this case, the character position from IndexOf*/ 
            string newName = petName.Substring(characPos);
            Console.WriteLine("Now we will show just a substring");
            Console.WriteLine(newName);
            Console.WriteLine();

            Console.WriteLine("***Special characters***");
            Console.WriteLine("We are the so called \"Vikings\"");
            Console.WriteLine("It\'s fine");
            Console.WriteLine("This is a backslash \\");
            Console.WriteLine("This is a tab \\t \t this is text on the other side of the tab");
            Console.WriteLine("This a backspace \\b");
            Console.WriteLine("This is a new line \\n");            
            
        }
    }
}







using System;
namespace seventhApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("***We will now cover booleans!***");
            int Peter = 24;
            int May = 56;
            int Norman = 24;
            
            Console.WriteLine("Peter is 24 years old and May is 56, is Peter younger than May? " + (Peter < May));
            Console.WriteLine("Norman is 24 years old and Peter too, do they both have the same age? " + (Norman == Peter));
            Console.WriteLine("Is Norman older than May? " + (Norman > May));
            Console.WriteLine();
            
            Console.WriteLine("***This is a bonus***");
            int drivingAge = 18;
            //int currentAge;
            Console.WriteLine("Please enter your age: ");
            int currentAge = Convert.ToInt32(Console.ReadLine());
            if (currentAge >= drivingAge)
            {
                Console.WriteLine("You're allowed to drive!");
            }
            else
            {
                Console.WriteLine("Not allowed to drive");
            }
            
        }
    }
}






using System;
namespace eigthApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("If, else if and else practice\n");
            int freeRideAge = 54;
            Console.WriteLine("Please enter your age: ");
            int currentAge = Convert.ToInt32(Console.ReadLine());
            if (currentAge > freeRideAge)
            {
                Console.WriteLine("You have free ride");
            }
            else if (currentAge == freeRideAge)
            {
                Console.WriteLine("You have 50% discount on the ride");
            }
            else
            {
                Console.WriteLine("You pay full price");
            }
        }
    }
}





using System;
namespace ninethApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ternary operator\n");
            int currentAge = 5;
            Console.WriteLine("Please enter an age: ");
            int enterAge = Convert.ToInt32(Console.ReadLine());
            string result = (enterAge > currentAge) ? "Child" : "Baby";
            Console.WriteLine(result);
        }
    }
}




using System;
namespace tenththApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Even or odd verification\n");
            Console.WriteLine("Please enter a number: ");
            int enterNum = Convert.ToInt32(Console.ReadLine());
            if (enterNum % 2 == 0)
            {
                Console.WriteLine("Even number");
            }
            else
            {
                Console.WriteLine("Odd number");
            }

        }
    }
}





using System;
namespace elevehthApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Lock code verification\n");
            Console.WriteLine("Please create a lock code: ");
            int enterLock = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Please re-enter lock code to verify it: ");
            int verifyLock = Convert.ToInt32(Console.ReadLine());
            if (enterLock == verifyLock)
            {
                Console.WriteLine("Lock code is valid");
            }
            else
            {
                Console.WriteLine("Lock code is not valid, please reset it");
            }
        }
    }
}





using System;

namespace twelvethApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("This is practice for Switch\n\n");
            Console.WriteLine("Please enter a number from 1 to 4: ");
            int myNum = Convert.ToInt32(Console.ReadLine());
            switch (myNum)
            {
                case 1:
                Console.WriteLine("Hi I am number 1");
                break;
                case 2:
                Console.WriteLine("Good day, I am number 2");
                break;
                case 3:
                Console.WriteLine("Hello, I am number 3");
                break;
                default:
                Console.WriteLine("Sorry I only have 3 friends");
                break;
            }
        }
    }
}



using System;

namespace thirteenthApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("This is practice for While loops\n");
            int myNum = 0;
            while(myNum < 5)
            {
                Console.WriteLine("This is number: " + myNum);
                myNum++;
            }
        }
    }
}




using System;

namespace fourteenthApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("This is practice for Do/While loops\n");
            int myNum = 0;
            do
            {
                Console.WriteLine("Number " + myNum);
                myNum++;
            }
            while(myNum < 5);
        }
    }
}




using System;
namespace fifteenthApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Real life example - Countdown\n");
            int myCount = 3;
            while (myCount > 0)
            {
                Console.WriteLine(myCount + " seconds for explosion!");
                myCount--;
            }
            Console.WriteLine("Game over...");
        }
    }
}




using System;
namespace sixteenthApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Real life example - Counting odds\n");
            int myCount = 0;
            while (myCount < 20)
            {
                Console.WriteLine(myCount);
                myCount+=3;
            }
            Console.WriteLine("Loop completed...");
        }
    }
}




using System;
namespace seventeenthApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Real life example - Reverse numbers\n");
            int myNum = 12345;
            int revNum = 0;
            Console.WriteLine("Number before loop: " + myNum);

            while (myNum != 0) //While loops in C# must have a condition, so writing " while (myNum) " as seen on other programming languages is not possible
            {
                revNum = revNum * 10 + myNum % 10; /*This gets the last digit of myNum and adds it to revNum by moving the decimal point on the result (1234.5, then 123.45, then 12.345 and so on). To test teory, please print/add a Console.WriteLine for revNum and to myNum and see it change, you can also do it on a calculator to see the dot moving*/
                myNum /= 10; // This deletes the last number of myNum, which is a number 1
            }
            Console.WriteLine("Number after loop: " + revNum);
                /*If you do not get any of the above, please divide the code in chunks and analyze each part, adding a cout on each variable to understando its functionality*/

        }
    }
}





using System;
namespace eighteenthApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Real life example 1 While loops - While and If\n");
            int dice = 1;
            while (dice <= 6)
            {
                if (dice < 6)
                {
                    Console.WriteLine("Do not jump yet...");
                }
                else
                {
                    Console.WriteLine("Jump now!");
                }
                //dice++; The same as below
                dice += 1;
            }
        }
    }
}





using System;
namespace nineteenthApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Practice for For loop\n");
            for (int myNum = 0; myNum < 6; myNum++)
            {
                Console.WriteLine("Number: " + myNum);
            }
            Console.WriteLine();
            
            Console.WriteLine("For loop using even numbers\n");
            for (int evenNum = 0; evenNum < 10; evenNum+=2)
            {
                Console.WriteLine("Even number is: " +evenNum);
            }
        }
    }
}




using System;
namespace twentiethApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Practice for Nested For loop\n");
            for (int extNum = 1; extNum <= 2; extNum++)
            {
                Console.WriteLine("Dog " + extNum);
                for (int intNum = 1; intNum <= 3; intNum++)
                {
                    Console.WriteLine(" Cat " + extNum);
                }
            }
        }
    }
}



using System;
namespace twentyoneApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Practice for Foreach loop");
            Console.WriteLine("For each is used in arrays (lists) or any other data set\n");
            string[] animals = {"Cat", "Dog", "Fish", "Bird"};
            foreach (string pet in animals)
            {
                Console.WriteLine(pet);
            }
        }
    }
}



using System;
namespace anotherApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Real life examples - Count to 100 in 10s\n");
            for (int countIn = 0; countIn < 100; countIn +=10)
            {
                Console.WriteLine(countIn);
            }
            Console.WriteLine();
            Console.WriteLine("Count even numbers from 0 to 10 inclusive\n");
            for (int evenIn = 0; evenIn <=10; evenIn+=2)
            {
                Console.WriteLine(evenIn);
            }
            Console.WriteLine();
            Console.WriteLine("Count to 512 on powers of 2\n");
            for (int powerIn = 1; powerIn < 512; powerIn*=2)
            {
                Console.WriteLine(powerIn);
            }
            Console.WriteLine();
            Console.WriteLine("Give multiplication table from an input number\n");
            int ingressNum;
            Console.WriteLine("Please enter a number: ");
            ingressNum = Convert.ToInt32(Console.ReadLine());
            for (int muNum = 1; muNum <=10; muNum++)
            {
                Console.WriteLine(ingressNum + "x" + muNum + " = " + ingressNum * muNum);
            }
        }
    }
}




using System;
namespace anotherApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Break in For loop\n");
            for (int i = 0; i < 4; i++)
            {
                if (i == 4)
                {
                    break;
                }
                Console.WriteLine(i);
            }
            Console.WriteLine("Break\n");
            Console.WriteLine("Continue in For loop");
            for (int j = 0; j < 10; j++)
            {
                if (j == 4)
                {
                    Console.WriteLine("Continue (skip 4)");
                    continue;
                }
                Console.WriteLine(j);
            }
        }
    }
}





using System;
namespace anotherApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Break in While loop\n");
            int i = 0;
            while (i < 10)
            {
                Console.WriteLine(i);
                i++;
                if (i == 4)
                {
                    break;
                }
            }
            Console.WriteLine("Break\n");
            
            Console.WriteLine("Continue in While loop");
            int j = 0;
            while (j < 10)
            {
                Console.WriteLine(j); //Does the same here or in line 33 and 34 below
                j++;
                if (j == 4)
                {
                    Console.WriteLine("Continue (skip 4)");
                    j++;
                    continue;
                }
                //Console.WriteLine(j);
                //j++;
            }
        }
    }
}






using System;
namespace anotherApp
{
    class Program
    {
        static void Main(string[] args)
        {
        Console.WriteLine("Practice for Arrays\n");
        string[] carArray = {"BMW","Mercedez","Audi","Land Rover"};
        Console.WriteLine(carArray[0]);
        
        carArray[1] = "Aston Marti";
        Console.WriteLine(carArray[1]);
        
        Console.WriteLine(carArray.Length);//Counts items on array
        Console.WriteLine();
        Console.WriteLine("C# has 4 different ways of creating arrays\n");
        //You should note that if you declare an array and initialize it later, you have to use the new keyword


        // Create an array of four elements, and add values later
        string[] nuArray = new string[3];
        
        // Create an array of four elements and add values right away 
        string[] nuArray1 = new string[3] {"one", "two", "three"};
        
        // Create an array of four elements without specifying the size 
        string[] nuArray2 = new string[] {"one", "two", "three"};
        
        // Create an array of four elements, omitting the new keyword, and without specifying the size
        string[] nuArray3 = {"one", "two", "three"};
        
        Console.WriteLine("For loops in Arrays\n");
        string[] aniArray = {"Dog","Cat","Fish","Bird","Toad"};
        for (int item = 0; item < aniArray.Length; item++)
        {
            Console.WriteLine(item + " = " + aniArray[item]);
        }
        Console.WriteLine();
        Console.WriteLine("Foreach loop in Arrays\n");
        string[] insArray = {"Mantis","Butterfly","Dragonfly"};
        foreach (string insect in insArray)
        {
            Console.WriteLine(insect);
        }
        //If you compare the for loop and foreach loop, you will see that the foreach method is easier to write, it does not require a counter (using the Length property), and it is more readable
        }
    }
}



using System;
using System.Linq;
namespace anotherApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Sorting arrays\n");
            string[] fruit = {"Durazno","Chayote","Aguacate","Banano"};
            Array.Sort(fruit);//This reorders alphabetically
            foreach (string item in fruit)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine();
            
            int[] nums = {5, 2, 9, 6, 1, 7};//This reorders from low to high
            Array.Sort(nums);
            foreach (int num in nums)
            {
                Console.WriteLine(num);
            }
            Console.WriteLine();
            
            Console.WriteLine("Use case for System.Linq namespace\n");
            Console.WriteLine(nums.Max());//Highest from nums
            Console.WriteLine(nums.Min());//Lowest from nums
            Console.WriteLine(nums.Sum());//Sum of nums
        }    
    }
}



using System;

namespace anotherApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Real life example - calculate average of an array");
            int[] manyAges = {16,24,36,43,57,62,78};
            Console.WriteLine("manyAges = {16,24,36,43,57,62,78}");
            float sum = 0;
            int length = manyAges.Length;
    
            foreach (int age in manyAges)
            {
                sum+=age;
            }
            float average = sum / length;
            Console.WriteLine("The average of manyAges array/list is " + average);
            Console.WriteLine();
            
            Console.WriteLine("Real life example - find lowest age in an array");
            int[] ages = {15,21,32,47,9,62,78};
            Console.WriteLine("ages = {15,21,32,47,9,62,78}");
            int lowestAge = ages[0];
            
            foreach (int age in ages)
            {
                if (lowestAge > age)
                {
                    lowestAge = age;
                }
            }
            Console.WriteLine("The lowest age in ages array is: " + lowestAge);
        }
    }
}



using System;

namespace anotherApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Multidimensional arrays with Foreach loop\n");
            int[,] numbers = {{1,4,2}, {3,6,8}};
            foreach (int number in numbers)
            {
                Console.WriteLine(number);
            }
            Console.WriteLine();
            
            Console.WriteLine("Multidimensional arrays with For loop\n");
            int[,] numeros = {{2,4,6},{8,10,12}};
            for (int i = 0; i < numeros.GetLength(0); i++)
            {
                for (int x = 0; x < numeros.GetLength(1); x++)
                {
                    Console.WriteLine(numeros[i,x]);
                }
            }
        }
    }
}





using System;

namespace anotherApp
{
    class Program
    {
        static void Main(string[] args)
        {
            /*This is a replication of the same game but in C++. I could not make this game a 3D array, and thus, loses a bit of the challenge. 
            In C++ it is fairly easy to setup, in here, C#, I just could not do it, so I changed the game from being 3D to 2D array, and some other modifications to make it work decently. 
            I will work on this later on if I have chance*/
            
            Console.WriteLine("Welcome to shoot the disc game!\n");//This is aimed to practice multidimensional arrays
            Console.WriteLine("You need to select a row (0, 1 or 2 or up, center, bottom) and column (0, 1 or 2 or left, center, right) to see if you can shoot a disc at the same time the disc is shot\n\n");
            
            int[,] discs = {{0,1,0}, {1,0,0}}; //I had to change from bool to int due to errors in C# for not being able to transform it, and the dimensions of the array
            
            int hits = 0;
            int turns = 0;
            
            while (hits < 2)
            {
                Console.WriteLine("Tie to aim!");
                
                Console.WriteLine("Choose a row (0, 1)");
                int row = Convert.ToInt32(Console.ReadLine());
                
                Console.WriteLine("Choose a column (0, 1)");
                int column = Convert.ToInt32(Console.ReadLine());
                
                if (discs[row,column] != 0)
                {
                    discs[row, column] = 0;
                    hits++;
                    Console.WriteLine("You hit it! " + (2-hits) + " left\n");
                }
                else
                {
                    Console.WriteLine("You missed it\n");
                }
                turns++;
            }
            Console.WriteLine("Well done, you won in " + turns + " turns\n");
        }
    }
}




using System;
namespace anotherApp
{
    class Program
    {
        /* A method is a block of code which only runs when it is called.

        You can pass data, known as parameters, into a method.

        Methods are used to perform certain actions, and they are also known as functions.

        Why use methods? To reuse code: define the code once, and use it many times */
    
        static void myMethod()
        {
            Console.WriteLine("I got executed from myMethod method/function");
        }
        
        static void Main(string[] args)
        {
            myMethod();
            myMethod();
            myMethod();
        }
     /* MyMethod() is the name of the method
        static means that the method belongs to the Program class and not an object of the Program class. You will learn more about objects and how to access methods through objects later in this tutorial.
        void means that this method does not have a return value. You will learn more about return values later in this chapter */
    }
}



using System;
namespace anotherApp
{
    class Program
    {
        static void anotherMethod(string firstName)
        {
            Console.WriteLine(firstName + " Trump");
        }
        
        static void Main(string[] args)
        {
            Console.WriteLine("Methods - Parameter and Arguments");
            /*Information can be passed to methods as parameter. Parameters act as variables inside the method.
            They are specified after the method name, inside the parentheses. 
            You can add as many parameters as you want, just separate them with a comma.*/
            anotherMethod("Donald");
            anotherMethod("Jessica");
            anotherMethod("Richard");
        }
    }
}



using System;
namespace anotherApp
{
    class Program
    {
        static void myMethod(string firstName, int age)
        {
            Console.WriteLine(firstName + " is " + age + " years old");
        }
        
        static void Main(string[] args)
        {
            Console.WriteLine("Multiple Parameters\n");
            myMethod("Barry", 25);
            myMethod("Clark", 35);
            myMethod("Diana", 28);
        }
    }
}


using System;
namespace anotherApp
{
    class Program
    {
        static void myMethod(string country = "Costa Rica")
        {
            Console.WriteLine(country);
        }
        
        static void Main(string[] args)
        {
            Console.WriteLine("Default Parameter\n");
            /*If we call the method without an argument, it uses the default value (Costa Rica)
            A parameter with a default value, is often known as an "optional parameter". 
            From the example, country is an optional parameter and "Costa Rica" is the default value.*/
            myMethod("Guatemala");
            myMethod("Nicaragua");
            myMethod();
            myMethod("Mexico");
        }
    }
}



using System;
namespace anotherApp
{
    class Program
    {
        static int numMethod(int num)
        {
            return 10 + num;
        }
        
        static void Main(string[] args)
        {
            Console.WriteLine("***Return values - One Parameter***");
            Console.WriteLine(numMethod(4));
        }
    }
}


using System;
namespace anotherApp
{
    class Program
    {
        static int numMethod(int x, int y)
        {
            return x + y;//Please take note of this return
        }
        
        static void Main(string[] args)
        {
            Console.WriteLine("***Return values - Two Parameters***");
            
            //Console.WriteLine(numMethod(5,10));Just writing this is valid
            
            int result = numMethod(5,10);//Writing this
            Console.WriteLine(result);//and this is recommended, more readable and easier to maintain
        }
    }
}




using System;

namespace anotherApp
{
    class Program
    {
        static void namedMethod(string dog1, string dog2, string dog3)
        {
            Console.WriteLine("The bravest dog is: " + dog2);
        }

        static void Main(string[] args)
        {
            Console.WriteLine("***Named Arguments***\n");
            namedMethod(dog3: "Luna", dog2: "Maya", dog1: "Bobby");
        /*It is also possible to send arguments with the key: value syntax.
        That way, the order of the arguments does not matter*/
        }
    }
}



using System;
namespace anotherApp
{
    class Program
    {
        static int additionMethod(int x, int y)
        {
            return x + y;
        }
        
        //Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.

        static double additionMethod(double x, double y)
        {
            return x + y;
        }
        
        static void Main(string[] args)
        {
            Console.WriteLine("***Method overloading***\n");
            int myInteger = additionMethod(5, 3);
            Console.WriteLine("Method overloading with integer result: " + myInteger);
            
            double myDouble = additionMethod(5.5, 3.3);
            Console.WriteLine("Method overloading with double result: " + myDouble);
        }
    }
}



using System;

class Car
{
    string color = "red";
    static void Main(string[] args)
    {
        Console.WriteLine("***OOP - Classes and Objects***\n");
        Car myObject = new Car();
        Console.WriteLine(myObject.color);
        //Note that we use the dot syntax (.) to access variables/fields inside a class (myObj.color).
}



using System;

class Car
{
    string color1 = "red";
    string color2 = "blue";
    static void Main(string[] args)
    {
        Console.WriteLine("***Multiple objects on a class***\n");
        
        Car myObject1 = new Car();
        Console.WriteLine("Car 1 is: " + myObject1.color1);
        
        Car myObject2 = new Car();
        Console.WriteLine("Car 2 is: " + myObject2.color2);
    }    
}    
