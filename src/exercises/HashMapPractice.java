package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish");

        //get student names and IDs
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")){
                System.out.print("Student ID: ");
                Integer newId = input.nextInt();
                students.put(newStudent, newId);

                input.nextLine();
            }

        } while (!newStudent.equals(""));
        input.close();

        //print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student: students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }//end main
}//end class
