import java.util.*;
public class Anagram_Game{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of words:");
        int n = sc.nextInt();

        String []words = new String[n];

        System.out.println("Enter " + n + " words:");
        System.out.println("--------");

        for(int i=0;i<n;i++){
            System.out.println("Enter the word "+(i+1)+" : ");
            words[i] = sc.next();
        }

        Random random = new Random();
        int index = random.nextInt(n);
        String word = words[index];

        System.out.println("--------");

        System.out.println("The word is: " + word);
        System.out.println("");

        System.out.println("Enter its anagram:");
        String anagram = sc .next();

        System.out.println("--------");
        
        if(isAnagram(word, anagram)){
            System.out.println("Correct! " + anagram + " is an anagram of " + word);
        } 
        else{
            System.out.println("Incorrect. " + anagram + " is not an anagram of " + word);
        }
    }

    public static boolean isAnagram(String word, String anagram){
        if(word.length()!= anagram.length()) {
            return false;
        }

        char[] wordArray = word.toLowerCase().toCharArray();
        char[] anagramArray = anagram.toLowerCase().toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);

        return Arrays.equals(wordArray, anagramArray);
    }
}