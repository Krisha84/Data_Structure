import java.util.*;
public class Pascal_Triangle{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int row=sc.nextInt();

        System.out.println("--Pascal_Triangle--");

        for(int i=0; i<row; i++){
            for(int space=row; space>i; space--){
                System.out.print(" ");
            }

            int num=1;

            for(int j=0; j<=i; j++){
                System.out.print(num+ " ");
                num = num*(i-j)/(j+1);
            }
            System.out.print("\n");
        }
   }
}
