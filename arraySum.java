// 1.Take an input N, the size of array.
// 2.Take N more inputs and store that in an array.
// 3.Take an input M, the size of array.
// 4.Take M more inputs and store that in an another array.


// Write a function that returns the sum of two arrays. Print the value returned.

// Example(To be used only for expected output):
// Input:
// 4
// 1 0 2 9
// 5
// 3 4 5 6 7
// Output:
// 3 5 5 9 6 

import java.util.*;
public class arraySum{
    public static Scanner scn = new Scanner(System.in);
    public static void fill(int [] arr){
        for(int i = 0 ; i< arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }
    public static void main(String[]args){
        int n = scn.nextInt();
        
        int [] a = new int [n];
        fill(a);
        int m = scn.nextInt();
        int [] b = new int [m];
        fill(b);
        int size = a.length>b.length? a.length+1 : b.length+1;
        int [] ans = new int[size];
        int i = a.length-1;
        int j = b.length-1;
        int k = ans.length-1;
        int sum = 0;
        int carry = 0;
        while(i>=0 && j>=0){
            sum = a[i]+b[j]+carry;
            carry= sum/10;
            sum%=10;
            ans[k] = sum;
            i--; j--; k--;
        }
        if(i>=0){
            while(i>=0){
                sum = a[i]+carry;
                carry = sum/10;
                sum%=10;
                ans[k] = sum;
                i--; k--;
            }
        }
        if(j>=0){
            while(j>=0){
                sum = b[j]+carry;
                carry = sum /10;
                sum%=10;
                ans[k] = sum;
                j--; k--;

            }
            
        }
        if(carry>0){
            ans[k] = carry;
        }
        if(ans[0] == 0){
            for(int z = 1; z<ans.length; z++){
                System.out.print(ans[z]+" ");

            }
        }
        else{
            for(int z = 0; z<ans.length; z++){
                System.out.print(ans[z]+" ");
            }
        }
        
    }

}