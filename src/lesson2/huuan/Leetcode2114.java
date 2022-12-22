package lesson2.huuan;

public class Leetcode2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            if (sentence.split(" ").length > max){
                max = sentence.split(" ").length;
            }
        }
        return max;
    }
}
