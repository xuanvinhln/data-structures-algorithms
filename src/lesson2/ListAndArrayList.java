package lesson2;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        arrayList.set(0, 11);
        System.out.println(arrayList);
    }
}
