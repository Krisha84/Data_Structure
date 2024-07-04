import java.util.*;
public class Swap_Number{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();

        System.out.println("");
        System.out.println("---Before_Swap---");
        System.out.println("A : "+a+"\nB : "+b);
        Swap(a,b);

    }
    
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("---After_Swap---");
        System.out.println("A : "+a+"\nB : "+b);
    }
}
