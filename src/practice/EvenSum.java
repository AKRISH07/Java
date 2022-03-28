package practice;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num * 2 + 1];
		arr[0] = 0;
		arr[1] = 1;
		int count = 0;
		for (int x = 2; x <= 2 * num; x++) {
			arr[x] = arr[x - 1] + arr[x - 2];
			if (x % 2 == 0) {
				count = count + arr[x];
				System.out.print(count + " ");
			}
		}
		System.out.println(count);
		sc.close();
	}

}
