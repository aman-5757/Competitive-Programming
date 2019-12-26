import java.util.*;
    
    public class countDigit{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d=0;
        int n=scn.nextInt();
        while(n!=0){
            d++;
            n/=10;
        }
        System.out.print(d);
    }
    }


// Question
// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits have to be counted.
// 3. Print the digits in that number.

// Input Format
// "n" where n is an integer.

// Output Format
// "d" where d is the number of digits in the number "n"

// Constraints
// 1 <= n < 10^9

// Sample Input
// 65784383

// Sample Output
// 8
