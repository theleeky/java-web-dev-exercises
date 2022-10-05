package exercises.Collections;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newSentence = sentence.split("\\.");

        System.out.println(Arrays.toString(newSentence));
    }
}
