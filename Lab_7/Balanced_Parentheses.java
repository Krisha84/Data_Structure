import java.util.*;
public class Balanced_Parentheses{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases: ");
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            System.out.println("Enter string for test case " + (i+1) + ": ");
            String input = sc.next();
            
            if(isBalanced(input)){
                System.out.println("1");
            } 
            else{
                System.out.println("0");
            }
        }
    }
    
    public static boolean isBalanced(String s){
        int balance = 0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c=='(' || c=='{' || c=='['){
                balance++;
            } 
            else if(c==')' || c=='}' || c==']'){
                balance--;
            }
            
            if(balance<0){
                return false;
            }
        }
        return balance == 0;
    }
}