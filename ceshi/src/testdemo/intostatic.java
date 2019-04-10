package testdemo;
class B {
	private  String msg = "hello world!";
	public void fun(final int num) {
		final double sour = 12.0; 
		class Inner {
		public void print() {
			System.out.println("属性：" + B.this.msg);
			System.out.println("方法属性：" + sour);
			System.out.println("方法参数：" + num);
        }    
        }
		new Inner().print();
 }
}
public class intostatic {

	public static void main(String[] args) {
		B in = new B();
		in.fun(166);

	}

}
