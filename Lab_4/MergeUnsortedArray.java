import java.util.*;
public class MergeUnsortedArray{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array 1: ");
        int n=sc.nextInt();

        int []arr1=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter an element into array["+i+"] : ");
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the length of array 2: ");
        int m=sc.nextInt();

        int []arr2=new int[m];

        for(int i=0;i<m;i++){
            System.out.print("Enter an element into array["+i+"] : ");
            arr2[i]=sc.nextInt();
        }
        
        int k = n + m;

        int arr3 [] = new int[k];

        int index = 0;

        for(int i=0;i<n;i++){
            arr3[index] = arr1[i];
            index++;
        }

        for(int i=0;i<m;i++){
            arr3[index] = arr2[i];
            index++;
        }
        
        System.out.println("Merged array is: "); 
        for(int i=0;i<k ;i++){
            System.out.println("array["+i+"] : "+arr3[i]);
        }
    }
}
