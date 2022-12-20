package lesson2;

import java.util.ArrayList;
import java.util.List;

public class TestString {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr.add(i);
        }

        System.out.println(arr);
    }
}
