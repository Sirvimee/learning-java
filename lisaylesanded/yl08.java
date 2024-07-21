package lisaylesanded;

// Kirjuta programm, mis muudab lause tagurpidiseks.
// Näiteks: “Ma armastan Javat” muudetakse “Javat armastan ma”

public class yl08 {
    public static void main(String[] args) {
        System.out.println(flipSentence("Ma armastan Javat"));

    }

    public static <Char> String flipSentence(String sentence) {

        String[] splitted = sentence.split(" ");
        String flippedSentence = "";

        for (int i = splitted.length - 1; i >= 0; i--) {
            if (flippedSentence.isEmpty()) {
                flippedSentence = splitted[i].substring(0, 1).toUpperCase() + splitted[i].substring(1);
            } else {
                flippedSentence += " " + splitted[i].toLowerCase();
            }
        }

        return flippedSentence;

    }
}
