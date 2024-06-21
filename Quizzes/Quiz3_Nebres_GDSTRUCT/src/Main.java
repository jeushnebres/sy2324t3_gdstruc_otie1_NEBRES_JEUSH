import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        PlayerQueue playerQueue = new PlayerQueue();
        int gamesCount = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input;
            do {
                if (gamesCount == 10) {
                    System.out.println("All 10 games have been successfully made.");
                    return;
                }

                System.out.print("Enter number of players to enqueue (1-7): ");
                int playersToEnqueue = playerQueue.getRandomPlayersToEnqueue();

                for (int i = 0; i < playersToEnqueue; ++i) {
                    String playerName = "Player " + (i + 1);
                    playerQueue.addPlayer(playerName);
                    System.out.println(playerName + " has been enqueued.");
                }

                System.out.print("Press enter to end the turn or enter any key to continue: ");
                input = scanner.nextLine();
            } while (!input.isEmpty() && playerQueue.size() < 5);

            if (playerQueue.size() < 5) {
                System.out.println("Not enough players for a game yet.");
            } else {
                System.out.println("Game started!");

                for (int i = 0; i < 5; ++i) {
                    String player = playerQueue.removePlayer();
                    System.out.println("Matched player: " + player);
                }

                ++gamesCount;
            }

            System.out.println("---------------------------------------");
        }
    }
}
