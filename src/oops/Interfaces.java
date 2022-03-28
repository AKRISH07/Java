package oops;

interface Name {
	void name();

}

interface Age {
	void age();
}

class Feature implements Name, Age {

	@Override
	public void age() {
		System.out.println("Age");

	}

	@Override
	public void name() {

		System.out.println("Name");
	}

}

public class Interfaces {

	public static void main(String[] args) {

		Feature obj = new Feature();
		obj.age();
		obj.name();

	}

}
