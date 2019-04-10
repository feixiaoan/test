package testdemo;

public class StringDemo4 {

	public static void main(String[] args) {
		String stra = "Hello";
		String strb = "HEllo";
		System.out.println(stra.compareTo(strb));//compareTo()比较字符串大小
		if(stra.compareTo(strb)>0) {
			System.out.println("大于");
		}
		
//	    System.out.println(stra.equals(strb));         //equals区分大小写
//		System.out.println(stra.equalsIgnoreCase(strb));  //equalsTgnoreCase不区分大小写
	}

}
