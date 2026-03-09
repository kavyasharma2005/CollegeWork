import java.util.Scanner;
public class cel_to_far {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5.0) + 32.0;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
    }
}