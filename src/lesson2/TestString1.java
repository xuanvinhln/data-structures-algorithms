package lesson2;

public class TestString1 {
    public static void main(String[] args) {
//        String a = "";
//        for (int i = 0; i < 100; i++) {
//            a = a + "Hello";
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 100; i++) {
//            sb.append("Hello");
//        }
//        a = sb.toString();
//
//        System.out.println(a);

        String origin = "Hello world";
        String[] b = origin.split(" ");
        System.out.println(b[1]);
    }

    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;

        for (char c='a'; c<='z'; c++) {
            int index = s.indexOf(c);

            if (index !=-1 && index == s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
