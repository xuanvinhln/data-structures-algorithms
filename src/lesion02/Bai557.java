package Lession2;

public class Bai557 {
	public String reverseWords(String s) {
	StringBuffer stringbf = new StringBuffer();
	int k = 0;
	for(int i = 0;i<s.length();i++) {
		if (s.charAt(i) == ' ') {
			for (int j = i - 1; j >= k; j--) {
				stringbf.append(s.charAt(j));
			}
			stringbf.append(" ");
			k = i + 1;
		}
	}
	int len = s.length() - 1;while(len>=0&&s.charAt(len)!=' ')
	{
		stringbf.append(s.charAt(len));
		len--;
	}
	String singleString = stringbf.toString();return singleString;

}

}
