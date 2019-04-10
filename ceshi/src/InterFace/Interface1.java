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
 class X extends C implements A,B { //X��ʵ����A��B�Ľӿ�
	@Override
	public void print() {
		System.out.println("A�ӿڵĳ��󷽷�");
	}
	@Override
	public void get() {
		System.out.println("B�ӿڵĳ��󷽷�");
	}
	@Override
	public void change() {
		System.out.println("C�ĳ��󷽷�");
		
	}
}
public class Interface1 {

	public static void main(String[] args) {
		A a = new X();   //ʵ�����������
		    //����ת��
		B b = (B)a;  //����ת��
		C c = (C)b;
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		a.print();
		b.get();
		c.change();

	}

}
