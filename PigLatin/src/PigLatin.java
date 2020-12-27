import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = "";

        System.out.println("Please enter a word to translate to pig latin (Enter ! to stop program)");
        word = s.nextLine();

        while (!word.equals("!")) {
            System.out.println(translate(word));

            System.out.println("");
            System.out.println("Please enter a word to translate to pig latin (Enter ! to stop program)");
            word = s.nextLine();
        }
    }

    public static String translate(String word) {
        int indexEndWord = 0;
        char endOfWord = '~';
        String pigLatin = "";
        int indexOfVowel = 0;

        char[] word1 = word.toCharArray();

        indexEndWord = word.length() - 1;
        endOfWord = word.charAt(indexEndWord);

        if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {

            if (word1[word.length() - 1] == '!' || word1[word.length() - 1] == '?' || word1[word.length() - 1] == '.' || word1[word.length() - 1] == ',') {
                for (int i = 0; i < word1.length - 1; i++) {
                    pigLatin = word.substring(0, word.length() - 1) + "-way" + word.charAt(word.length() - 1);
                }
            } else {
                pigLatin = word + "-way";
            }
        } else if (word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
            if (word1[word.length() - 1] == '!' || word1[word.length() - 1] == '?' || word1[word.length() - 1] == '.' || word1[word.length() - 1] == ',') {
                for (int i = 0; i < word1.length - 1; i++) {
                    pigLatin = word.substring(0, word.length() - 1) + "-way" + word.charAt(word.length() - 1);
                }
            } else {
                pigLatin = word + "-way";
            }
        } else {
            if (word.indexOf("a") > 0) {
                indexOfVowel = word.indexOf("a");
            }
            if (word.indexOf("e") > 0) {
                indexOfVowel = word.indexOf("e");
            }
            if (word.indexOf("i") > 0) {
                indexOfVowel = word.indexOf("i");
            }
            if (word.indexOf("o") > 0) {
                indexOfVowel = word.indexOf("o");
            }
            if (word.indexOf("u") > 0) {
                indexOfVowel = word.indexOf("u");
            }
            for (int i = 0; i < word1.length - 1; i++) {
                if (word1[i] == 'a' || word1[i] == 'e' || word1[i] == 'i' || word1[i] == 'o' || word1[i] == 'u' && word1[i + 1] == 'a' || word1[i + 1] == 'e' || word1[i + 1] == 'i' || word1[i] == 'o' || word1[i] == 'u') {
                    indexOfVowel = i;
                    break;
                }
            }

            if (word1[word.length() - 1] == '!' || word1[word.length() - 1] == '?' || word1[word.length() - 1] == '.' || word1[word.length() - 1] == ',') {
                pigLatin = word.substring(indexOfVowel, word.length() - 1) + "-" + word.substring(0, indexOfVowel) + "ay" + word.charAt(word.length() - 1);
            } else {
                pigLatin = word.substring(indexOfVowel, word.length()) + "-" + word.substring(0, indexOfVowel) + "ay";
            }
        }
        return pigLatin;
    }
}
