// First program
#include <iostream>
using namespace std;

int main() {
  cout << "Hello C++!" << endl; //This
  cout << "Hello C!\n"; //does the same as this
  cout << "I am learning programming\n";
  
  int myNum = 525;
  cout << myNum << "\n";
  
  double myDoub = 12.5;
  cout << "I have " << myDoub << " cents in my pocket" << endl;
  
  char myChar = 'H';
  cout << myChar << "\n";
  
  string myStr = "Hello folks";
  cout << myStr << endl;
  
  bool myBo = true;
  cout << myBo << "\n";
  
  int x=2, y=3, z=4;
  cout << x+y+z << endl;
  
  const double myPi = 3.14159;
  cout << myPi << "\n";
  
  return 0;
}



//Second program
#include <iostream>
using namespace std;

int main()
{
    //Student data
    int studentID = 9988;
    string studentName = "Charles";
    int studentAge = 20;
    double studentFee = 12.50;
    char studentGrade = 'B';
    
    //Print data
    cout << "Student name: " << studentName << endl;
    cout << "Student ID: " << studentID << "\n";
    cout << "Student age: " <<studentAge << endl;
    cout << "Student fee: " <<studentFee << "\n";
    cout << "Student grade: " <<studentGrade << endl;
}



//Third program
#include <iostream>
using namespace std;

int main()
{
    //Area of a circle
    int radius = 6;
    double numPi = 3.14159;
    //Pi times radius squared
    cout << "The area of this circle is " << radius * radius * numPi << endl;
}




 //Fourth program 
#include <iostream>
using namespace std;

int main()
{
    int x, y;
    int sum;
    
    cout << "This is a basic sum calculator in C++" << "\n\n";
    cout << "Please enter a decimal number: " << endl;
    cin >> x;
    cout << "Now enter another one: " << "\n";
    cin >> y;
    cout << "Ok, here we go........................." << endl;
    sum = x + y;
    cout << "The result of the operation is " << sum;
}
    



//Fifth program
#include <iostream>
using namespace std;

int main()
{
    int items;
    double costPerItem;
    double totalCost;
    char currency = '$';
    
    cout << "This is a cost calculator in C++" << endl;
    cout << "Enter the amount of items: " << "\n";
    cin >> items;
    cout << "Now enter the price for each item: " << endl;
    cin >> costPerItem;
    cout << "Please wait............" << "\n";
    totalCost = items * costPerItem;
    cout << "The total cost for all items is " << currency << totalCost;
    
}






#include <iostream>
using namespace std;

int main() 
{
    cout << "***Arithmetic operators***" << endl;
    cout << "Number we will take for operators are 8 and 4" << "\n\n";
    //Addition
    int firstNum = 8;
    int secondNum = 4;
    int sum = firstNum + secondNum;
    cout << "Addition is: "<< sum << endl;
    
    ///Substraction
    int subs = firstNum - secondNum;
    cout << "Substaction is: " << subs << "\n";
    
    //Multiplation
    int multi = firstNum * secondNum;
    cout << "Multiplication is: " << multi << endl;
    
    //Division
    int divi = firstNum / secondNum;
    cout << "Division is: " << divi << "\n";
    
    //Modulus
    int mod = firstNum % secondNum;
    cout << "Modulus is: " << mod << endl;
    
    //Increment
    int inc = ++firstNum;
    cout << "Increment by 1 is: " << inc << "\n";
    
    //Decrement
    int dec = --secondNum;
    cout << "Decrement by 1 is: " << dec << "\n\n";
    
    
    cout << "***Assignment operators***" << endl;
    int x = 5;
    int y = 3;
    
    x += 2;
    cout << "Addition assignment result is: " << x << endl;
    
    y -= 1;
    cout << "Substraction assignment result is: " << y << endl;
    
    x %= 2;
    cout << "Modules assignment result is: " << y << "\n\n";
    
    
    cout << "***Comparison operators***" << endl;
    int a = 3;
    int b = 2;
    
    cout << "Returns 1 if True and 0 if False" << "\n";
    cout << "a greater than b: " << (a>b) << endl;
    cout << "a lower than b: " << (a<b) << "\n";
    cout << "a not equal to b: " << (a!=b) << "\n\n";
    
    cout << "***Logical operators***" << endl;
    int n = 5;
    int p = 6;
    int o = 5;
    int r = 2;
    
    cout << "Returns 1 if True and 0 if False" << "\n";
    cout << "n greater than r AND p greater than n: " << (n>r && p>n) << "\n";
    cout << "p lower than o OR n equals to o: " << (p<o || n==o) << endl;
    cout << "NOT n equals o: " << !(n==o);"\n";
    
}








