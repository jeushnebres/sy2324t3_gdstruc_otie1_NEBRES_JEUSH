import java.util.LinkedList;
import java.util.Random;

import java.util.LinkedList;
import java.util.Random;

public class PlayerQueue {
    private static final int MAX_SIZE = 100;
    private LinkedList<String> elements = new LinkedList<>();
    private Random random = new Random();

    public void addPlayer(String player) {
        if (elements.size() < MAX_SIZE) {
            elements.addLast(player);
        } else {
            System.out.println("Queue is full. Cannot add more players.");
        }
    }

    public String removePlayer() {
        if (elements.isEmpty()) {
            System.out.println("Queue is empty. Cannot remove player.");
            return null;
        } else {
            return elements.removeFirst();
        }
    }

    public int size() {
        return elements.size();
    }

    public int getRandomPlayersToEnqueue() {
        return random.nextInt(7) + 1;
    }
}