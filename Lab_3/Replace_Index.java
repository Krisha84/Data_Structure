
import java.util.*;
public class Replace_Index{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1stnumber to exchange from array");
        int a=sc.nextInt();
        System.out.println("enter the 2nd number to exchange with from array");
        int b=sc.nextInt();
        System.out.println("enter the number of digits in the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of array");
            arr[i]=sc.nextInt();
        }
       
        int temp=a;
        a=b;
        b=temp;
        for(int i=0;i<n;i++){
          // if(arr[i]==a||arr[i]==b){
          //   System.out.println(i);
          // }        
          System.out.println("Final array="+arr[i]);
        }
        for(int i=0;i<n;i++){
          if(arr[i]==a||arr[i]==b){
            System.out.println("Indexes are:"+i);
          }
       }        
        
    }
}
