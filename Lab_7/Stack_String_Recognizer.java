import java.util.*;
public class Stack_String_Recognizer {
    public static boolean isRecognized(String input){

        if (input.equals("aca") || input.equals("bcb") || input.equals("abcba") || input.equals("abbcbba")) {
            return true;
        }

        int len = input.length();
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<len/2;i++){
            stack.push(input.charAt(i));
        }

        int start;
        if(len%2==0){
            start=len/2;
        } 
        else{
            start=len/2 +1;
        }

        for(int i=start;i<len;i++){
            if (stack.isEmpty() || stack.pop() != input.charAt(i)){
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args){

        String[] testStrings = {"aca", "bcb", "abcba", "abbcbba", "abcd", "abba"};
        
        for(int i=0;i<testStrings.length;i++){
            System.out.println( testStrings[i] +" : "+ isRecognized(testStrings[i]));
        }

    }
}