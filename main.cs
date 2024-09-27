using System;
namespace FirstApp
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

namespace FirstApp
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