package practice;

import java.util.StringTokenizer;

public class StringPractice {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("My Name is XXX", "");
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
		String name = "ABCDEF";
		char[] chr = name.toCharArray();
		String res = " ";
		for (int x = chr.length - 1; x >= 0; x--) {
			res += chr[x];
		}
		System.out.println(res);
		System.out.print(res.substring(1, 3));
	}

}
