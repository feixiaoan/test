package testdemo;
abstract class AB {
	public void fun() {
		System.out.println("��ͨ����");
	}
	public abstract void print();
} 
class AC extends AB{
	public void print() {
		System.out.println("ABBBBBBB");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		AB a = new AC();   //����ת��
		a.print();    //����������д�ķ���

	}

}
