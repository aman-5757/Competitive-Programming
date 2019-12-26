import java.util.*;
  
  public class primeOrNot{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
        int t= scn.nextInt();
        
        for (int i=1;i<=t;i++){
            int c=0;
            int n = scn.nextInt();
            for(int j=2; j*j<=n;j++){
                if(n%j==0){
                    c++;
                    break;
                }
            }if (c!=0){
                System.out.print("not prime");
            }
            else    System.out.print("prime");
            
        }
   }
  }
