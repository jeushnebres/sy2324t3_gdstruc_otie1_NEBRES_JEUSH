public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    public void insert(int value) {
        if (root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
        root = insertRecursive(root, value);
    }

    public void traverseInOrder()
    {
        if(root != null)
        {
            root.traverseInOrder();
        }
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeftChild(insertRecursive(current.getLeftChild(), value));
        } else if (value > current.getValue()) {
            current.setRightChild(insertRecursive(current.getRightChild(), value));
        }

        return current;
    }

    public Node getMin() {
        return getMinRecursive(root);
    }

    private Node getMinRecursive(Node node) {
        if (node == null || node.getLeftChild() == null) {
            return node;
        }
        return getMinRecursive(node.getLeftChild());
    }

    public Node getMax() {
        return getMaxRecursive(root);
    }

    private Node getMaxRecursive(Node node) {
        if (node == null || node.getRightChild() == null) {
            return node;
        }
        return getMaxRecursive(node.getRightChild());
    }
    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public void traverseInOrderDescending() {
        traverseInOrderDescendingRecursive(root);
    }

    private void traverseInOrderDescendingRecursive(Node node) {
        if (node == null) {
            return;
        }

        traverseInOrderDescendingRecursive(node.getRightChild());
        System.out.print(node.getValue() + " ");
        traverseInOrderDescendingRecursive(node.getLeftChild());
    }
}