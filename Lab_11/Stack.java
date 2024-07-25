import java.util.*;
class Node{
    int info;
    Node link;

    public Node(int data){
        this.info = data;
        this.link = null;
    }
}

public class Stack{
    Node top;

    public Stack(){
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(int data){
        Node newNode = new Node(data);

        newNode.link = top;
        top = newNode;

        System.out.println(data + " pushed into stack !!");
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Oops !! Stack is empty...cannot pop");
            return -1;
        }

        int poppedValue = top.info;
        top = top.link;

        System.out.println(poppedValue + " popped from stack !!");
        return poppedValue;
    }

    public void peep(int i){
        Node save = top;
        int count=0;
        if(isEmpty()){
            System.out.println("Oops !! Stack is empty...nothing to peep");
            return;
        }
        else{
            while(save!=null){
                count++;
                if(count==i){
                    System.out.println("Peep value : "+save.info);
                }
                else{
                    save=save.link;
                }
            }
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty !!");
            return;
        }

        Node save = top;

        System.out.println("Stack elements are : ");

        while(save != null){
            System.out.print(save.info + " -> ");
            save = save.link;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();
        int choice;

        do{
            System.out.println("");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peep");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println("");

            switch(choice){
                
                case 1:
                    System.out.print("Enter element to push : ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;

                case 2:
                    element = stack.pop();
                    if(element!= -1){
                        System.out.println(element + " popped from stack !!");
                    }
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Enter a position of element to peep : ");
                    int i = sc.nextInt();

                    stack.peep(i);
                    break;

                case 5:
                    System.out.println("---Exited_Sucessfully---");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Oops !! Invalid_Choice...");
            }
        }
        while(choice!=5);
    }
}