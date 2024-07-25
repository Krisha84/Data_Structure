import java.util.*;
class Node{
    int info; 
    Node link; 

    public Node(int data) {
        this.info = data;
        this.link = null;
    }
}

public class Singly_LinkedList_Ex{
    public static void main(String[] args){

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.link = node2;
        node2.link = node3;

        printLinkedList(node1);
    }
    
    public static void printLinkedList(Node top){
        Node current = top;
        
        while (current!=null){
            System.out.print(current.info + "  ");
            current = current.link;
        }
    }
}
