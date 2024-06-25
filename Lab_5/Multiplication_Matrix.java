
import java.util.*;
public class Multiplication_Matrix{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        int [][] arr1=new int[3][2];
        System.out.println("---MAtrix_A---");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter an element into array["+i+"]["+j+"] : ");
                arr1[i][j]=sc.nextInt(); 
            }
        }

        int [][] arr2=new int[2][3];
        System.out.println("---MAtrix_B---");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter an element into array["+i+"]["+j+"] : ");
                arr2[i][j]=sc.nextInt();  
            }
        }

        int [][] arr3=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr3[i][j]=0;
                for(int k=0;k<2;k++){
                    arr3[i][j]+=(((arr1[i][k])*(arr2[k][j])));
                }
            }
        }

        System.out.println("---Ans---");
        for(int i=0;i<3;i++){
            System.out.print("| ");
            for(int j=0;j<3;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("|");
        }
    }
}
