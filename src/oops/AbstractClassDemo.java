package oops;

abstract class Demo {
	abstract void demo();
}

class NewDemo extends Demo {
	void demo() {
		System.out.print("Hello");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		Demo obj = new NewDemo();
		obj.demo();

	}

}
