package testdemo;

public class StringDemo4 {

	public static void main(String[] args) {
		String stra = "Hello";
		String strb = "HEllo";
		System.out.println(stra.compareTo(strb));//compareTo()�Ƚ��ַ�����С
		if(stra.compareTo(strb)>0) {
			System.out.println("����");
		}
		
//	    System.out.println(stra.equals(strb));         //equals���ִ�Сд
//		System.out.println(stra.equalsIgnoreCase(strb));  //equalsTgnoreCase�����ִ�Сд
	}

}
