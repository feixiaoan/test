package testdemo;
class A {
	public A() {
		System.out.println("【A】构造方法");
	}
	{
		System.out.println("【B】构造快");
	}
	static {
		System.out.println("【C】静态块");
	}
}

public class kuai {

	public static void main(String[] args) {
		new A();
	}

}
