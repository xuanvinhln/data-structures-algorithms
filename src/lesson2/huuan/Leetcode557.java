package lesson2.huuan;

public class Leetcode557 {
    public String reverseWords(String s) {
        String[] sTemp = s.split(" ");
        for (int i = 0; i < sTemp.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(sTemp[i]).reverse();
            sTemp[i] = stringBuilder.toString();
        }
        return String.join(" ", sTemp);
    }
}
