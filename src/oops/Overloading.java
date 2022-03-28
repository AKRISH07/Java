package oops;

class Animal {
	static void Test(String name, String job) {
		System.out.println(name + " " + job);
	}

	static void Test(String name, String job, String val) {
		System.out.println(name + " " + job + " " + val);
	}
}

public class Overloading {

	public static void main(String[] args) {
		Animal.Test("Animal", "Animal");
		Animal.Test("Dog", "Barks", "Bites");

	}

}
