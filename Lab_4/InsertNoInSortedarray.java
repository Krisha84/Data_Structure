import java.util.*;
public class InsertNoInSortedarray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n=sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter an element into array["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number to insert into array : ");
        int a=sc.nextInt();

        int []array = new int[n+1];

        for(int i=0;i<n;i++){
            if(arr[i]  < a){
                array[i] = arr[i];
            }
            else{
                array[i] = a;

                for(int j=i+1;j<(n+1);j++){
                    array[j] = arr[j-1];
                }

                break;
            }
        }

        // for(int j=0;j<n;j++){
        //     if(a<=arr[j]){
        //         array[j] = a;
        //     }
        //     else if(a>arr[j]){
        //         array[j+1] = arr[j];
        //     }
        // }

        System.out.println("final array is : ");
        for(int i=0;i<(n+1);i++){
            System.out.println("array["+i+"] : "+array[i]);
        }
    }
}




