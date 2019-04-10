package testdemo;

public class StringDemo3 {

	public static void main(String[] args) {
		String str = "安小飞";
		byte [] date = str.getBytes();  //字符串转为字符数组
		for(int i=0;i<date.length;i++) {
			date [i] -=250;
		}
		System.out.println(new String(date));
		System.out.println(new String(date,2,3));
	}
}
