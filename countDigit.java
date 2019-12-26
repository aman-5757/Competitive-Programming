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
