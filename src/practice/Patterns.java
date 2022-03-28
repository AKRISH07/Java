package practice;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		for (int row = 1; row <= num; row++) {
			for (int col = row; col <= num; col++) {
				System.out.print(1 + " ");
			}
			for (int sec = 1; sec <= row; sec++) {
				System.out.print(row + " ");
			}

			System.out.println();
		}
		sc.close();
	}

}
