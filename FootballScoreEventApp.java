import java.util.Scanner;

public class FootballScoreEventApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreSource source = new ScoreSource();

        Subscriber s1 = new Subscriber("live result");
        Subscriber s2 = new Subscriber("live result");

        source.addScoreListener(s1);
        source.addScoreListener(s2);

        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Program terminated.");
                break;
            }

            source.setScoreLine(input);
        }

        scanner.close();
    }
}
