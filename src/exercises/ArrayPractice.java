package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] randomInts = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < randomInts.length; i++) {
            if (randomInts[i]%2 == 1){
                System.out.println(randomInts[i]);
            } //end if
        } //end for

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        String[] wordArr = sentence.split(" ");
        System.out.println(Arrays.toString(wordArr));
        String[] sentenceArr = sentence.split("\\.");
        System.out.println(Arrays.toString(sentenceArr));


    }//end main
}//end class
