package practice;

import java.util.Scanner;

public class HexToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] chr = str.toCharArray();
		int[] num = new int[chr.length + 1];
		int sum = 0;
		int diff = 0;
		int exp = 0;
		for (int x = chr.length - 1; x >= 0; x--) {

			if (chr[x] >= '0' && chr[x] <= '9') {
				num[x] = chr[x] - 48;
				sum = num[x] * (int) Math.pow(16, exp);
				System.out.println(num[x] + " " + exp + " " + sum);
				exp++;

			} else if (chr[x] >= 'A' && chr[x] <= 'F') {
				num[x] = chr[x] - 55;
				diff = num[x] * (int) Math.pow(16, exp);
				System.out.println(num[x] + " " + exp + " " + diff);
				exp++;

			}

		}

		sc.close();

	}
}
