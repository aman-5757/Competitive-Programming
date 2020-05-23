import java.util.*;
public class array2D{
    public static Scanner scn = new Scanner(System.in);
    public static void fill(int [][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void display(int [][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int [][] mult(int [][]a, int [][]b){
        int [][] ans = new int[a.length][b[0].length];
        for(int i = 0 ; i<a.length; i++){
            for(int j = 0; j<b.length; j++){
                for(int k = 0; k<ans.length; k++){
                    ans[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return ans;
    }

    public static void wave(int [][]arr){
        for(int i = 0; i<arr.length; i++){
            if(i%2==0){
                for(int j = 0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j = arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }


    public static void spiral(int [][] arr){
        int c = 0;
        int minc = 0, maxr = arr.length-1, maxc = arr[0].length-1, minr= 0;
        while(c<arr[0].length*arr.length){
            for(int i = minc; i<=maxc; i++){
                System.out.print(arr[minr][i]+" ");
                c++;
            }
            minr++;
            for(int i = minr; i<=maxr; i++){
                System.out.print(arr[i][maxc]+" ");
                c++;
            }
            maxc--;
            for(int i = maxc; i>=minc; i--){
                System.out.print(arr[maxr][i]+" ");
                c++;
            }
            maxr--;
            for(int i = maxr; i>=minr; i--){
                System.out.print(arr[i][minc]+" ");
                c++;
            }
            minc++;
        }
    }


    public static void main(String[]args){
        int [][] arr = {{9,3,1,2},{6,0,2,4},{7,1,0,3},{5,2,4,8}};
        // wave(arr);
        spiral(arr);
    }
}