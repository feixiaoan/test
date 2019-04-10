package yiyue;

interface Immage {
	public void print();
	default void fun() {
		System.out.println("毁三观的方法");
	}
	static void get() {
		System.out.println("静态");
	}
}
class ImmageImpl implements Immage {
	@Override
	public void print() {
		System.out.println("Hello World!");
	}
}

public class ceshi {

	public static void main(String[] args) {
		Immage msg = new ImmageImpl();
		msg.fun();
		Immage.get();
      
	}
}
