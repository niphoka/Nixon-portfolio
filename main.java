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
