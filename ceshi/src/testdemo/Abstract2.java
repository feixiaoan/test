package testdemo;
abstract class Z {
	public static void fun() {
		System.out.println("**&&&^^^^^^");
	}
	static abstract class X {     //静态方法修饰内部类
		public abstract void print() ;
		
	}
}
class V extends Z.X {
	public void print(){
			System.out.println("*******");
		}
}
public class Abstract2 {

	public static void main(String[] args) {
		Z.fun();
		Z.X zx = new V();
		zx.print();

	}

}
