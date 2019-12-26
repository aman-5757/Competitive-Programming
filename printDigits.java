import java.util.*;
    
    public class printDigits{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d=0;
        int n=scn.nextInt();
        int a=n;
        
        while(n!=0){
            d++;
            n/=10;
        }
        
        while(d>0){
            int p=a/(int)(Math.pow(10,d-1));
            System.out.println(p);
            a=a%(int)(Math.pow(10,d-1));
            d--;
            
        }
    }
    }
