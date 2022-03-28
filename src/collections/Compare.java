package collections;

import java.util.TreeSet;
import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		String tsstr = "";
		TreeSet<String> ts1 = new TreeSet<String>();
		System.out.println("Enter Elements");
		for (int val = 0; val <= num; val++) {
			tsstr = sc.nextLine();
			ts1.add(tsstr);
		}
		System.out.println("Enter Number: ");
		int value = sc.nextInt();
		String str = "";
		TreeSet<String> ts2 = new TreeSet<String>();
		System.out.println("Enter Elements");
		for (int val = 0; val <= value; val++) {
			str = sc.nextLine();
			ts2.add(str);
		}

		for (String elem : ts1) {
			if (!(ts2.contains(elem))) {
				ts2.add(elem);
			}
		}

		for (String set2 : ts2) {
			System.out.println(set2);
		}
		sc.close();
	}
}
