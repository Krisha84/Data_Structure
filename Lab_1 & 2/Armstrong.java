import java.util.*;
public class Armstrong{
    public static void main(String[] args) {

        System.out.println("Armstrong numbers from 1 to 1000: ");

        int n, count = 0, a, b,sum = 0;
        for(int i = 1; i <= 1000; i++){
            n = i;

            while(n > 0){
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }

            if(sum == i){
                System.out.println(i+" ");
            }
            sum = 0;
        }
    }
}
