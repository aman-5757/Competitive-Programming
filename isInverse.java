// 1.Take an input N, the size of array.
// 2.Take N more inputs and store that in an array.

// Write a function which returns true if the second array is inverse of first and
// false otherwise. Print the value returned.

// Example(To be used only for expected output):
// Input:
// 4
// 1 2 3 0
// 3 0 1 2
// Output:
// true

//---------------------------------------------------------------------------------

import java.util.*;
public class isInverse{
    public static Scanner scn = new Scanner(System.in);
    public static void fill(int [] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }
    public static boolean isInverse(int [] arr, int [] inv){
        int [] r = new int [arr.length];
        boolean ans = true;
        for(int i = 0; i< arr. length; i++){
            int p = arr[i];
            r[p] = i;
        }
        for(int i = 0; i<arr.length; i++){
            if(inv[i]!=r[i]){
                ans = false;
                break;
            }
        }

        return ans;
    }
    public static void main(String[]args){
        int n = scn.nextInt();
        int [] arr = new int [n];
        fill(arr);
        int [] inv = new int [n];
        fill(inv);
        boolean ans = isInverse(arr,inv);
        System.out.print(ans);

    }
}