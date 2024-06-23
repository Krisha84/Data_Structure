import java.util.*;
public class Delete_Location{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n=sc.nextInt();

        int[]arr=new int[n];
        int[]temp=new int[n-1];

        for(int i=0;i<n;i++){
            System.out.print("Enter an element into array["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the index where the number is to be deleted : ");
        int index=sc.nextInt();
    
        for(int i=0;i<(n);i++){
            if(i==index){
                int k=i;
                for(int j=k+1;j<n;j++){
                    temp[k]=arr[j];
                    k++;
                }
            }
            else if(i<index){
                temp[i]=arr[i];
            }
        }

        System.out.println("final array is :");
        for(int i=0;i<(n-1);i++){
            System.out.println("arr["+i+"] : "+temp[i]);
        }
    }
}


// import java.util.*;
// public class Delete_Location{
//     public static void main(String[]args){

//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the length of array : ");
//         int n=sc.nextInt();

//         int []arr=new int[n];

//         for(int i=0;i<n;i++){
//             System.out.print("Enter an element into array["+i+"] : ");
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("Enter the location of the element to be deleted : ");
//         int l=sc.nextInt();

//         int []array = new int[n-1];

//         for(int j=0;j<(n-1);j++){
//             if(j>=l){
//                 array[j] = arr[j+1];
//             }
//             else if(j<l){
//                 array[j]=arr[j];
//             }
//         }

//         System.out.println("final array is : ");
//         for(int i=0;i<(n+1);i++){
//             System.out.println("array["+i+"] : "+array[i]);
//         }
//     }
// }