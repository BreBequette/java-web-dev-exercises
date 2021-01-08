package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println(sumEven(numbers));

    }//end main

    public static int sumEven(ArrayList<Integer> numbers){
        //ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static String printWords(ArrayList<String> strings){
        //wat.
        String words = "";
        return words;
    }
}//end class
