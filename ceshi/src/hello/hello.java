package hello;
interface A {
	public static final String MSG = "Hello";//
	public abstract void print();//抽象方法
} 
interface B {
	public abstract void get();
}
class X implements A,B {     //x实现了A和B两个接口
	public void print() {
		System.out.println("A接口的抽象方法！");
	}
	public void get() {
		System.out.println("B接口的抽象方法！");
	}
}
public class hello {

	public static void main(String[] args) {
		X x = new X();//实例化子类对象
		A a = x;//向上转型
		B b = x;//向上转型
		a.print();
		b.get();
 		//System.out.println();	
	}

}
