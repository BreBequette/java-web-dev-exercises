package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args){
        Alice myFirstAlice = new Alice();
        String mySearchTerm = myFirstAlice.getSearchTerm();
        Boolean myResult = myFirstAlice.searchAliceQuote(mySearchTerm);
        if (myResult == true){
            myFirstAlice.getWordsIndex(mySearchTerm);
            myFirstAlice.removeWord(mySearchTerm);
        }
        System.out.println("The result is: " + myResult);
    }

    public void removeWord(String searchTerm){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String quoteLower = quote.toLowerCase();
        String searchTermLower = searchTerm.toLowerCase();
        int startingPoint1 = 0;
        int endingPoint1 = quoteLower.indexOf(searchTermLower);
        int startingPoint2 = quoteLower.indexOf(searchTermLower) + searchTermLower.length();

        String newQuote = quote.substring(startingPoint1, endingPoint1) + quote.substring(startingPoint2);
        System.out.println("New quote is: " + newQuote);
    }

    public void getWordsIndex(String searchTerm){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String quoteLower = quote.toLowerCase();
        String searchTermLower = searchTerm.toLowerCase();

        int theIndex = quoteLower.indexOf(searchTermLower);
        System.out.println("The index is: " + theIndex + ". The length is: " + searchTermLower.length());
    }

    public String getSearchTerm(){
        Scanner scanner = new Scanner(System.in);
        String searchTerm = scanner.nextLine();
        scanner.close();
        return searchTerm;
    }

    public boolean searchAliceQuote(String searchTerm) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String quoteLower = quote.toLowerCase();
        String searchTermLower = searchTerm.toLowerCase();
        Boolean result = quoteLower.contains(searchTermLower);

        return result;
    }

}
