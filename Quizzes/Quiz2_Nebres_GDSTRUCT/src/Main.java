import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Player player1 = new Player(1, "Omen", 1);
        Player player2 = new Player(2, "Raze", 2);
        Player player3 = new Player(3, "Jett", 3);
        Player player4 = new Player(4, "Phoenix", 4);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(player1);
        playerLinkedList.addToFront(player2);
        playerLinkedList.addToFront(player3);
        playerLinkedList.addToFront(player4);

        System.out.println("Size: " + playerLinkedList.size());

        playerLinkedList.removeFirst();
        System.out.println("\nAfter removing first \n");

        System.out.println("Size: " + playerLinkedList.size());

        System.out.println("Contains player2: " + playerLinkedList.contains(player2));
        System.out.println("Index of player2: " + playerLinkedList.indexOf(player2));

        System.out.println("Contains player4: " + playerLinkedList.contains(new Player(4, "Phoenix", 4)));
        System.out.println("Index of player4: " + playerLinkedList.indexOf(new Player(4, "Phoenix", 4)));


    }

    public static void printArray(ArrayList<Player> list) {
        for (Player p : list)
        {
            System.out.println(p);
        }
    }
}