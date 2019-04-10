package hello;

public class chongzai {

	public static void main(String[] args) {
		
		System.out.println("1号方法" + add(4,5));
		System.out.println("2号方法" + add(4,5,6));
		System.out.println("3号方法" + add(4.5,5.5));

	}
	public static int add(int x,int y) {//1号方法
		return x + y;
	}
	public static int add(int x,int y,int z) {      //2号方法
		return x + y + z;
	}
	public static double add(double x,double y) {           //3号方法
		return x + y;
	}


}
