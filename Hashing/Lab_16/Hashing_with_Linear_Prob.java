import java.util.*;
import java.util.Random;
public class Hashing_with_Linear_Prob{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];

        for(int i=0;i<arr.length;i++){
            arr[i] = -1;
        }

        int[] elements = new int[15];
        Random random = new Random();

        for(int i=0;i<15;i++){
            elements[i] = 100000 + random.nextInt(900000);
        }

        hashFunction(elements,arr);

        System.out.println();
        System.out.println("---Final Array---");
        for(int i=0;i<arr.length;i++){
            if(arr[i] == -1){
                System.out.println("arr["+i+"] : Empty");
            }
            else{
               System.out.println("arr["+i+"] : "+arr[i]); 
            }
        }
    }

    public static void hashFunction(int[] elements,int[] arr){
        for(int i=0;i<15;i++){
            int element = elements[i];
            int hashIndex = (element % 18) + 2;

            // Linear probing to avoid collision
            while(arr[hashIndex] != -1){
                hashIndex = (hashIndex + 1) % 20;
            }
            arr[hashIndex] = element;
        }
    }
}