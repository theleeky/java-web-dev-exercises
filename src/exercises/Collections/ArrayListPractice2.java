package exercises.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(alice.split(" ")));
        System.out.println(letters(stringArrayList));
    }

    public static ArrayList<String> letters(ArrayList<String> stringArrayList){
        ArrayList<String> fiveLetters = new ArrayList<>();

        for (String i: stringArrayList){
            if (i.length() == 5){
                fiveLetters.add(i);
            }
        }

        return fiveLetters;
    }
}
