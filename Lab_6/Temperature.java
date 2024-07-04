import java.util.*;
public class Temperature{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double f = celsiusToFahrenheit(celsius);

        double c = fahrenheitToCelsius(fahrenheitInput);

        System.out.println("---Converted_Temperature---");
        System.out.println("");
        System.out.println(celsius + " degrees Celsius = " + f + " degrees Fahrenheit");
        System.out.println("");
        System.out.println(fahrenheit + " degrees Fahrenheit = " + c + " degrees Celsius");

    }

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}