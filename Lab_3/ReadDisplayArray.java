import java.util.*;
public class ReadDisplayArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n=sc.nextInt();

        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter an element into arr["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<n;j++){
            System.out.println("arr["+j+"]="+arr[j]);
        }  
    }
}
