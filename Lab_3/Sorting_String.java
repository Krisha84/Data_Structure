import java.util.*;
public class Sorting_String{
   public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string value: ");
        String str = sc.nextLine();

        char charArray[] = str.toCharArray();
        int size = charArray.length;

        for(int i = 0; i < size; i++ ){
            for(int j = i+1; j < size; j++){

                if(charArray[i]>charArray[j]){
                    int temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = (char) temp;
                }
            }
        }
      System.out.println(Arrays.toString(charArray));
   }
}

// import java.util.*;
// public class Sorting_String{
//    public static void main(String args[]){

//       Scanner sc = new Scanner(System.in);

//       System.out.println("Enter a string value : ");
//       String str = sc.nextLine();

//       char charArray[] = str.toCharArray();
//       Arrays.sort(charArray);
//       System.out.println(new String(charArray));
//    }
// }