package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once " +
                "or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?'";


        System.out.println("What term would you like to search for?");
        String searchTerm = input.nextLine().toLowerCase();

        boolean containsTerm = firstSentence.toLowerCase().contains(searchTerm);
        System.out.println("Does the first sentence of 'Alice's Adventures in Wonderland' contain the term '"+searchTerm +"'? " + containsTerm);
        int position = firstSentence.toLowerCase().indexOf(searchTerm);
        System.out.println("Position: " + position);
        int length = firstSentence.toLowerCase().length();
        System.out.println("Length: " + length);

        input.close();
    } //end main

    public static void getWordsIndex(String searchTerm) {

    }
}
