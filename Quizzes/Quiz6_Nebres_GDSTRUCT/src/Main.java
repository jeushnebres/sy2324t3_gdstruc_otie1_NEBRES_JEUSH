public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(64);
        tree.insert(12);
        tree.insert(35);
        tree.insert(72);
        tree.insert(28);
        tree.insert(44);

        tree.traverseInOrder();

        System.out.println("Minimum value in the tree: " + tree.getMin().getValue());
        System.out.println("Maximum value in the tree: " + tree.getMax().getValue());

       System.out.println("Traverse in descending order: ");
       tree.traverseInOrderDescending();
       System.out.println(tree.get(44));
    }
}