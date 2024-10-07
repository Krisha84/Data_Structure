import java.util.Scanner;
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST_Operations {
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

    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } 
        else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } 
        else {

            if (root.left == null) {
                return root.right;
            } 
            else if (root.right == null) {
                return root.left;
            }

            root.data = findMinRec(root.right);
          
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        if (data < root.data) {
            return searchRec(root.left, data);
        } 
        else {
            return searchRec(root.right, data);
        }
    }

    private int findMinRec(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST_Operations bst = new BST_Operations();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Insert a Node");
            System.out.println("2. Delete a Node");
            System.out.println("3. Search for a Node");
            System.out.println("4. Display BST (Inorder Traversal)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();

                    bst.insert(value);
                    System.out.println("Node inserted.");
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();

                    bst.delete(value);
                    System.out.println("Node deleted.");
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    value = scanner.nextInt();

                    if (bst.search(value)) {
                        System.out.println("Node found.");
                    } 
                    else {
                        System.out.println("Node not found.");
                    }
                    break;

                case 4:
                    System.out.println("Inorder Traversal of the BST:");
                    bst.inorder();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("---Exit---");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice...!!!");
            }
        }
    }
}