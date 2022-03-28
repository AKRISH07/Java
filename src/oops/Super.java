package oops;

class Parent {
	String color = "Black";

	Parent() {

		System.out.println("Parent");

	}
}

class Child extends Parent {
	String color = "White";

	Child() {
		super();
		System.out.println(super.color);
		System.out.println("Child");
	}

}

public class Super {

	public static void main(String[] args) {

		new Child();

	}

}
