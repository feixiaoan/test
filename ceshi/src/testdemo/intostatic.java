package testdemo;
class B {
	private  String msg = "hello world!";
	public void fun(final int num) {
		final double sour = 12.0; 
		class Inner {
		public void print() {
			System.out.println("���ԣ�" + B.this.msg);
			System.out.println("�������ԣ�" + sour);
			System.out.println("����������" + num);
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
