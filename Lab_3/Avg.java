
import java.util.*;
public class Avg{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++){
            sum+=i;
        }

        double avg=sum/n;

        System.out.println("Avg : "+avg);
    }
}
