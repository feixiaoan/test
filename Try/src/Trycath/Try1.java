package Trycath;

public class Try1 {

	public static void main(String[] args) {
		System.out.println("计算开始！");
		
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("不管是否出现异常我都执行！");
		}
	
		System.out.println("计算结束");

	}

}
