import java.util.Scanner;
public class DeleteNoFromSortedArray{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int []arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter an element into array["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the intex which you want to delete : ");
        int a=sc.nextInt();

        int []array = new int[n-1];

        for(int i=0;i<(n-1);i++){
            if(i==a || i>a){
                array[i] = arr[i+1];
            }
            else{
                array[i] = arr[i];
            }
        }

        System.out.println("final array is : ");
        for(int i=0;i<(n-1);i++){
            System.out.println("array["+i+"] : "+array[i]);
        }
    }
}
