interface A {
	public void fun();
}
class B implements A {
	@Override
	public void fun() {
		System.out.println("HELLO WORLD!");
	}
}
public class objectInterface {

	public static void main(String[] args) {
		A a = new B();
		Object obj = a;
		A t = (A)obj;
		t.fun();

	}

}
