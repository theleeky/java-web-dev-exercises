package exercises.Collections;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1,1,2,3,5,8};

        for (int i = 0; i < numbers.length; i += 2){
            System.out.println(numbers[i]);
        }
    }
}