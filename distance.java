import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the speed:");
        int speed = scanner.nextInt();

        System.out.print("Enter the time:");
        int time = scanner.nextInt();

        Distance(speed, time);
    }

    public static void Distance(int speed, int time) {
        double answer_distance = speed * time;
        System.out.print("The distance will be " + answer_distance);
    }
}