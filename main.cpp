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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================
  
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
    
==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================
  
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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================
  
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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================
  
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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================

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

==================================================================================================================================================

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
    int ingressNum;
    cout << "Please enter a number: " << endl;
    cin >> ingressNum;

    for (int xNum = 1; xNum <=10; xNum++)
    {
        cout << ingressNum << "x" << xNum << " = " << xNum * ingressNum << endl;
    }
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int main()
{
    cout << "Break in For loop\n";
    for (int i = 0; i < 10; i++)
    {
        if (i == 4)
        {
            cout << "Stop here\n";
            break; //This makes counting to stop at 4
        }
        cout << i << endl;
    }
    cout << endl;
    cout << "Continue in For loop\n";
    for (int j = 0; j < 10; j++)
    {
        if (j == 4) //This makes counting to skip 4 and continue to 10
        {
            cout << "Skip 4 and continue\n";
            continue;
        }
        cout << j << endl;
    }
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int main()
{
    cout << "Break in While loop\n";
    int i;
    while (i < 10)
    {
        cout << i << endl;
        i++;
        if (i == 4)
        {
            break; //This makes counting to stop at 4
        }
    }
    cout << "Stop here\n\n";

    cout << "Continue in While loop\n";
    int j;
    while (j < 10)
    {
        cout << j << endl;
        j++;
        if (j == 4)
        {
            cout << "Skip 4 and continue\n"; //Does the same here or in lines 31 and 32 below
            j++;        
            continue; //This makes counting to skip 4 and continue to 10
        }
        //cout << j << endl;
        //j++;
    }
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int main()
{
    cout << "Practice for arrays\n\n";
    string carArray [4] = {"BMW","Mercedez","Audi","Land Rover"};
    cout << carArray[0];
    cout << endl;
    carArray[1] = "Aston Marti";
    cout << carArray[1];
    cout << "\n\n";
    cout << "For loop in Arrays\n";
    string aniArray [5] = {"Dog","Cat","Fish","Bird","Toad"};
    for (int aniIndex = 0; aniIndex < 5; aniIndex++) //Regular For has integer type inside parenthesis
    {
        cout << aniIndex << " = " << aniArray[aniIndex] << endl; //This prints index of each item and then items of array
    }
    cout << "\n";
    
    int numArray [6] = {10, 20, 30, 40, 50, 60};
    for (int numIndex = 0; numIndex < 6; numIndex++)
    {
        cout << numIndex << " : " << numArray[numIndex] << endl;
    }
    cout << "\n";
    cout << "Foreach loop in Arrays\n";
    string insArray[3] = {"Mantis","Butterfly","Dragonfly"};
    for (string insect : insArray) //Foreach has string type inside parenthesis
    {
        cout << insect << endl; 
    }
}

==================================================================================================================================================

#include <iostream>
#include <vector>
using namespace std;

int main()
{
    cout << "Arrays cannot be modified once created\n";
    //string fixArray[] = {"Sun", "Moon","Stars"}; This does the same
    string fixArray[3] = {"Sun", "Moon","Stars"}; //This is is considered as "good practice", because it will reduce the chance of errors in your program.
    fixArray[3] = "Jupiter"; //This throws an error or does not work since Arrays cannot be modified
    for (string i : fixArray)
    {
        cout << i << endl;
    }
    cout << "\n";
    
    cout << "Solution is to create a vector\n"; //remember to import vector module at the top
    vector<string> testArray = {"One","Two","Three"};
    testArray.push_back("Four");
    for (string item : testArray)
    {
        cout << item << endl;
    }    
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int main()
{
    string words[] = {"Mango", "Tree", "Squirrel", "Rain"};
    cout << "Size of \"words\" array in bytes: " << sizeof(words) << endl; //This shows the size of the entire array in bytes
    cout << "Size of Mango: " << sizeof(words[0]) << endl;//This shows the size of each item in the array in bytes
    cout << "Size of Tree: " << sizeof(words[1]) << endl;
    cout << "Size of Squirrel: " << sizeof(words[2]) << endl;
    cout << "Size of Rain: " << sizeof(words[3]) << endl;
    /*Why did the result show 128 (or any other number) instead of 4, when the array contains 4 elements?
It is because the sizeof() operator returns the size of a type in bytes.
You learned from the Data Types chapter that an int type is usually 4 bytes, so from the example above, 32 x 4 (4 bytes x 5 elements) = 128 bytes.
To find out how many elements an array has, you have to divide the size of the array by the size of the first element in the array*/
    int arrayLength = sizeof(words) / sizeof(words[0]);
    cout << "Number of items in array: " << arrayLength << endl;
    cout << "\n";
    
    cout << "Regular For loop to go through an array with sizeof()\n";
    cout << "num < 4 is not ideal, since it will only work for arrays of a specified size\n";
    int inteArray[4] = {10, 20, 30, 40};
    for (int num = 0; num < 4; num++)
    {
        cout << num <<endl;
    }
    cout << endl;
    
    cout << "sizeof(myArray) / sizeof(myArray[0]) is better\n";
    int myArray[4] = {50, 60, 70, 80};
    for (int i = 0; i < sizeof(myArray) / sizeof(myArray[0]); i++)
    {
        cout << myArray[i] << endl;
    }
    cout << endl;
    cout << "Foreach loop \"string j : bunch\" is better, faster and cleaner\n";
    string bunch[4] = {"Tomato", "Spaguetti","Toad","Tiger"};
    for (string j : bunch)
    {
        cout << j << endl;
    }
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int main()
{
    cout << "Real life example - calculate average of an array\n";
    cout << "manyAges[7] = {15,24,36,43,57,62,78}" << endl;
    int manyAges[7] = {16,24,36,43,57,62,78};
    float average, sum = 0;
    int length = sizeof(manyAges) / sizeof(manyAges[0]);
    
    for (int age : manyAges)
    {
        sum+=age;
    }
    average = sum / length;
    cout << "The average of manyAges array/list is " << average << endl;
    cout << endl;
    
    cout << "Real life example - find lowest age in an array\n";
    int ages[7] = {15,21,32,47,9,62,78};
    cout << "ages[7] = {15,21,32,47,9,62,78}\n";
    int lowestAge = ages[0];
    
    for (int age : ages)
    {
        if (lowestAge > age)
        {
            lowestAge = age;
        }
    }
   cout << "The lowest age in ages array is: " << lowestAge << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int main()
{
    cout << "2 dimension arrays\n";
    string twoArray [2][3] = {{"A","B","C"},{"D","E","F"}};
    cout << twoArray[1][2] << "\n\n";
    
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << twoArray[i][j] << endl;
        }
    }
    cout << "\n";
    cout << "3 dimension arrays\n";
    int threeArray[2][2][2] = {{{1,2},{10,20}},{{100,200},{1000,2000}}};
    for (int layer1 = 0; layer1 < 2; layer1++)
    {
        for (int layer2 = 0; layer2 < 2; layer2++)
        {
            for (int layer3 = 0; layer3 < 2; layer3++)
            {
                cout << threeArray[layer1][layer2][layer3] << endl;
            }
        }
    }
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int main()
{
    cout << "Welcome to shoot the disc game!\n";//This is aimed to practice multidimensional arrays
    cout << "You need to select a row (0, 1 or 2 or up, center, bottom) and column (0, 1 or 2 or left, center, right) to see if you can shoot a disc at the same time the disc is shot\n\n";
  
    bool discs[3][3] = 
        {{0,0,1},
        {0,1,0},
        {1,0,0}};
        
    int hits = 0;
    int turns = 0;
    
    while (hits <3)
    {
        int row, column;
        cout << "Time to aim!\n";
        
        cout <<"Choose a row (type 0, 1 or 2): \n";
        cin >> row;
        
        cout <<"Choose a colum (type 0, 1 or 2 again): \n";
        cin >> column;
        
        if (discs[row][column])
        {
            discs[row][column] = 0;
            hits++;
            cout << "You hit it! " << (3-hits) << " left\n\n";
        }
        else
        {
            cout << "You missed it\n\n";
        }
        turns++;
    }
    cout << "Well done! " << "You won in " << turns << " turns\n";
}

==================================================================================================================================================

#include <iostream>
using namespace std;

/* Structures (also called structs) are a way to group several related variables into one place. 
Each variable in the structure is known as a member of the structure.

Unlike an array, a structure can contain many different data types (int, string, bool, etc.). */ 

struct fruit {string taste; string color; int amount;};//This goes outside of main when doing named structs

int main()
{
    cout << "***Structs***\n";
    struct {int myNum; string myWord;} myStruct;
    myStruct.myNum = 1;
    myStruct.myWord = "Tamarindo";
    cout << myStruct.myNum << endl;
    cout << myStruct.myWord << endl;
    cout << endl;
    
    //The following is a diffrent way to obtain the same result
    struct {int numero = 2; string palabra = "Hola";} Estructura;
    cout << Estructura.numero << endl;
    cout << Estructura.palabra << endl;
    cout << endl;

    cout << "***One struct in multiple variables***\n";
    struct {string brand; string model; int year;} car1, car2;
    car1.brand = "Toyota";
    car1.model = "Rav4";
    car1.year = 2018;
    
    car2.brand = "Mazda";
    car2.model = "C5";
    car2.year = 2017;
    
    cout << car1.brand << " " << car1.model << " " << car1.year << endl;
    cout << car2.brand << " " << car2.model << " " << car2.year << endl;
    cout << endl;
    
    cout << "***Named structs***\n";
    fruit orange;
    orange.taste = "sour";
    orange.color = "orange";
    orange.amount = 1;
    
    fruit watermelon;
    watermelon.taste = "sweet";
    watermelon.color = "green";
    watermelon.amount = 2;
    
    cout << orange.taste << " " << orange.color << " " << orange.amount << endl;
    cout << watermelon.taste << " " << watermelon.color << " " << watermelon.amount << endl;
}

==================================================================================================================================================
  
#include <iostream>
using namespace std;

enum Level {LOW=1, MEDIUM, HIGH};

int main()
{
    cout << "Enums - Group of constants (unchangeable values)\n";
    // enum Level myEnum = LOW;// 0
    // enum Level myEnum1 = MEDIUM;// 1
    enum Level myEnum2 = HIGH;// 2
    
    // cout << myEnum << endl;
    // cout << myEnum1 << endl;
    // cout << myEnum2 << endl;
    cout << "Enum with switch\n";
    switch (myEnum2)
    {
        case 1:
        cout << "Low level";
        break;
        case 2:
        cout << "Medium level";
        break;
        case 3:
        cout << "High level";
        break;
    }
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int main()
{
    cout << "***References***\n";
    // A reference variable is a "reference" to an existing variable, and it is created with the & operator
    
    string animal = "dog";
    string &pet = animal;
    
    cout << animal << " (this is the original)" << endl;
    cout << pet << " (this is the reference of the above)" << endl;
    cout << endl;
    
    cout << "***Memory address***\n";
    /* In the example from the previous page, the & operator was used to create a reference variable. 
    But it can also be used to get the memory address of a variable; which is the location of where the variable is stored on the computer.

    When a variable is created in C++, a memory address is assigned to the variable. 
    And when we assign a value to the variable, it is stored in this memory address.

    To access it, use the & operator, and the result will represent where the variable is stored*/

    cout << "Memory address of animal variable: " << &animal << endl;
    cout << "Memory address of pet reference: " << &pet << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int main()
{
    cout << "***Pointers***\n";
    
    string food = "Pizza";
    string* ptr = &food;
    
    cout << "Value of variable: "<< food << endl;
    cout << "Memory adddress of variable: " << &food << endl;
    cout << "Memory address of variable with pointer: " << ptr << endl;
    
    /*Tip: There are three ways to declare pointer variables, but the first way is preferred:

    string* mystring; // Preferred
    string *mystring;
    string * mystring;*/
    cout << endl;
    
    cout << "***Dereference***\n";
    /*In the example from the previous page, we used the pointer variable to get the memory address of a variable (used together with the & reference operator). 
    However, you can also use the pointer to get the value of the variable, by using the * operator (the dereference operator)*/
    cout << "Value of variable with pointer: " << *ptr << endl;
    /*Note that the * sign can be confusing here, as it does two different things in our code:

    1) When used in declaration (string* ptr), it creates a pointer variable.
    2) When not used in declaration, it act as a dereference operator.*/
    cout << endl;
    
    cout << "***Modify Pointer value***\n";
    /*You can also change the pointer's value. But note that this will also change the value of the original variable*/
    *ptr = "Lasagna";
    cout << "New value of pointer: " << *ptr << endl;
    cout << "New value of variable: " << food << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

void myFunction()
{
    cout << "I got executed from another function!\n";
}

int main()
{
    cout << "***Functions***\n";
    /*A function is a block of code which only runs when it is called.
You can pass data, known as parameters, into a function.
Functions are used to perform certain actions, and they are important for reusing code: Define the code once, and use it many times.*/
    myFunction();
    myFunction();
    myFunction();
}

/* The following is also possible

// Function declaration
void myFunction();

// The main method
int main() 
{
  myFunction();  // call the function
}

// Function definition
void myFunction() 
{
  cout << "I just got executed!";
} */

==================================================================================================================================================

#include <iostream>
using namespace std;

void myFunction(string firstName)
{
    cout << firstName << " Johnson" << endl;
}
int main()
{
    cout << "***Function Parameters and Arguments***\n";
    myFunction("Mike");
    myFunction("Dalila");
    myFunction("Rob");
    /*When a parameter is passed to the function, it is called an argument. So, from the example above: fname is a parameter, 
    while Liam, Jenny and Anja are arguments.*/
}

==================================================================================================================================================

#include <iostream>
using namespace std;

void myFunction(string country = "Costa Rica")
{
    cout << country << endl;
}
int main()
{
    cout << "***Default Parameter***\n";
    myFunction("Panama");
    myFunction();//Default
    myFunction("Mexico");
    /*A parameter with a default value, is often known as an "optional parameter". From the example above, 
    country is an optional parameter and "Costa Rica" is the default value.*/
}

==================================================================================================================================================

#include <iostream>
using namespace std;

void myFunction(string firstName, int age)
{
    cout << firstName << " Davidson" << " is " << age << " years old" << endl;
}
int main()
{
    cout << "***Multiple Parameters***\n";
    myFunction("Harry", 38);
    myFunction("Amanda", 28);
    myFunction("Lex", 48);
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int numFunction(int num)
{
    return num + 5;
}
int main()
{
    cout << "***Return value***"
    cout << numFunction(5);
}

==================================================================================================================================================
  
#include <iostream>
using namespace std;

int numFunction(int x, int y)
{
    return x + y;
}
int main()
{
    cout << "***Return value two Parameters and Arguments***\n";
    //cout << numFunction(1,6); This option is valid
    int result = numFunction(1,6);//Typing this other option
    cout << result << endl;//and this is recommended, better and easier to read
}

==================================================================================================================================================
  
#include <iostream>
using namespace std;

void swapNums(int &x, int &y)//Rememeber to add reference here
{
    int numExchanger = x;//Imagine this is an empty jar/box used to do the exchange/swap of x to y and y to x
    x = y;
    y = numExchanger;
}

int main()
{
    cout << "***Pass integers by Reference***\n";
    
    int firstNum = 50;
    int secondNum = 30;
    
    cout << "Before swap\n";
    cout << firstNum << secondNum << endl;
    cout << endl;

    cout << "After swap\n";
    swapNums(firstNum, secondNum);//This is what makes the swap happen
    cout << firstNum << secondNum << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

void modifyString(string &word)//Rememeber to add reference here
{
    word += "programming!";
}

int main()
{
    cout << "***Pass string by Reference***\n";

    string love = "I love ";
    modifyString(love);
    cout << love;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

void myFunction(int myArray[5])
{
    for (int num = 0; num < 5; num++)
    {
        cout << myArray[num] << endl;
    }
}

int main()
{
    cout << "***Pass Arrays as Function Parameters***\n";
    int myArray[5] = {10, 20, 30, 40, 50};
    myFunction(myArray);
    /* The function (myFunction) takes an array as its parameter (int myNumbers[5]), and loops through the array elements with the for loop.

    When the function is called inside main(), we pass along the myNumbers array, which outputs the array elements.

    Note that when you call the function, you only need to use the name of the array when passing it as an argument myFunction(myNumbers). However, the full declaration of the array is needed in the function parameter (int myNumbers[5]) */
}

==================================================================================================================================================

#include <iostream>
using namespace std;

float toCelsius(float fahrenheit)
{
    return (fahrenheit -32.0) * (5.0 / 9.0);
}

int main()
{
    cout << "***Real life example using Functions***\n\n";
    float fahrenheit = 98.8;
    float result = toCelsius(fahrenheit);
    cout << "Fahrenheit value: " << fahrenheit << endl;
    cout << "Fahrenheit to Celsius conversion value: " << result << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int additionFunction(int x, int y)
{
    return x + y;
}

    // Note: Multiple functions can have the same name as long as the number and/or type of parameters are different.

double additionFunction(double x, double y)
{
    return x+ y;
}

int main()
{
    cout << "***Function Overloading***\n";
    
    int myInt = additionFunction(5, 3);
    cout << "Function overloading with integer: " << myInt << endl;

    double myDoub = additionFunction(5.5, 3.3);
    cout << "Function overloading with double: " << myDoub << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int varGlobal = 100;//This is a global variable. Global variables are available from within any scope, global and local

void myFunc()
{
    int varLocal = 10;/*This is a local variable. A local variable cannot be used outside the function it belongs to (in this case, myFunc)
    If you try to access it outside the function, an error occurs*/

    cout << "Local variable: " << varLocal << endl;
}

//You should avoid using the same variable name for both globally and locally variables as it can lead to errors and confusion

int main()
{
    cout << "***Local and Global variables***\n";
    myFunc();
    cout << "Global variable: " << varGlobal << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

int sum(int numer)
{
    if(numer > 0)
    {
        return numer + sum(numer - 1);
    }
    else
    {
        return 0;
    }
}

/*When the sum() function is called, it adds parameter numer to the sum of all numbers smaller than numer and returns the result. 
When numer becomes 0, the function just returns 0. When running, the program follows these steps:

10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

Since the function does not call itself when numer is 0, the program stops there and returns the result */

int main()
{
    cout << "***Recursion in Functions***\n";
    int result = sum(10);
    cout << result << endl;
}
/* The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never terminates, 
or one that uses excess amounts of memory or processor power. 
However, when written correctly recursion can be a very efficient and mathematically-elegant approach to programming.*/

==================================================================================================================================================

#include <iostream>
using namespace std;

class myClass
{
    public: 
        int myNum;
        string myString;
};

/*The class keyword is used to create a class called MyClass.
The public keyword is an access specifier, which specifies that members (attributes and methods) of the class are accessible from 
outside the class. 
Inside the class, there is an integer variable myNum and a string variable myString. When variables are declared within a class, 
they are called attributes.
At last, end the class definition with a semicolon ";" */

int main()
{
    cout << "***OOP - Classes and Objects***\n";
    
    myClass myObject;
    
    myObject.myNum = 69;
    myObject.myString = "This is text from a class";
    
    cout << myObject.myNum << endl;
    cout << myObject.myString << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class Car
{
    public: 
        string brand;
        string model;
        int year;
};

int main()
{
    cout << "***Multiple objects on a class***\n";
    
    Car car1;
    Car car2;
    
    car1.brand = "Toyota";
    car1.model = "Rav4";
    car1.year = 2018;
    cout << car1.brand << " " << car1.model << " " << car1.year << endl;


    car2.brand = "Geo";
    car2.model = "Tracker";
    car2.year = 1997;
    cout << car2.brand << " " << car2.model << " " << car2.year << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class myClass //Class
{
    public: //Access specifier / Modifier
        void myMethod() //Method/function defined inside class
        {
            cout << "Class method inside class definition" << endl;
        }
};

int main()
{
    cout << "***Class methods***\n";
    myClass myObj;
    myObj.myMethod();
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class myClass //Class
{
    public: //Access specifier / Modifier
        void myMethod();
};

void myClass::myMethod() //Method/function defined outside class
{
    cout << "Class method outside class definition" << endl;
}

/* To define a function outside the class definition, you have to declare it inside the class and then define it outside of the class. 
This is done by specifiying the name of the class, followed by the scope resolution :: operator, followed by the name of the function */

int main()
{
    cout << "***Class methods***\n";
    myClass myObj;
    myObj.myMethod();
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class Car //Class
{
    public: //Access specifier / Modifier
        int speed(int maxSpeed);
};

int Car::speed(int maxSpeed) //Parameter added
{
    return maxSpeed;
}

int main()
{
    cout << "***Class method parameters***\n";
    Car car1;
    cout << "Parameter result is: " << car1.speed(200);
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class myClass //Class
{
    public: //Access specifier/modifier
        myClass() //Constructor 
        {
            cout << "Output from a constructor!\n";
        }
};

/*Note: The constructor has the same name as the class, it is always public, and it does not have any return value */

int main()
{
    cout << "***Constructors***\n";
    myClass myObj; //This calls the constructor
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class Car //Class
{
    public: //Access specifier/modifier
        string brand; //Attribute
        string model; //Attribute
        int year; //Attribute
        Car(string x, string y, int z) //Constructor with parameters
        {
            brand = x;
            model = y;
            year = z;
        }
};

int main()
{
    cout << "***Constructor Parameters***\n";
    Car car1("Toyota", "Tacoma", 2020); //This calls the constructor
    Car car2("Isuzu", "Dmax", 2024);
    
    cout << car1.brand << " " << car1.model << " " << car1.year << endl;
    cout << car2.brand << " " << car2.model << " " << car2.year << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class Car //Class
{
    public: //Access specifier/modifier
        string brand; //Attribute
        string model; //Attribute
        int year; //Attribute
        Car(string x, string y, int z); //Constructor with parameters
};

Car::Car(string x, string y, int z) //Constructor outside class
{
    brand = x;
    model = y;
    year = z;
}
        
int main()
{
    cout << "***Constructors Parameters outside class***\n";
    Car car1("Porsche", "911", 2000); //This calls the constructor
    Car car2("Lamborghini", "Diablo", 1990);
    
    cout << car1.brand << " " << car1.model << " " << car1.year << endl;
    cout << car2.brand << " " << car2.model << " " << car2.year << endl;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class myClass
{
    int a = 28;// Private attribute not specified 
    public: // Public access specifier
        int x;// Public attribute
        
    private:// Private access specifier
        int y;// Private attribute
};

/*Access specifiers

public - members are accessible from outside the class
private - members cannot be accessed (or viewed) from outside the class
protected - members cannot be accessed from outside the class, however, they can be accessed in inherited classes. 

Note: By default, all members of a class are private if you don't specify an access specifier */

int main()
{
    cout << "***Access Specifiers/modifiers***\n";
    myClass myObj;
    
    myObj.x = 5;// Allowed (public)
    myObj.y = 10;// Not allowed (private)
    myObj.a;
}

/*Tip: It is considered good practice to declare your class attributes as private (as often as you can). 
This will reduce the possibility of yourself (or others) to mess up the code. 
This is also the main ingredient of the Encapsulation concept*/

==================================================================================================================================================

#include <iostream>
using namespace std;

class Employee
{
    private://Restricted access
        int salary;//Private attribute
        
    public:
        void setSalary(int pay)//Setter
        {
            salary = pay;// with this, we link the private attribute salary to a public method setSalary and establish a value for it
        }
        int getSalary()//Getter
        {
            return salary;// with this, we can retrieve the private attribute
        }
};

/*The salary attribute is private, which have restricted access.
The public setSalary() method takes a parameter (pay) and assigns it to the salary attribute (salary = pay).
The public getSalary() method returns the value of the private salary attribute.
Inside main(), we create an object of the Employee class. Now we can use the setSalary() method to set the value of the private attribute to 500000. Then we call the getSalary() method on the object to return the value.*/

int main()
{
    cout << "***Encapsulation***\n"
    Employee myObj;
    myObj.setSalary(500000);
    cout << myObj.getSalary();
}

/*Why Encapsulation?
It is considered good practice to declare your class attributes as private (as often as you can). Encapsulation ensures better control of your data, because you (or others) can change one part of the code without affecting other parts
Increased security of data*/

==================================================================================================================================================
  
#include <iostream>
using namespace std;

class Vehicle
{
    public:
        string brand = "Ford";
        void honk()
        {
            cout << "Tuuuu, tuuuuu!\n";
        }
};

class Car : public Vehicle
{
    public:
        string model = "Mustang";
};

int main()
{
    cout << "***Inheritance***\n";
    Car myCar;
    myCar.honk();
    cout << myCar.brand + " " + myCar.model;
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class parentClass //Original
{
    public:
        void myFunction()
        {
            cout << "This belongs to parent class!\n";
        }
};

class childClass : public parentClass //Derived from original
{
    
};

class grandChild : public childClass //Derived from child
{
    
};

int main()
{
    cout << "***Multilevel Inheritance***\n";
    grandChild myObject;
    myObject.myFunction();
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class parentClass
{
    public:
        void myFunction()
        {
            cout << "This comes from parent class\n";
        }
};

class otherParentClass
{
    public:
        void myOtherFunction()
        {
            cout << "This other comes from another parent class\n";
        }
};

/*A class can also be derived from more than one base class, using a comma-separated list*/

class childClass : public parentClass, public otherParentClass {};

int main()
{
    cout << "***Multiple Inheritance***\n";
    childClass myObj;
    myObj.myFunction();
    myObj.myOtherFunction();
}

==================================================================================================================================================

#include <iostream>
using namespace std;

class Employee
{
    protected://Access specifier
        int salary;
};

//Access specifier protected is similar to private, but it can also be accessed in the inherited class

class Programmer : public Employee//Inherited/derived class
{
    public:
        int bonus;
        void setSalary(int s)//Set method
        {
            salary = s;
        }
        int getSalary()//Get method
        {
            return salary;
        }
};

int main()
{
    cout << "***Inheritance Access - Access specifiers***\n";
    Programmer myObj;
    myObj.setSalary(500000);//Calling set method
    myObj.bonus = 150000;
    cout << "Salary: " << myObj.getSalary() << endl;//Calling get method
    cout << "Bonus: " << myObj.bonus << endl;
}

==================================================================================================================================================

#include <iostream>
#include <string>

using namespace std;

class Animal
{
    public:
        void animalSound()
        {
            cout << "Animals make a particular sound \n";
        }
}; //Pay attention to this }; when using inheritance and polymorphism

class Pig : public Animal
{
    public:
        void animalSound()
        {
            cout << "The pig goes: oink oink\n";
        }
};

class Dog : public Animal
{
    public:
        void animalSound()
        {
            cout << "The dog goes: guau guau\n";
        }
};

/* Why And When To Use "Inheritance" and "Polymorphism"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class*/

int main()
{
    cout << "***Polymorphism***\n\n";
    Animal myAnimal;
    Pig myPig;
    Dog myDog;
    
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
}

==================================================================================================================================================

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
    cout << "***Create, Write and Read files***\n";
    ofstream myFile("test.txt");// Creates and writes to a file
    myFile << "There are all kinds of love in the world, but not the same love twice (F. Scott Fitzgerald)";
    myFile.close();// Closing is recommended to save changes and save memory
    
    string myText;
    ifstream myReadfile("test.txt");// Reads from a file
    while (getline (myReadfile, myText))// This is required to read line by line
    {
        cout << myText;
    }
    myReadfile.close();// Closing is recommended to save changes and save memory
}

==================================================================================================================================================

#include <iostream>

using namespace std;

int main()
{
    cout << "***Exceptions***\n\n";
    
    /*When executing C++ code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

When an error occurs, C++ will normally stop and generate an error message. The technical term for this is: C++ will throw an exception (throw an error).*/

    try
    {
        int age = 13;
        if (age >= 18)
    {
        cout << "Access granted";
    }
    else
    {
        throw (age);// This shows age
    }
}
    catch (int myAge)
    {
        cout << "Acces denied, you must be at least 18 years old\n";
        cout << "Age is: " << myAge << endl;
    }
    cout << endl;
    
    
    try
    {
        int age = 17;
        if (age > 18)
        {
            cout << "Allowed to drive";
        }
        else
        {
            throw (33);// This shows an error code
        }
    }
    catch (int errorCode)
    {
        cout << "Not old enough to drive\n";
        cout << "Error code: " << errorCode;
    }
    cout << "\n\n";
    
    
    try
    {
        int investment = 2500;
        if (investment > 3000)
        {
            cout << "You get 5% discount";
        }
        else
        {
            throw ("n/a");// This does nothing, it is just a filler
        }
    }
    catch (...)
    {
        cout << "You do not get any discount";
    }
}

==================================================================================================================================================

#include <iostream>
#include <ctime>

using namespace std;

//The time() function gives us a timestamp representing the current date and time. We can use the ctime() function to show the date and time that a timestamp represents

int main()
{
    cout << "***Date and Time***\n\n";
    struct tm datetime;
    time_t timestamp;// Get the timestamp for the current date and time
    time(&timestamp);
    cout << ctime(&timestamp);// Display the date and time represented by the timestamp
    
    /*Datetime structures
tm_sec - The seconds within a minute
tm_min - The minutes within an hour
tm_hour - The hour within a day (from 0 to 23)
tm_mday - The day of the month
tm_mon - The month (from 0 to 11 starting with January)
tm_year - The number of years since 1900
tm_wday - The weekday (from 0 to 6 starting with Sunday)
tm_yday - The day of the year (from 0 to 365 with 0 being January 1)
tm_isdst - Positive when daylight saving time is in effect, zero when not in effect and negative when unknown*/

    datetime.tm_year = 1997 - 1900;
    datetime.tm_mon = 12 - 11;
    datetime.tm_mday = 11;
    datetime.tm_hour = 12;
    datetime.tm_min = 30;
    datetime.tm_sec = 1;
    datetime.tm_isdst = -1;
    
    /*
Hours are represented in 24-hour format. 11pm would be represented as 23.
The months go from 0 to 11. For example, December would be represented as 11 rather than 12.
Years are represented relative to the year 1900. The year 2024 would be represented as 124 because 124 years have passed since 1900.*/
    
    timestamp = mktime(&datetime);
    /*The time() function can only create a timestamp for the current date, but we can create a timestamp for any date by using the mktime() function.

The mktime() function converts a datetime structure into a timestamp*/

    cout << ctime(&timestamp); //This can be used alone
    
    string weekdays[] = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
    cout << "Bebe's birthday is on a " << weekdays[datetime.tm_wday];

}

==================================================================================================================================================

#include <iostream>
#include <vector>

using namespace std;

/* A vector in C++ is like a resizable array.

Both vectors and arrays are data structures used to store multiple elements of the same data type.

The difference between an array and a vector, is that the size of an array cannot be modified (you cannot add or remove elements from an array). A vector however, can grow or shrink in size as needed */

int main()
{
    cout << "***Vectors***\n\n";
    vector<string> cars = {"Rolls Royce","Lexus","Porsche","Lamborghini"};
    
    for (string car : cars)// Access all elements of vector
    {
        cout << car << endl;
    }
    cout << endl;
    
    cout << cars[2] << endl;// Access single elements of vector

    cout << cars.front() << endl;// Access first element of vector
    cout<< cars.back() << endl;// Access last element of vector
    cout << cars.at(1) << endl;// Access single element by index
    // Note: The .at() function is often preferred over square brackets [] because it lets you know if an error occurs.
    cout << endl;
    
    // cars[0] = "Ferrari";// This does the same as the below
    // cout << cars[0] << endl;
    cars.at(0) = "Ferrari";// But this one is preferred since it is safer to use
    cout << cars.at(0) << endl;
    cout << endl;
    
    cars.push_back("Tesla");// Use the .push_back() function to add an element at the end of the vector
    cars.push_back("BMW");
    for (string car : cars)
    {
        cout << car << endl;
    }
    cout << endl;
    
    cars.pop_back();// Use the .pop_back() function to remove an element from the end of the vector
    for (string car : cars)
    {
        cout << car << endl;
    }
    // Note: Elements are usually only added and removed from the end of the vector. If you need to add or remove elements from both ends, it is often better to use a deque instead of a vector.
    cout << endl;
    
    cout << cars.size() << endl;// To get size of vector
    cout << cars.empty() << endl;// .empty() function returns 1 (true) if vector is empty and 0 (false) if it contains one or more elements
    cout << endl;
    
    for (int i = 0; i < cars.size(); i++)// For loop to get vector items
    {
        cout << cars[i] << endl;
    }
    cout << endl;
    
    for (int x = 0; x < cars.size(); x++)// For loop to get vector indexes
    {
        cout << x << endl;
    }
    
    //You can also use a for-each loop (introduced in C++ version 11 (2011), which is cleaner and more readable
    cout << endl;
    
    for (string car : cars)
    {
        cout << car << endl;
    }
}

==================================================================================================================================================

#include <iostream>
#include <list>

/*A list is similar to a vector in that it can store multiple elements of the same type and dynamically grow in size.

However, two major differences between lists and vectors are:

You can add and remove elements from both the beginning and at the end of a list, while vectors are generally optimized for adding and removing at the end.

Unlike vectors, a list does not support random access, meaning you cannot directly jump to a specific index, or access elements by index numbers.*/

using namespace std;

int main()
{
    cout << "***Lists***\n\n";
    list<string> cars = {"BMW","Lexus","Mercedez","Ferrari"};
    for (string car : cars)
    {
        cout << car << endl;
    }
    cout << endl;
    
    cout << cars.front() << endl;// Shows first element in list
    cout << cars.back() << endl;// Shows last element in list
    cout << endl;
    
    cars.front() = "Toyota";// Replace first element in list
    cars.back() = "Honda";// Replace last element in list
    cout << cars.front() << endl;
    cout << cars.back() << endl;
    cout << endl;
    
    cars.push_front("Tesla");// Add element on first position of list
    cars.push_back("Suzuki");// Add element on last position of list
    for (string car : cars)
    {
        cout << car << endl;
    }
    cout << endl;
    
    cout << cars.size() << endl;
    cout << endl;
    
    cars.pop_front();// Delete first element in list
    cars.pop_back();// Delete last element in list
        for (string car : cars)
    {
        cout << car << endl;
    }
    cout << endl;
    
    cout << cars.empty() << endl;// Outputs 1 if list is empty, 0 if it's not
    cout << endl;
    
    /* You cannot loop through the list elements with a traditional for loop combined with the .size() function, since it is not possible to access elements in a list by index:

    list<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};

    for (int i = 0; i < cars.size(); i++) 
    {
    cout << cars[i] << "\n"
    }

    The simplest way to loop through a list is with the for-each loop */

    for (string car : cars)
    {
        cout << car << endl;
    }
    cout << endl;
}

==================================================================================================================================================

#include <iostream>
#include <stack> 

using namespace std;

/* A stack stores multiple elements in a specific order, called LIFO.

LIFO stands for Last in, First Out. To vizualise LIFO, think of a pile of pancakes, where pancakes are both added and removed from the top. So when removing a pancake, it will always be the last one you added. This way of organizing elements is called LIFO in computer science and programming.

Unlike vectors, elements in the stack are not accessed by index numbers. Since elements are added and removed from the top, you can only access the element at the top of the stack */

int main()
{
    cout << "***Stacks***\n\n";
    stack<string> cars; // You cannot add elements to the stack at the time of declaration, like you can with vectors

    cars.push("Lamborghini");
    cars.push("Alpha Romeo");
    cars.push("Ferrari");// Last is first/item on top
    
    cout << cars.top() << endl;// Shows top element

    cars.top() = "Rolls Royce";// Changes value of top element
    cout << cars.top() << endl;

    cars.pop();// Removes last added element
    cout << cars.top() << endl;

    cout << cars.size() << endl;

    cout << cars.empty() << endl;// Returns 1 (true) if the stack is empty and 0 (false) otherwise
}

==================================================================================================================================================

#include <iostream>
#include <queue>

/* A queue stores multiple elements in a specific order, called FIFO.

FIFO stands for First in, First Out. To visualize FIFO, think of a queue as people standing in line in a supermarket. The first person to stand in line is also the first who can pay and leave the supermarket. This way of organizing elements is called FIFO in computer science and programming.

Unlike vectors, elements in the queue are not accessed by index numbers. Since queue elements are added at the end and removed from the front, you can only access an element at the front or the back */

using namespace std;

int main()
{
    cout << "***Queues***\n\n"; 
    queue<string> cars;//Note: You cannot add elements to the queue at the time of declaration, like you can with vectors

    cars.push("Ferrari");// Adds an element at the end of the queue
    cars.push("Lamborghini");
    cars.push("Rolls Royce");
    cout << cars.front() << endl;// Shows the value of the front element
    cout << cars.back() << endl;// Shows the value of the last element
    cout << endl;
    
    cars.front() = "Tesla";// Changes the value of the front element
    cars.back() = "Alpha Romeo";// Changes the value of the last element
    cout << cars.front() << endl;
    cout << cars.back() << endl;
    cout << endl;
    
    cars.pop();// Removes the front element 
    cout << cars.front() << endl;
    cout << endl; 
    
    cout << cars.size() << endl;
    cout << endl;
    
    cout << cars.empty() << endl;// Returns 1 (true) if the queue is empty and 0 (false) otherwise
}

==================================================================================================================================================

#include <iostream>
#include <set>

using namespace std;

/* A set stores unique elements where they:

Are sorted automatically in ascending order.
Are unique, meaning equal or duplicate values are ignored.
Can be added or removed, but the value of an existing element cannot be changed.
Cannot be accessed by index numbers, because the order is based on sorting and not indexing. */

int main()
{
    cout << "***Sets***\n\n";
    set<int> numbers = {3,2,1,6,5,4,8,7};
    
    for (int num : numbers)
    {
        cout << num << endl;
    }
    cout << endl;
    
    set<int, greater<int>> nums = {3,2,1,6,5,4,8,7};
    /* By default, the elements in a set are sorted in ascending order. If you want to reverse the order, you can use the greater<type> functor inside the angle brackets
    Note: The type specified in greater<type> must match the type of elements in the set (int in our example) */
    for (int i : nums)
    {
        cout << i << endl;
    }
    cout << endl;
    
    set<string> cars = {"Ferrari","Lamborghini","BMW","BMW","BMW"};
    //Elements in a set are unique, which means they cannot be duplicated or equal.
    for (string car : cars)
    {
        cout << car << endl;
    }
    cout << endl;
    
    cars.insert("Volvo");
    cars.erase("Volvo");
    cout << cars.size();
    cout << endl;
    
    cout << cars.empty();// Returns 1 (true) if the set is empty and 0 (false) otherwise
}

==================================================================================================================================================
  
#include <iostream>
#include <map>

using namespace std;

int main()
{
    cout << "***Maps***\n\n";
    map<string, int> people = {{"Rob",45},{"Dean",30},{"Maya",22}};
    
    cout << "Rob is " << people["Rob"] << " years old" << endl;
    //Note: The .at() function is often preferred over square brackets [] because it throws an error message if the element does not exist
    cout << "Dean is " << people.at("Dean") << " years old" << endl;
    cout << endl;
    
    people["Rob"] = 50;
    cout << "Rob is " << people["Rob"] << " years old" << endl;
    // It is safer to use the .at() function
    people.at("Dean") = 40;
    cout << "Dean is " << people.at("Dean") << " years old" << endl;
    
    people["Jenny"] = 28;// A map cannot have elements with equal keys
    people.insert({"Jenny",22});// if we try to add "Jenny" two times to the map, it will only keep the first one
    cout << endl;
    
    people.erase("Dean");
    
    cout << people.size();
    cout << endl;
    
    cout << people.empty();// Returns 1 (true) if the map is empty and 0 (false) otherwise
    cout << endl;
    
    cout << people.count("Rob");// Returns 1 (true) if the element exists and 0 (false) otherwise
    cout << "\n\n";
    
    /* Loop Through a Map
    You should use the auto keyword (introduced in C++ version 11) inside the for loop. This allows the compiler to automatically determine the correct data type for each key-value pair.
Since map elements consist of both keys and values, you have to include .first to access the keys, and .second to access values in the loop.
Elements in the map are sorted automatically in ascending order by their keys*/

    for (auto person : people)
    {
        cout << person.first << " is " << person.second << " years old " << endl;// Ascending order by key
    }
    cout << endl;
    
    
    map<string, int, greater<string>> people2 = {{"May",45},{"Fin",30},{"Luna",22}};
    
    for (auto person : people2)
    {
        cout << person.first << " is " << person.second << " years old " << endl;// Descending order by key
    }
}

==================================================================================================================================================

#include <iostream>
#include <vector>

using namespace std;

/* First we create a vector of strings to store the names of different car manufactures.
Then we create a "vector iterator" called it, that we will use to loop through the vector.
Next, we use a for loop to loop through the vector with the iterator. The iterator (it) points to the first element in the vector (cars.begin()) and the loop continues as long as it is not equal to cars.end().
The increment operator (++it) moves the iterator to the next element in the vector.
The dereference operator (*it) accesses the element the iterator points to. */

int main()
{
    cout << "***Iterators***\n" << endl;
    vector<string> cars = {"Ferrari","Lamborghini","Rolls Royce","Mercedez"};
    vector<string> :: iterator iter;
    
    for (iter = cars.begin(); iter != cars.end(); ++iter)
    {
        cout << *iter << endl;
    }
}

/* What is begin() and end()?
begin() and end() are functions that belong to data structures, such as vectors and lists. They do not belong to the iterator itself. Instead, they are used with iterators to access and iterate through the elements of these data structures.

begin() returns an iterator that points to the first element of the data structure.
end() returns an iterator that points to one position after the last element. */

==================================================================================================================================================

#include <iostream>
#include <vector>

using namespace std;

int main()
{
    cout << "***Iterators - auto keyword***\n" << endl;
    vector<string> cars = {"Ferrari","Lamborghini","Rolls Royce","Mercedez"};
    vector<string> :: iterator iter;
    
    for (iter = cars.begin(); iter != cars.end(); ++iter)
    {
        cout << *iter << endl;
    }
    cout << endl;
    
    iter = cars.begin();// Points to the first element in the vector
    cout << *iter << endl;
    
    iter = cars.begin() +1;// Points to the second element 
    cout << *iter << endl;
    
    iter = cars.begin() +2;// Points to the third element 
    cout << *iter << endl;
    cout << endl;
    
    
    iter = cars.end() -2;// Points to penultimate element
    cout << *iter << endl;
        /* Why do we say "point"?

Iterators are like "pointers" in that they "point" to elements in a data structure rather than returning values from them. They refer to a specific position, providing a way to access and modify the value when needed, without making a copy of it*/
    *iter = "Volvo";// Replaces penultimate element for Volvo
    cout << *iter << endl;
    cout << endl;

    /* The auto Keyword
In C++ 11 and later versions, you can use the auto keyword instead of explicitly declaring and specifying the type of the iterator.

The auto keyword allows the compiler to automatically determine the correct data type, which simplifies the code and makes it more readable:

Instead of this:

vector<string>::iterator it = cars.begin();

You can simply write this:

auto it = cars.begin(); */

    for (iter = cars.begin(); iter != cars.end(); ++iter)// This is larger
    {
        cout << *iter << endl;
    }
    cout << endl;
    
    for (auto it = cars.begin(); it != cars.end(); ++it)// This is shorter
    {
        cout << *it << endl;
    }
    cout << endl;
}

==================================================================================================================================================

#include <iostream>
#include <vector>
#include <map>

using namespace std;

int main()
{
    cout << "***Iterator vs ForEach loop***\n" << endl;
    vector<string> cars = {"Ferrari","Lamborghini","Rolls Royce","Mercedez"};
    vector<string> :: iterator iter;
    
    for (string car : cars)
    {
        cout << car << endl;
    }
    cout << endl;
    /*When you are just reading the elements, and don't need to modify them, the for-each loop is much simpler and cleaner than iterators.

However, when you need to add, modify, or remove elements during iteration, iterate in reverse, or skip elements, you should use iterators*/
    for (auto iter = cars.begin(); iter != cars.end();)
    {
        if (*iter == "Mercedez")
        {
            iter = cars.erase(iter);
        }
        else
        {
            ++iter;
        }
    }
    
    for (const string& item : cars)
    {
        cout << item << endl;
    }
    cout << endl;
    
    
    //To iterate in reverse order, you can use rbegin() and rend() instead of begin() and end()
    for (auto it = cars.rbegin(); it != cars.rend(); ++it)
    {
        cout << *it << endl;
    }
    cout << endl;
    
    //Iterators are great for code reusability since you can use the same syntax for iterating through vectors, lists, deques, sets and maps (see below)
    
    map<string, int> people = { {"Maya", 32}, {"Luna", 45}, {"Bonete", 29} };
    // Loop through the map with an iterator
    for (auto it = people.begin(); it != people.end(); ++it) 
    {
      cout << it->first << " is " << it->second << " years old" << "\n";
    }
    cout << endl;
    
    for (auto it = people.rbegin(); it != people.rend(); ++it)// In reverse order
    {
      cout << it->first << " is " << it->second << " years old" << "\n";
    }
    
    /*Iterator Support
    The examples above shows how to iterate through different data structures that support iterators (vector, list, deque, map and set support iterators, while stacks and queues do not) */
}    
    
==================================================================================================================================================

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

/* Another important feature of iterators is that they are used with different algorithm functions, such as sort() and find() (found in the <algorithm> library), to sort and search for elements in a data structure.

For example, the sort() function takes iterators (typically returned by begin() and end()) as parameters to sort elements in a data structure from the beginning to the end */

int main()
{
    cout << "***Iterators and Algorithms***\n" << endl;
    vector<string> cars = {"Ferrari","Lamborghini","Rolls Royce","Aston Martin"};
    sort(cars.begin(), cars.end());//Sorts from A to Z
    
    for (string car : cars)
    {
        cout << car << endl;
    }
    cout << endl;
    
    vector<int> numbers = {55,22,99,11};// Sorts from lower to higher
    
    sort(numbers.begin(), numbers.end());
    for (int num : numbers)
    {
        cout << num <<  endl;
    }
    cout << endl;
    
    sort(numbers.rbegin(), numbers.rend());// Sorts from higher to lower
    for (int nu : numbers)
    {
        cout << nu << endl;
    }
}    

==================================================================================================================================================


    
