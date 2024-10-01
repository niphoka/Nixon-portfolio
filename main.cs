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
