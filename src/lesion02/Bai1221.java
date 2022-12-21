package Lession2;

public class Bai1221 {
	public int balancedStringSplit(String s) {
		int kq = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s[i] == 'R') {
				count++;
			} else if (s[i] == 'L') {
				count--;
			}
			if (count == 0) {
				kq++;
			}
		}
		return kq;
	}

}
