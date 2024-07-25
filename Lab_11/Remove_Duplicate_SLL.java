import java.util.*;

class Node{
    int info;
    Node link;

    public Node(int data){
        this.info =  data;
        this.link = null;
    }
}

public class Remove_Duplicate_SLL{
    Node first;

    public void insertAtFirst(int data){
        Node newNode = new Node(data);

        newNode.link = first;
        first = newNode;
        
        System.out.println(data + " inserted at the first node !!");
    }

    public void displayList(){
        Node current = first;
        if(current==null){
            System.out.println("Linked list is empty !!");
            return;
        }
        
        System.out.print("Linked list : ");
        while(current!=null){
            System.out.print(current.info + " -> ");
            current = current.link;
        }
    }
    
    public void remove_Duplicate(){
        
        Node save = first;

        while(save!=null){

            Node pred = save;

            while(pred.link!=null){

                if(pred.link.info == save.info){
                    pred.link = pred.link.link;
                }
                else{
                    pred = pred.link;
                }
            }
            save = save.link;
        }  
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Remove_Duplicate_SLL SLL = new Remove_Duplicate_SLL();
        int choice;

        do{
            System.out.println(" ");
            System.out.println("1. Insert : ");
            System.out.println("2. Display : ");
            System.out.println("3. Remove_Duplicate : ");
            System.out.println("4. Exit : ");

            System.out.println("Enter an choice : ");
            choice = sc.nextInt();
            System.out.println();

            switch(choice){
                case 1 :
                    System.out.println("Enter data for the new node: ");
                    int dataFirst = sc.nextInt();

                    SLL.insertAtFirst(dataFirst);
                    break;

                case 2 :
                    SLL.displayList();
                    break;

                case 3 :
                    SLL.remove_Duplicate();
                    break;

                case 4:
                    System.out.println("---Exited_Sucessfully---");
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("Oops !! Invalid_Choice...");
            }
        }
        while(choice!=4);
    }
}