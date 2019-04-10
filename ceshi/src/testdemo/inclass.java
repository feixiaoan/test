package testdemo;
class Outer {
	private String msg = "hello world!";
	class Inner {
		//private String info = " ¿ΩÁƒ„∫√£°";
		public void print() {
			System.out.println(Outer.this.msg);
		}
	}
/*	public void fun() {
		new Inner().print();
		//System.out.println(new Inner().info);
	}
*/
}
public class inclass {

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.print();
		//ou.fun();
	}

}
