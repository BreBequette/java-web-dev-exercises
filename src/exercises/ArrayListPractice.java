package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        //ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //System.out.println(sumEven(numbers));

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Dog", "Horse", "Cat", "Puppy"));
        System.out.println("What word length are you looking for? ");
        Integer searchLength = getUserSearchInput();
        printWords(words, searchLength);

    }//end main

    public static Integer sumEven(ArrayList<Integer> numbers){
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static Integer getUserSearchInput(){
        Scanner scanner = new Scanner(System.in);
        Integer myUsersInt = scanner.nextInt();
        scanner.close();
        return myUsersInt;
    }

    public static void printWords(ArrayList<String> words, Integer searchLength){
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
    }
}//end class
