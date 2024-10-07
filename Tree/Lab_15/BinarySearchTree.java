class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } 
        else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public int findMin() {
        return findMinRec(root);
    }

    private int findMinRec(Node root) {
        if (root == null) {
            throw new RuntimeException("The tree is empty");
        }

        if (root.left == null) {
            return root.data;
        }

        return findMinRec(root.left);
    }

    public int findMax() {
        return findMaxRec(root);
    }

    private int findMaxRec(Node root) {
        if (root == null) {
            throw new RuntimeException("The tree is empty");
        }

        if (root.right == null) {
            return root.data;
        }

        return findMaxRec(root.right);
    }

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Smallest element in the BST: " + bst.findMin());
        System.out.println("Largest element in the BST: " + bst.findMax());
    }
}