package testdemo;
abstract class ZA {
	public abstract void print();
	private static class ZB extends ZA {   //�ڲ���������
		public void print() {     //��д������ķ���
			System.out.println("++++++++=");
		}
	}
	public static ZA getInstance() {  //�����������ʵ��������
		return new ZB();
	}
}

public class Abstract3 {

	public static void main(String[] args) {
		ZA za = ZA.getInstance();
		za.print(); 
	}

}
