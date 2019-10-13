import java.util.Scanner;

public class conversion1 {
    public static void main(String[] args) {

        int choice;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a distance in meters:");
        double meters = scanner.nextDouble();
        do {
            menu();
            System.out.print("Enter your choice:");
            choice = scanner.nextInt();

            if (choice == 1)
                showKilometers(meters);
            else if (choice == 2)
                showInches(meters);
            else if (choice == 3)
                showFeet(meters);
            else
                System.out.println("Bye!");
        } while (choice != 4);
    }

    /**
     * menu(); System.out.print("Enter your choice:"); int choice_2 =
     * scanner.nextInt();
     */
    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.println(meters + " meters is " + kilometers + " kilometers");
    }

    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.println(meters + " meters is " + inches + " inches");
    }

    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.println(meters + " meters is " + feet + " feet");
    }

}
