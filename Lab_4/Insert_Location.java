import java.util.*;
public class Insert_Location{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n=sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter an element into array["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number to insert into array : ");
        int a=sc.nextInt();

        System.out.println("Enter the location of a : ");
        int l=sc.nextInt();

        int []array = new int[n+1];

        for(int j=0;j<(n+1);j++){
            if(j<l){
                array[j] = arr[j];
            }
            else if(j==l){
                array[l]=a;
            }
            else{
                array[j] = arr[j-1];
            }
        }

        System.out.println("final array is : ");
        for(int i=0;i<(n+1);i++){
            System.out.println("array["+i+"] : "+array[i]);
        }
    }
}

// import java.util.*;
// public class Insert_Location{
//     public static void main(String[]args){

//         Scanner sc=new Scanner(System.in);

//         System.out.println("enter the number of digits of array");
//         int n=sc.nextInt();

//         int[]arr=new int[n];
//         int[]temp=new int[n+1];

//         System.out.println("enter the value of array:");
//         for(int i=0;i<n;i++){
//             System.out.print("arr["+i+"]=");
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("enter the number to insert");
//         int num=sc.nextInt();

//         System.out.println("enter the index where the number is to be inserted");
//         int index=sc.nextInt();
    
//         for(int i=0;i<=n;i++){
//             if(i==index){
//                 temp[i]=num;
//                 int k=i;

//                 for(int j=k+1;j<=n;j++){
//                     temp[j]=arr[k];
//                     k++;
//                 }
//             }
//             else if(i<index){
//                 temp[i]=arr[i];
//             }
//         }

//         System.out.println("final array is:");
//         for(int i=0;i<=n;i++){
//             System.out.println("arr["+i+"]="+temp[i]);
//         }
//     }
// }

