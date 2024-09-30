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

