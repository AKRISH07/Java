package practice;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int val, tmp;
		for (int x = 1; x < num; x++) {
			val = x;
			for (int s = num; s > x; s--) {
				System.out.print(" ");
			}

			for (int y = 1; y <= x; y++) {
				System.out.print(val + " ");
				val++;
			}

			tmp = 1;
			for (int k = 1; k < x; k++) {
				if (k == 1) {
					tmp = (2 * x) - 2;
					System.out.print(tmp + " ");
				}

				else {
					System.out.print(--tmp + " ");
				}

			}

			System.out.println("");
		}

		sc.close();

	}

}
