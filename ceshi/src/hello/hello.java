package hello;
interface A {
	public static final String MSG = "Hello";//
	public abstract void print();//���󷽷�
} 
interface B {
	public abstract void get();
}
class X implements A,B {     //xʵ����A��B�����ӿ�
	public void print() {
		System.out.println("A�ӿڵĳ��󷽷���");
	}
	public void get() {
		System.out.println("B�ӿڵĳ��󷽷���");
	}
}
public class hello {

	public static void main(String[] args) {
		X x = new X();//ʵ�����������
		A a = x;//����ת��
		B b = x;//����ת��
		a.print();
		b.get();
 		//System.out.println();	
	}

}
