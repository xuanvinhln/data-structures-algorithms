package lesson3;

import java.util.ArrayList;
import java.util.Comparator;

public class IntroSort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(100 - i);
        }

        arrayList.sort(Integer::compareTo);
        System.out.println(arrayList);
    }
}
