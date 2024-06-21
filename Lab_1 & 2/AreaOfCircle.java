
import java.util.*;
public class AreaOfCircle{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter the radius of circle : ");
    double r=sc.nextDouble();

    double ans=Math.PI*r*r;

    System.out.println("Area of circle : "+ans);

    }
}
