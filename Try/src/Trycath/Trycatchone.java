package Trycath;
class Myatch {
	public static int div(int x,int y) throws Exception {
		int result = 0;
		System.out.println("���㿪ʼ��");
		try {
			result = x/y;
		}finally {
			System.out.println("���������");
		}
		return result;
	}
}
public class Trycatchone {

	public static void main(String[] args) {
		try {
			System.out.println(Myatch.div(10, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
