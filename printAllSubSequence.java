//ALL SUBSEQUENCE OF "abc" WILL BE c b bc a ac ab abc

import java.util.Scanner;
public class printAllSubSequence{
    public static Scanner scn = new Scanner(System.in);

    public static void allSubSequence(String que, String ans){
        if(que.length()==0){
            if(ans.length()>0){
                System.out.println(ans);
            }
            return;
        }
        char ch = que.charAt(0);
        String roq = que.substring(1);

        allSubSequence(roq,ans);    //when character doesn't paricipate
        allSubSequence(roq, ans+ch);    //when character paricipates
    }
    public static void main(String[]args){
        String que  = scn.nextLine();
        allSubSequence(que,"");
        System.out.println();
    }
}