package testdemo;

public class StringDemo3 {

	public static void main(String[] args) {
		String str = "��С��";
		byte [] date = str.getBytes();  //�ַ���תΪ�ַ�����
		for(int i=0;i<date.length;i++) {
			date [i] -=250;
		}
		System.out.println(new String(date));
		System.out.println(new String(date,2,3));
	}
}
