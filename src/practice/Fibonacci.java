package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Num: ");
		int num = sc.nextInt();
		int n1 = 0, n2 = 1;
		int n3, sum = 1;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 2; i < num; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			sum += n3;
			System.out.print(n3 + " ");
		}
		System.out.println("Sum: " + sum);
		sc.close();
	}

}
