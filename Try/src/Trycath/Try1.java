package Trycath;

public class Try1 {

	public static void main(String[] args) {
		System.out.println("���㿪ʼ��");
		
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("�����Ƿ�����쳣�Ҷ�ִ�У�");
		}
	
		System.out.println("�������");

	}

}
