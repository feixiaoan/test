package testdemo;
class A {
	public A() {
		System.out.println("��A�����췽��");
	}
	{
		System.out.println("��B�������");
	}
	static {
		System.out.println("��C����̬��");
	}
}

public class kuai {

	public static void main(String[] args) {
		new A();
	}

}
