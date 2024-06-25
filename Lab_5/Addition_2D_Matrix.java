import java.util.*;
public class Addition_2D_Matrix{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        int [][] arr1=new int[2][2];
        System.out.println("---MAtrix_A---");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){

                System.out.println("Enter an element into array["+i+"]["+j+"] : ");
                arr1[i][j]=sc.nextInt(); 
            }
        }

        int [][] arr2=new int[2][2];
        System.out.println("---MAtrix_B---");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){

                System.out.println("Enter an element into array["+i+"]["+j+"] : ");
                arr2[i][j]=sc.nextInt(); 
            }
        }

        int [][] arr3=new int[2][2];
        System.out.println("---Ans---");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i=0;i<2;i++){
            System.out.print("| ");
            for(int j=0;j<2;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("|");
        }
   }
}
