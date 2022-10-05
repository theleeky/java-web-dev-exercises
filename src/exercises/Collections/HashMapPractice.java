package exercises.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter the name of a student or hit ENTER to stop");

        do{
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")){
                System.out.println("ID: ");
                Integer id = input.nextInt();
                students.put(newStudent, id);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        for (Map.Entry<String, Integer> student : students.entrySet()){
            System.out.println("Student: " + student.getKey() + "    ID: " + student.getValue());
        }
    }


}
