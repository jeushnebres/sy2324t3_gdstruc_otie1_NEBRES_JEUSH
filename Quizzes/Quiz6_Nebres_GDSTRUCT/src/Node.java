public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public void insert(int data)
    {
        if (data == value)
        {
            return;
        }
        if (data < value) {
            if(leftChild == null)
            {
                leftChild = new Node(data);
            }
            else
            {
                leftChild.insert(data);
            }
        }
        else
        {
            if (rightChild == null)
            {
                rightChild = new Node(data);
            }
            else
            {
                rightChild.insert(data);
            }
        }
    }

    public void traverseInOrder()
    {
        if(leftChild != null)
        {
            leftChild.traverseInOrder();
        }
        System.out.println("Data: " + value);

        if(rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }

    public Node get(int data)
    {
        if(data == value)
        {
            return this;
        }

        if(data < value)
        {
            if(leftChild != null)
            {
                return leftChild.get(data);
            }
        }
        else
        {
            if(rightChild != null)
            {
                return rightChild.get(data);
            }
        }

        return null;
    }

    public Node(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }



    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;


    }
}