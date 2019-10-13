import java.util.Scanner;

public class car {
    int yearModel;
    String make;
    int speed;

    car(int yearModel, String make, int speed) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
    }

    public int getmodel() {
        return yearModel;
    }

    public void setmodel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getmake() {
        return make;
    }

    public void setmake(String make) {
        this.make = make;
    }

    public int getspeed() {
        return speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }

    public int accelerate(int speed) {
        speed += 5;
        System.out.printf("\nNow the car speed up with %d\n--------------------------", speed);
        return speed;
    }

    public int brake(int speed) {
        speed -= 5;
        System.out.printf("\nNow the car slow down with %d\n--------------------------", speed);
        return speed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the car's year model:");
        int model = scanner.nextInt();
        scanner.nextLine(); // Why we need this is nextInt() don't read the newline-character.
                            // We need to put scanner.nextLine to let the application read newline
        System.out.println("Enter the make of car:");
        String carmake = scanner.nextLine();

        System.out.println("Enter the car speed:");
        int carspeed = scanner.nextInt();

        car info = new car(model, carmake, carspeed);

        for (int i = 0; i < 5; i++) {
            int aspeed = info.accelerate(info.getspeed());
            info.setspeed(aspeed);
        }

        for (int i = 0; i < 5; i++) {
            int dspeed = info.brake(info.getspeed());
            info.setspeed(dspeed);
        }
    }
}