#include <iostream>
using namespace std;

int main()
{
    //Concatenation
    cout << "***Concatenation***" << endl;
    string firstName = "Jim";
    string lastName = "Morrison";
    cout << "The Doors singer was " << firstName + " " + lastName << endl;
    
    //Note the extra space after "Michael" since append method does not add it
    string firstN = "Michael ";
    string lastN = "Jackson";
    string fullN = firstN.append(lastN);
    cout << fullN << "\n\n";
    
    cout << "***String length***" << endl;
    string bigString = "This is a big string to be counted by the length or size method \n";
    cout << bigString << endl;
    cout << "We will use the lenght method first" << "\n";
    cout << "The lenght of the above string is: " << + bigString.length() << "\n\n";
    cout << "Now we will use the size method" << "\n";
    cout << "The size of the above string is: " << + bigString.size() << "\n\n";
    
    cout <<"***Access strings by index***" << endl;
    string dog = "Maya";
    cout << dog << "\n";
    cout << "Now we will get the letter in position 0: " << dog[0] << endl;
    cout << "Now the letter in position 3: " << dog[3] << "\n\n";
    cout << "Another way of doing this is by combining lenght/size with square brackets" << "\n";
    cout << "Last letter of dog variable is: " << dog[dog.length() -1] << endl;
    
    cout << "First letter of dog variable is: " << dog[dog.size() -4] << "\n\n";
    cout << "Note that the above code will work backwards: it will count from last to first by using minus (-) symbol" << "\n\n";
    
    cout << "Now we will substitute letters" << endl;
    cout << dog << endl;
    dog[0] = 'B';
    cout << "Now Maya will be changed to: " + dog << "\n";
    
    cout << "***At method***";
    cout << dog.at(0) << endl;
    cout << dog.at(2) << endl;
    cout << dog.at(dog.length() -1) << endl;
    cout << dog.at(dog.size() -4) << endl;
    dog.at(0) = 'T';
    cout << dog << "\n\n";
    
    cout << "***Special characters in strings with \" \' and \\ ***"<< endl;
    cout << "We are the so called \"Vikings\" of the sea" << "\n";
    cout << "It\'s alright" << endl;
    cout << "This ia backlash \\" << "\n";
    cout << "This is a new line \\n " << endl;
    cout << "This is a tab \\t \t this is on the other side of a tab" "\n\n";
    
    // cout << "***User input strings***" << endl;
    // cout << "Let\'s see a buggy code first" << endl;
    // string fullname;
    // cout << "Please enter your full name: " << "\n";
    // cin >> fullname;
    // cout << "Your full name is: " + fullname << endl;
    // cout << "The above happens cause cin can only store one word per input, so any other character is ignored" << "\n";
    // cout << "Now let\'s see a working code using getline method" << "\n\n";
    // //Comment above lines for the below to work fine
    string anotherFullName;
    cout << "Please enter your full name again: " << endl;
    getline(cin, anotherFullName);
    cout << "Your full name is now showing as: " + anotherFullName << endl;
    cout << "Getline gets the full line of text, taking cin as first parameter and the string as second" << "\n\n";
    
    cout << "***Omitting std namespace***" << endl;
    cout << "You might see some C++ programs that run without the standard namespace library. The using namespace std line can be omitted and replaced with the std keyword, followed by the :: operator for string (and cout) objects" << "\n\n";
    
    cout << "C-style strings" << endl;
    cout << "C-style strings are created with the char type instead of string. The name comes from the C language, which, unlike many other programming languages, does not have a string type for easily creating string variables. Instead, you must use the char type and create an array of characters to make a \"string\" in C. As C++ was developed as an extension of C, it continued to support this way of creating strings in C++" << "\n";
    string dog1 = "Maya in C++ format";
    char dog2[] = "Maya in C format";
    cout << dog1 << "\n";
    cout << dog2 << endl;

}




