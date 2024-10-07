import java.util.*;
class Node{
    int info;
    Node lptr,rptr,parent;

    public Node(int data){
        info = data;
        lptr = null;
        rptr = null;
        parent = null;
    }
}

class BinarySearchTree{
    Node root;

    void insert(int data){
        root = insertRec(root,data,null);
    }

    Node insertRec(Node root,int data,Node parent){
        if(root==null){
            Node newNode = new Node(data);
            newNode.parent = parent;
            return newNode;
        }
        if(data<root.info){
            root.lptr = insertRec(root.lptr,data,root);
        } 
        else if(data>root.info){
            root.rptr = insertRec(root.rptr,data,root);
        }
        return root;
    }

    void preorder(){
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(Node root){
        if(root!=null){
            System.out.print(root.info + " ");
            preorderRec(root.lptr);
            preorderRec(root.rptr);
        }
    }

    void inorder(){
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.lptr);
            System.out.print(root.info + " ");
            inorderRec(root.rptr);
        }
    }

    void postorder(){
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(Node root){
        if(root!=null){
            postorderRec(root.lptr);
            postorderRec(root.rptr);
            System.out.print(root.info + " ");
        }
    }
}

public class BSTMenuDriven{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        BinarySearchTree bst = new BinarySearchTree();
        int choice;

        do{
            System.out.println();
            System.out.println("1. Insert Node");
            System.out.println("2. Preorder Traversal");
            System.out.println("3. Inorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();

            switch(choice){
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();

                    bst.insert(value);
                    break;

                case 2:
                    System.out.println("Preorder Traversal:");
                    bst.preorder();
                    break;

                case 3:
                    System.out.println("Inorder Traversal:");
                    bst.inorder();
                    break;

                case 4:
                    System.out.println("Postorder Traversal:");
                    bst.postorder();
                    break;

                case 5:
                    System.out.println("---Exit---");
                    sc.close();
                    return;

                default:
                    System.out.println("Oops...Invalid choice !!");
                    break;
            }
        }
        while(choice!=5);
    }
}