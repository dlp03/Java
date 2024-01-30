import java.util.*;

public class Alphabetize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String w1 = in.next(), w2 = in.next(), w3 = in.next();
        if (w1.compareTo(w2) <= 0 && w2.compareTo(w3) <= 0) {
            System.out.println("You entered the strings in alphabetical order");
        } else {
            System.out.println("You did not enter the words in alphabetical order");
        }
    }
}