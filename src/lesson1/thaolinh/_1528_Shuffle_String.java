package lesson1.thaolinh;

public class _1528_Shuffle_String {
    public String restoreString(String s, int[] indices) {
        String ans = "";
        for (int i = 0; i < indices.length; i++) {          // i là thứ tự kí tự của ans, từ trái sang phải
            for (int j = 0; j < indices.length; j++) {
                if (i == indices[j]){                   //chạy vòng lặp tìm giá trị của i nằm trong indice là vị trí thứ j
                    ans += String.valueOf(s.charAt(j));  //lấy kí tự vị trí thứ j trong string ban đầu, chuyển thành dạng string để nối lại
                }
            }
        }
        return ans;

    }
}
