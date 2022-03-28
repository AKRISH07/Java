package practice;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] var = new int[num];
		int temp;
		System.out.println("Enter Elements: ");
		for (int i = 0; i < num; i++) {
			var[i] = sc.nextInt();
		}
		System.out.println("Enter Rotate Size: ");
		int rsz = sc.nextInt();
		for (int j = 0; j < rsz; j++) {
			temp = var[0];
			for (int i = 0; i < num - 1; i++) {
				var[i] = var[i + 1];
			}
			var[num - 1] = temp;

		}

		for (int i = 0; i < num; i++) {
			System.out.print(var[i] + " ");
		}
		sc.close();

	}

}
