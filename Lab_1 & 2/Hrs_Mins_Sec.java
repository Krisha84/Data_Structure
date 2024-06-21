import java.util.*;
public class Hrs_Mins_Sec {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int seconds = in.nextInt();

        int sec = seconds % 60;  
        int hrs = seconds / 60;
        int mins = hrs % 60;     
        hrs = hrs / 60;           

        System.out.println(hrs + ":" + mins + ":" + sec);
    }
}