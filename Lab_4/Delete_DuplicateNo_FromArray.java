import java.util.*;
public class Delete_DuplicateNo_FromArray{
    public static void removeDuplicateElement(int a[], int n){

        int j = 0;
        Arrays.sort(a);

        for (int i=0;i<n-1;i++){
            if (a[i] != a[i+1]) {
                a[j++] = a[i];
            }
        }  

        a[j++] = a[n-1];

        System.out.println("-------");

        for (int i=0;i<j;i++){
            System.out.println("array["+i+"] : "+a[i]);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n=sc.nextInt();

        int []a=new int[n];

        System.out.println("-------");

        for(int i=0;i<n;i++){
            System.out.println("Enter an element into array["+i+"] : ");
            a[i]=sc.nextInt();
        }

        removeDuplicateElement(a, n);

    }
}