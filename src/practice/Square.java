package practice;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int x = 1; x <= num; x++) {
			for (int y = 1; y <= num; y++) {
				if (x == 1 || x == num || y == 1 || y == num) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		sc.close();

	}

}
