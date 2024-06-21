import java.util.*;
public class Year_Week_Day {
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of days : ");
        int m = s.nextInt();

        int year = m / 365;
        m = m % 365;
        System.out.println("No. of years : "+year);

        int week = m / 7;
        m = m % 7;
        System.out.println("No. of weeks : "+week);

        int day = m;
        System.out.println("No. of days : "+day);
    }
}