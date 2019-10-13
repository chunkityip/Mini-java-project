import java.util.Scanner;

public class Celsius_Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a fahrenheit:");
        int fahrenheit = scanner.nextInt();

        double answer = celsius(fahrenheit);
        System.out.println("The celsius will be " + answer);

    }

    public static double celsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}