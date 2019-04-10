package InterFace;
interface A {
	public static final String MSG = "Hello";
	public abstract void print();
}
interface B {
	public abstract void get();
}
abstract class C {
	public abstract void change();
}
 class X extends C implements A,B { //X类实现泪A和B的接口
	@Override
	public void print() {
		System.out.println("A接口的抽象方法");
	}
	@Override
	public void get() {
		System.out.println("B接口的抽象方法");
	}
	@Override
	public void change() {
		System.out.println("C的抽象方法");
		
	}
}
public class Interface1 {

	public static void main(String[] args) {
		A a = new X();   //实力化子类对象
		    //向上转型
		B b = (B)a;  //向下转型
		C c = (C)b;
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		a.print();
		b.get();
		c.change();

	}

}
