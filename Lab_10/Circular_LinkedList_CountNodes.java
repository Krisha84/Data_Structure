import java.util.*;
class Node{
    int info; 
    Node link; 

    public Node(int data){
        this.info = data;
        this.link = null;
    }
}


class  Circular_LinkedList{
    Node first;

    public  Circular_LinkedList(){
        this.first = null;
    }

    public void insertNode(int data){
        Node newNode = new Node(data);

        if(first==null){
            first = newNode;
            newNode.link = first;
        } 
        else{
            Node save = first;
            while(save.link!=first){
                save = save.link;
            }
            save.link = newNode;
            newNode.link = first;
        }
    }

    public int countNodes(){
        int count = 0;
        Node save = first;

        if(save==null){
            return count;
        }
        do{
            count++;
            save = save.link;
        } 
        while(save!=first);
        return count;
    }

    void displayList(){
        Node save = first;
        if(save==null){
            System.out.println("List is empty !!");
        } 
        else{
            do{
                System.out.print(save.info + " -> ");
                save = save.link;
            } 
            while(save!=first);
            System.out.println("");
        }
    }
}

public class Circular_LinkedList_CountNodes{
    public static void main(String[] args){

        Circular_LinkedList list = new Circular_LinkedList();
        int choice;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println();
            System.out.println("1. Insert a node");
            System.out.println("2. Count nodes");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.println();

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();

            switch(choice){
                case 1:
                    System.out.print("Enter the value for insert a node : ");
                    int data = sc.nextInt();

                    list.insertNode(data);
                    break;

                case 2:
                    System.out.println("Number of nodes in the list: " + list.countNodes());
                    break;

                case 3:
                    list.displayList();
                    break;

                case 4:
                    System.out.println("---Exit---");
                    System.out.println();
                    break;

                default:
                    System.out.println("Oops !! Invalid choice...");
            }
        }
        while(choice!=4);
    }
}






// import java.util.*;
// class Node{
//     int info;
//     Node link;

//     Node(int data){
//         this.info = data;
//         this.link = null;
//     }
// }

// class Circular_LinkedList{
//     Node first;

//     void addNode(int data){
//         Node newNode = new Node(data);

//         if(first==null){
//             first = newNode;
//             first.link = first;
//         } 
//         else{
//             Node temp = first;

//             while(temp.link!=first){
//                 temp = temp.link;
//             }

//             temp.link = newNode;
//             newNode.link = first;
//         }
//     }

//     public int countNodes(){
//         int count = 0;
//         Node temp = first;

//         if(temp==null){
//             return count;
//         }
//         do{
//             count++;
//             temp = temp.link;
//         } 
//         while(temp!=first);
//         return count;
//     }

//     void display(){
//         Node temp = first;
//         if(temp==null){
//             System.out.println("List is empty !!");
//         } 
//         else{
//             do{
//                 System.out.print(temp.info + " ");
//                 temp = temp.link;
//             } 
//             while(temp!=first);
//             System.out.println("");
//         }
//     }
// }

// public class Circular_LinkedList_CountNodes{
//     public static void main(String[] args){
//         Circular_LinkedList list = new Circular_LinkedList();

//         list.addNode(1);
//         list.addNode(2);
//         list.addNode(3);
//         list.addNode(4);
//         list.addNode(5);

//         list.display();

//         int count = list.countNodes();
//         System.out.println("Number of nodes: " + count);
//     }
// }