package practice;

import java.util.Scanner;

public class RemoveArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Elements:");
		int N = sc.nextInt();
		int[] num = new int[N + 1];
		System.out.println("Enter Array Elements: ");
		for (int x = 0; x < N; x++) {
			num[x] = sc.nextInt();
		}
		System.out.println("Enter elements to search: ");
		int srch = sc.nextInt();
		System.out.println("Enter Element to replace with: ");
		int rep = sc.nextInt();
		for (int i = 0; i < N; i++) {
			if (num[i] == srch) {
				num[i] = rep;
			}
		}
		for (int y = 0; y < N; y++) {
			System.out.print(num[y] + " ");
		}
		sc.close();

	}

}