#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    cout << "***Math method***" << endl;
    int num1;
    int num2;
    cout << "Please enter a decimal number: " << endl;
    cin >> num1;
    cout << "Now enter another decimal number: " << "\n";
    cin >> num2;
    cout << "The biggest number is " << max(num1,num2) << "\n\n";
    
    int num3;
    int num4;
    cout << "Enter a decimal number: " << endl;
    cin >> num3;
    cout << "Now enter another one: " << endl;
    cin >> num4;
    cout << "The lowest number is: " << min(num3,num4) << "\n\n";
    
    cout << "***Now we will have to import the math library by using the #include <cmath> to be able to use math operations***" << endl;
    
    int numSqr;
    cout << "Please enter a decimal number: " << endl;
    cin >> numSqr;
    cout << "The square root of such number is: " << sqrt(numSqr) << "\n\n";
    
    int rounNum;
    cout << "Enter a rational number to round it: " << endl;
    cin >> rounNum;
    cout << "Such number rounded results in: " << round(rounNum) << "\n\n";
    
    //Run each section separately, this last does not work well with the others above
    int abNum;
    cout << "Please enter a negative number: " << endl;
    cin >> abNum;
    cout << "The absolute value is: " << abs(abNum);
}




#include <iostream>
using namespace std;

int main()
{
    cout << "Now we will see booleans" << endl;
    int Tom = 34;
    int Yok = 27;
    int Vilma = 34;
    cout << "Tom is 34 years old and Yok 27, is Tom older? 1=True and 0=False: " << (Tom > Yok) << endl;
    cout << "Toms is 34 yeas old, the same as Vilma, do they have the same age? 1=True and 0=False: " << (Vilma == Tom) << endl;
    cout << "Is Yok older than Vilma? 1=True and 0=False: " << (Yok > Vilma) << "\n\n";
    
    cout << "***This is a bonus***" << endl;
    int driveAge = 18;
    int currentAge;
    
    cout << "Please enter your age: " << endl;
    cin >> currentAge;
    if (currentAge >= driveAge)
    {
        cout << "You're allowed to drive, congrats :)";
    }
    else
    {
        cout << "Not allowed to drive, sorry :(";
    }
    
}





#include <iostream>
using namespace std;

int main()
{
    cout << "If, else if, else practice" << "\n\n";
    int freeRideAge = 55;
    int currentAge;
    
    cout << "Please enter your age: " << endl;
    cin >> currentAge;
    if (currentAge > freeRideAge)
    {
        cout << "You have free ride";
    }
    else if (currentAge == freeRideAge)
    {
        cout << "You have 50\% discount on the ride";
    }
    else
    {
        cout << "You pay full price for the ride";
    }
    
}




#include <iostream>
using namespace std;

int main()
{
    cout << "Ternary operator - short hand if..else" << "\n\n";
    int currentAge = 5;
    int enterAge;
    cout << "Please enter an age from 1 to 10: ";
    cin >> enterAge;
    string result = (enterAge < currentAge) ? "Baby" : "Child";
    cout << result;
}



#include <iostream>
using namespace std;

int main()
{
    cout << "Check if a number is even or odd" << "\n\n";
    int anyNumber;
    cout << "Please enter any type of number: ";
    cin >> anyNumber;
    if (anyNumber % 2 == 0)
    {
        cout << "The number is even";
    }
    else
    {
        cout << " The number is odd";
    }
}



#include <iostream>
using namespace std;

int main()
{
    cout << "Lock code verification" << "\n\n";
    int lockCode;
    cout << "Please create lock code: ";
    cin >> lockCode;
    int verifyLockCode;
    cout << "Please re-enter lock code to check it: ";
    cin >> verifyLockCode;

    if (lockCode == verifyLockCode)
    {
        cout << "Lock code is valid";
    }
    else
    {
        cout << "Lock code is not valid, please reset it";
    }
}





#include <iostream>
using namespace std;

int main()
{
    cout << "This is practice for Switch" << "\n\n";
    
    int myNum;
    cout << "Please enter a number from 1 to 4: " << endl;
    cin >> myNum;
    switch (myNum) 
    {
        case 1:
        cout << "Hi I am number 1";
        break;
        case 2:
        cout << "Good day I am number 2";
        break;
        case 3:
        cout << "Hello I am number 3";
        break;
        default:
        cout << "Sorry I only have 3 friends";
        
    }
}




#include <iostream>
using namespace std;

int main ()
{
    cout << "This is practice for While loops \n\n";
    cout << "Note that While loops do not consider the last digit (myNum < 5), 5 in this case, unless you add an = (equal) on the greater (>) or lesser (<) than symbol, like this: myNum <= 5\n\n";
    int myNum = 0;
    while (myNum <= 5)
    {
        cout << "This is number " << myNum << endl;
        myNum++;
    }
    
}



