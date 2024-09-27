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


