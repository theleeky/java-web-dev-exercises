package exercises.Collections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(19);
        arrayList.add(9);
        arrayList.add(16);
        arrayList.add(4);
        arrayList.add(23);
        arrayList.add(24);
        System.out.println(sumOfEvens(arrayList));

    }
    public static int sumOfEvens(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int i: arrayList){
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
