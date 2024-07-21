package lisaylesanded;

// Kirjuta programm, mis tuvastab kas arv on paaris või paaritu.

public class yl06 {

    public static void main(String[] args) {
        System.out.println(evenOrOdd(3));
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Number on paaris.";
        } else {
            return "Number on paaritu.";
        }
    }
}
