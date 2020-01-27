import java.util.*;
public class waveOne{
    public static Scanner scn = new Scanner(System.in);
    public static void display(int [][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j]);
            }System.out.println();
        }
    }
    public static void fill(int [][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void cw(int [][] arr){
        for(int j =0; j<arr[0].length;j++){
            if(j%2==0){
                for(int i = 0; i<arr.length; i++){
                    System.out.print(arr[i][j]+" ");

                }
                

            }
            else{
                for(int i = arr.length-1; i>=0; i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            
            
        }
    }


    public static void rw(int [][] arr){
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


    public static void main(String[]args){
        int r = scn.nextInt();
        int c = scn.nextInt();

        int [][] arr = new int [r][c];
        fill(arr);
        rw(arr);
        System.out.println();
        cw(arr);

    }
}