#include <iostream>
using namespace std;

int main ()
{
    cout << "This is practice for Do/While loops \n\n";
    int anotNum = 0;
    do
    {
        cout << "Number " << anotNum << endl;
        anotNum++;
    }
    while (anotNum < 10);
}




#include <iostream>
using namespace std;

int main()
{
    cout << "Real life example 1 While loops - count down \n\n";
    int myCount = 3;
    while (myCount > 0)
    {
        cout << myCount << " seconds before explosion!" << endl;
        myCount--;
    }
    cout << "Game over...";
}



#include <iostream>
using namespace std;

int main()
{
    cout << "Real life example 1 While loops - print odds \n\n";
    int myPair = 0;
    while (myPair <= 20)
    {
        cout << myPair << " counting in odds" << endl;
        myPair+=3; //The increment here decides if counting in pairs, odds, or 4s, or 5s
    }
    cout << "Counting completed";
}



#include <iostream>
using namespace std;

int main()
{
    cout << "Real life example 1 While loops - reverse numbers \n\n";
    int myNum = 12345;
    int revNum = 0;
    cout << "First we see the numbers before the loop: " << myNum << endl;
    while (myNum) //This says: while myNum variable exists, but does not apply any condition to it
    {
        //cout << myNum << endl;
        revNum = revNum * 10 + myNum % 10; /*This gets the last digit of myNum and adds it to revNum by moving the decimal point on the result (1234.5, then 123.45, then 12.345 and so on). To test teory, please print/add a cout for revNum and to myNum and see it change, you can also do it on a calculator to see the dot moving*/
        //cout << revNum << endl;
        myNum /= 10; // This deletes the last number of myNum, which is a number 1
    }
    cout << "Now we see the numbers after the loop: " <<revNum;
    /*If you do not get any of the above, please divide the code in chunks and analyze each part, adding a cout on each variable to understando its functionality*/
}




#include <iostream>
using namespace std;

int main()
{
    cout << "Real life example 1 While loops - While and If \n\n";
    
    int dice = 1;
    while (dice <=6)
    {
        if (dice < 6)
        {
            cout << dice << " Do not jump yet...\n";
        }
        else
        {
            cout << dice << " Jump now!\n";
        }
        dice += 1;
    }
}





#include <iostream>
using namespace std;

int main()
{
    cout << "Practice for For loop\n\n";
    for (int myInt = 0; myInt < 6; myInt++)
    {
        cout << "Number: " << myInt << endl;
    }
    cout << endl;
    cout << "For loop using even numbers\n";
    for (int evenNum = 0; evenNum <= 10; evenNum+=2)
    {
        cout << "Even number is: " << evenNum << endl;
    }
}




#include <iostream>
using namespace std;

int main()
{
    cout << "Practice for Nested For loop\n\n";
    for (int extNum = 1; extNum <= 2; extNum++)
    {
        cout << "Dog " << extNum << endl;
        for (int intNum = 1; intNum <= 3; intNum++)
        {
            cout << "   Cat " << intNum << endl;
        }
    }
}




#include <iostream>
using namespace std;

int main()
{
    cout << "Practice for Foreach loop" << endl;
    cout << "Foreach is used exclusively to loop through elements in an array (lists) or other data structures\n\n";
    string animals[] = {"Cat", "Dog", "Fish", "Bird"};
    for (string pet : animals)
    {
        cout << pet << endl;
    }
}



#include <iostream>
using namespace std;

int main ()
{
    cout << "Real life examples - Count to 100 in 10s\n";
    for (int counterHun = 0; counterHun <= 100; counterHun+=10)
    {
        cout << counterHun << endl;
    }
    cout << "\n";
    cout << "Count even numbers from 0 to 10 inclusive\n";
    for (int evenCo = 0; evenCo <=10; evenCo+=2)
    {
        cout << evenCo << endl;
    }
    cout << "\n";
    cout << "Count to 512 on powers of 2\n";
    for (int powerNu = 1; powerNu < 512; powerNu*=2)
    {
        cout << powerNu << endl;
    }
    cout << "\n";
    cout << "Give multiplication table from an input number\n";
    int xNum;
    int ingressNum;
    cout << "Please enter a number: " << endl;
    cin >> ingressNum;

    for (int xNum = 1; xNum <=10; xNum++)
    {
        cout << ingressNum << "x" << xNum << " = " << xNum * ingressNum << endl;
    }
}
