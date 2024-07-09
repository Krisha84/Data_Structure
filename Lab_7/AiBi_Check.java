import java.util.*;
public class AiBi_Check{
    public static boolean isAiBi(String s){
        int n = s.length();
        int aCount = 0;
        int bCount = 0;
        
        if(n<2){
            return false;
        }

        int i = 0;
        while(i<n && s.charAt(i)=='a'){
            aCount++;
            i++;
        }
        
        while(i<n && s.charAt(i)=='b'){
            bCount++;
            i++;
        }

        return (i == n && aCount == bCount && aCount >= 1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String input = sc.nextLine();

        if (isAiBi(input)){
            System.out.println("The string "+input+" is of the form a^i b^i where i >= 1");
        } 
        else{
            System.out.println("The string "+input+" is NOT of the form a^i b^i where i >= 1");
        }
    }
}
