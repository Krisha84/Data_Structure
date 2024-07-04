import java.util.*;
public class Replace_UpperLower{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.next();

        System.out.println("Original String : "+str);
        String finalstr = "";

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);

            if(c>='A' && c<='Z'){
                c = (char)(c+32);
            }
            else if(c>='a' && c<='z'){
                c = (char)(c-32);     
            }

            finalstr = finalstr + c; 

        }

        System.out.println("Final String:"+finalstr);
    }
}
