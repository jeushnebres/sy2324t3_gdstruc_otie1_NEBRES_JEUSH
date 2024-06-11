public class PlayerLinkedList {
    PlayerNode head;
    private int size;

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("head->");

        while (current != null) {
            System.out.print(current);
            System.out.print("->");
            current = current.getNextPlayer();
        }
        System.out.print("null");
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNextPlayer();
            size--;
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }
}

