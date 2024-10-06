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
