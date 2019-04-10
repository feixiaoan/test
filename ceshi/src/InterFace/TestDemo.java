package InterFace;
interface Immage {
	public void print();
	default void fun() {
		System.out.println("毁三观的方法");
	}
}
class ImmageImpl implements Immage {
	@Override
	public void print() {
		System.out.println("Hello World!");
	}
}
public class TestDemo {
    public static void main(String[] args) {
		Immage msg = new ImmageImpl();
		msg.fun();
	}
}
