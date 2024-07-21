package lisaylesanded;

// Kirjuta programm, mis tuvastab kas tekst palindroom või mitte.

public class yl07 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Jaanus"));
    }

    public static String isPalindrome(String word) {

        String flippedWord = "";

        for (int i = word.length() - 1; i >= 0 ; i--) {
            flippedWord += word.toLowerCase().charAt(i);
        }

        if (flippedWord.equals(word.toLowerCase())) {
            return word + " is palindrome.";
        } else {
            return word + " is not palindrome.";
        }

    }

}
