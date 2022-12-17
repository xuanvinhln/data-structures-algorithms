package lesson1.thaolinh;

public class _1512_Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {  //2 vòng lặp lồng, duyệt từng phần tử so sánh với từng phần tử khác nó
                if (nums[i] == nums[j]) {                // bằng nhau thì count++
                    count += 1;
                }
            }
        }
        return count;
    }
}
