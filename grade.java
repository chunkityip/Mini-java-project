import java.util.Scanner;

public class grade {

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first score:");
        int score1 = scanner.nextInt();

        System.out.print("Enter the second score:");
        int score2 = scanner.nextInt();

        System.out.print("Enter the third score:");
        int score3 = scanner.nextInt();

        System.out.print("Enter the four score:");
        int score4 = scanner.nextInt();

        System.out.print("Enter the fifth score:");
        int score5 = scanner.nextInt();

        double answer = calcAverage(score1, score2, score3, score4, score5);
        determineGrade(answer);

    }

    // This method is counting the 5 score and get the Average call Ave_score
    public static double calcAverage(int score1, int score2, int score3, int score4, int score5) {
        double Ave_score = (score1 + score2 + score3 + score4 + score5) / 5;
        return Ave_score;

    }

    // This method is counting Ave_score to get a letter grade
    public static void determineGrade(double Ave_score) {
        if (Ave_score >= 90 && Ave_score == 90)
            System.out.print("Your score is " + Ave_score + "." + "Therefore, you get a A");
        else if (Ave_score >= 80 && Ave_score == 89)
            System.out.print("Your score is " + Ave_score + "." + "Therefore, you get a B");
        else if (Ave_score >= 70 && Ave_score == 79)
            System.out.print("Your score is " + Ave_score + "." + "Therefore, you get a C");
        else if (Ave_score >= 60 && Ave_score == 69)
            System.out.print("Your score is " + Ave_score + "." + "Therefore, you get a D");
        else if (Ave_score < 60)
            System.out.print("Your score is " + Ave_score + "." + "Therefore, you get a F");
    }
}