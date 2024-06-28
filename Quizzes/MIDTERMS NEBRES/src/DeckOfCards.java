import java.util.*;

public class DeckOfCards {
    private static final int INITIAL_DECK_SIZE = 30;
    private static final int MAX_DRAW_COUNT = 5;
    private static final String[] COLORS = {"Red", "Blue", "Green", "Yellow", "Purple"};

    private CardStack playerDeck;
    private CardStack discardedPile;

    public DeckOfCards() {
        playerDeck = new CardStack();
        discardedPile = new CardStack();

        Random random = new Random();
        for (int i = 0; i < INITIAL_DECK_SIZE; i++) {
            String color = COLORS[random.nextInt(COLORS.length)];
            Card card = new Card("Card " + color);
            playerDeck.push(card);
        }
    }

    public void play() {
        Random random = new Random();

        while (!playerDeck.isEmpty()) {
            int command = random.nextInt(3);
            int count = random.nextInt(MAX_DRAW_COUNT) + 1;

            switch (command) {
                case 0:
                    drawCards(count);
                    break;
                case 1:
                    discardCards(count);
                    break;
                case 2:
                    getCardsFromDiscardedPile(count);
                    break;
            }

            displayGameStatus();
        }

        System.out.println("Player deck is empty. Game over!");
    }

    private void drawCards(int count) {
        System.out.println("Drawing " + count + " card(s) from the deck.");

        for (int i = 0; i < count; i++) {
            if (!playerDeck.isEmpty()) {
                Card card = playerDeck.pop();
                System.out.println("You drew: " + card.getName());
            }
        }
    }

    private void discardCards(int count) {
        System.out.println("Discarding " + count + " card(s).");

        for (int i = 0; i < count; i++) {
            if (!playerDeck.isEmpty()) {
                Card card = playerDeck.pop();
                discardedPile.push(card);
                System.out.println("You discarded: " + card.getName());
            }
        }
    }

    private void getCardsFromDiscardedPile(int count) {
        System.out.println("Getting " + count + " card(s) from the discarded pile.");

        for (int i = 0; i < count; i++) {
            if (!discardedPile.isEmpty()) {
                Card card = discardedPile.pop();
                playerDeck.push(card);
                System.out.println("You got: " + card.getName());
            }
        }
    }

    private void displayGameStatus() {
        System.out.println("\n----- Game Status -----");
        System.out.println("Cards in hand: " + getPlayerCardsInHand());
        System.out.println("Remaining cards in player deck: " + playerDeck.size());
        System.out.println("Cards in the discarded pile: " + discardedPile.size());
        System.out.println("-----------------------\n");
    }

    private List<String> getPlayerCardsInHand() {
        List<String> cardsInHand = new ArrayList<>();

        for (Card card : playerDeck) {
            cardsInHand.add(card.getName());
        }

        return cardsInHand;
    }

}