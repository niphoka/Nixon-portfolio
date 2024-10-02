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
    string firstName = "Jim";
    string lastName = "Morrison";
    cout << "The Doors singer was " << firstName + " " + lastName << endl;
    
    //Note the extra space after "Michael" since append function does not add it
    string firstN = "Michael ";
    string lastN = "Jackson";
    string fullN = firstN.append(lastN);
    cout << fullN;
}
