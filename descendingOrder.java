import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
  public static int sortDesc(int num) {
    String[] stringArray = String.valueOf(num).split("");//Changes num to string with String.valueOf, then splits it (with a "") with .split into an array and assigns this value to a stringArray
    Arrays.sort(stringArray, Collections.reverseOrder());//Sorts stringArray using Collections with .reverseOrder to invert the original order of characters
    return Integer.valueOf(String.join("", stringArray));//Changes stringArray back to integer and concatenates values together to form one output string
  }
}

/*One way to test this code is the following: */

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int num = 42145;//This value can be changed as desired to test code
        String[] stringArray = String.valueOf(num).split(""); 
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.print(Integer.valueOf(String.join("", stringArray)));
    }
}
