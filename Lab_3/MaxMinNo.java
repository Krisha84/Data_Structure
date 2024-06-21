import java.util.*;
public class MaxMinNo{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of Array : ");
        int n=sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter an element into array["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        int min=arr[0];
        int max=arr[0];

        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        } 

        System.out.println("\n");

        for(int i=0;i<n;i++){
            if(arr[i]==max){
                System.out.println("The Maximum number "+max+" at position of "+i);
            }

            if(arr[i]==min){
                System.out.println("The Minimum number "+min+" at position of "+i);
            }
        }
    }
}
