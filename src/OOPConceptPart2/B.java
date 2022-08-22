package OOPConceptPart2;

public class B extends A {

	public B() {
		System.out.println("this is child class Cont");
	}

	public B(int i) {
		super(10);

	}

	public B(int c, int k) {
		super(10, 20);
	}

	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(20, 30);

	}

}
