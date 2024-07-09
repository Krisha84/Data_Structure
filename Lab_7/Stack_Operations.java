import java.util.*;
public class Stack_Operations{
    int maxSize = 5;
    int top = -1;
    int[] stack = new int[maxSize];

    public void push(int element){

        if(top == maxSize-1){
            System.out.println("Stack is full. Cannot push " + element);
            return;
        }

        stack[++top] = element;
        
        System.out.println(element + " pushed into stack");

    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        }
        return stack[top--];
    }

    public void display(){
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public void peep(int i){
        if(top-i+1<=-1){
            System.out.println("Stack_Underflow !!");

        }
        else{
            System.out.println("Element at position " + i + " is: " + stack[top-i+1]);

        }
    }

    public void change(int oldElement, int newElement){
        for(int i=0;i<=top;i++){
            if (stack[i]==oldElement){
                stack[i] = newElement;
                System.out.println("Element " + oldElement + " changed to " + newElement);
                return;
            }
        }
        System.out.println("Element " + oldElement + " not found in stack");
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Stack_Operations stack = new Stack_Operations();

        while(true){
            System.out.println("");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peep");
            System.out.println("5. Change");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println("");

            switch(choice){
                
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;

                case 2:
                    element = stack.pop();
                    if(element!= -1){
                        System.out.println(element + " popped from stack");
                    }
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Enter a position of element to peep: ");
                    int i = sc.nextInt();
                    stack.peep(i);
                    break;

                case 5:
                    System.out.print("Enter old element: ");
                    int oldElement = sc.nextInt();

                    System.out.print("Enter new element: ");
                    int newElement = sc.nextInt();

                    stack.change(oldElement, newElement);
                    break;

                case 6:
                    System.out.println("---Exited_Sucessfully---");
                    break;

                default:
                    System.out.println("Oops !! Invalid_Choice...");
            }
        }
    }
}
