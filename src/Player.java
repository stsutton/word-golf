import java.util.Scanner;

public class Player {
    private static int playerCount = 0;
    private int numSentences;
    private int totalPoints;
    private String name;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        // Increment the playerCount
        playerCount++;
        // Ask for the user's name
        System.out.print("Enter a name for player #" + playerCount + " : ");
        name = scanner.nextLine();
    }
}
