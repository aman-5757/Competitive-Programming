//****To find the GCD and LCM of two numbers****


import java.util.*;
    
    public class gcdLcm{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int num1 = scn.nextInt();
       int num2 = scn.nextInt();
       int n1=num1;     int n2=num2;
       while(num1%num2!=0){
           int r=num1%num2;
           num1= num2;
           num2 = r;
       }
        int a=num2;
        int b=(n1*n2)/a;
        System.out.println(a);
        System.out.println(b);

        
    }
    }