package hello;

public class chongzai {

	public static void main(String[] args) {
		
		System.out.println("1�ŷ���" + add(4,5));
		System.out.println("2�ŷ���" + add(4,5,6));
		System.out.println("3�ŷ���" + add(4.5,5.5));

	}
	public static int add(int x,int y) {//1�ŷ���
		return x + y;
	}
	public static int add(int x,int y,int z) {      //2�ŷ���
		return x + y + z;
	}
	public static double add(double x,double y) {           //3�ŷ���
		return x + y;
	}


}
