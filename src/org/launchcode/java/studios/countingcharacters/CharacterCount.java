package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a quote: ");

        //take in a string
        String sentence = input.nextLine();//"If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        //convert to array of chars
        char[] charactersInString = sentence.toCharArray();

        //loop through the char array
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char characters : charactersInString){
            //if char isn't already in hashmap, add the char as a new key and set value as 1
            //if char is in hashmap, +1 to value for that key
            if (characterCount.containsKey(characters)){
                int currentCount = characterCount.get(characters);
                characterCount.put(characters, currentCount+1);
            } else {
                characterCount.put(characters, 1);
            }
        }//end for loop

        //print each key value pair on one line
        for (Character characters:characterCount.keySet()){
            System.out.println(characters + ": " + characterCount.get(characters));
        }//end for

    }//end main
}//end class
