import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

public class CardStack implements Iterable<Card> {
    private List<Card> stack;

    public CardStack() {
        stack = new ArrayList<>();
    }

    public void push(Card card) {
        stack.add(0, card);
    }

    public Card pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Card card = stack.get(0);
        stack.remove(0);
        return card;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    @Override
    public Iterator<Card> iterator() {
        return stack.iterator();
    }
}