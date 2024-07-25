import java.util.*;
class Node{
    int info; 
    Node link; 

    public Node(int data){
        this.info = data;
        this.link = null;
    }
}

class Singly_LinkedList{
    Node first;

    public Singly_LinkedList(){
        this.first = null;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);

        newNode.link = first;
        first = newNode;
        
        System.out.println("Node with data " + data + " inserted at the first !!");
    }

    public void displayList(){
        Node save = first;
        if(save==null){
            System.out.println("Linked list is empty !!");
            return;
        }
        
        System.out.println("Linked list : ");
        while(save!=null){
            System.out.print(save.info + " -> ");
            save = save.link;
        }
    }

    public void deleteFirstNode(){
        if(first==null){
            System.out.println("Linked list is empty !!");
            return;
        }
        
        Node temp = first;
        first = first.link; 
        temp.link = null; 
        
        System.out.println("First node with data " + temp.info + " deleted !!");
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        
        if(first==null){
            first = newNode;
            System.out.println("Node with data " + data + " inserted at the end !!");
            return;
        }
        
        Node save = first;
        while(save.link!=null){
            save = save.link;
        }
        
        save.link = newNode;
        
        System.out.println("Node with data " + data + " inserted at the end !!");
    }
    
    public void deleteLastNode(){
        if(first==null){
            System.out.println("Linked list is empty !!");
            return;
        }
        
        if(first.link==null){
            System.out.println("Last node with data " + first.info + " deleted !!");
            first = null;
            return;
        }
        
        Node save = first;
        Node pred = null;
        
        while(save.link!=null){
            pred = save;
            save = save.link;
        }
        
        pred.link = null; 
        System.out.println("Last node with data " + save.info + " deleted !!");
    }

    public void deleteNodeAtPosition(int value){
        Node save = first;
        Node pred = null;

        if(save!=null && save.info==value){
            first = save.link; 
            return;
        }

        while(save!=null && save.info!=value){
            pred = save;
            save = save.link;
        }

        if(save==null){
            return;
        }
        pred.link = save.link;
    }
}

public class LinkedList_Operations{
    public static void main(String[] args){

        Singly_LinkedList list = new Singly_LinkedList();

        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("");
            System.out.println("1. Insert a node at the front");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete the first node");
            System.out.println("4. Insert a node at the end");
            System.out.println("5. Delete the last node");
            System.out.println("6. Delete a node from specified position");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println("");
            
            switch (choice){
                case 1:
                    System.out.println("Enter data for the new node: ");
                    int dataFirst = sc.nextInt();

                    list.insertAtFirst(dataFirst);
                    break;

                case 2:
                    list.displayList();
                    break;

                case 3:
                    list.deleteFirstNode();
                    break;

                case 4:
                    System.out.println("Enter data for the new node: ");
                    int dataEnd = sc.nextInt();

                    list.insertAtEnd(dataEnd);
                    break;

                case 5:
                    list.deleteLastNode();
                    break;

                case 6:
                    System.out.println("Enter the value of the node to delete: ");
                    int value = sc.nextInt();

                    list.deleteNodeAtPosition(value);
                    break;

                case 7:
                    System.out.println("---Exit---");
                    break;

                default:
                    System.out.println("Oops !! Invalid choice...");
                    break;
            }  
        } 
        while(choice!=7);
    }
}