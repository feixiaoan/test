package testdemo;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = "1234567p9";
		char date [] = str.toCharArray();
		if(isNumber(str)) {
			System.out.println("�ַ���ȫ�����������");
		}
		else {
			System.out.println("�ַ�������ȫ�����������");
		}
	}
	public static boolean isNumber(String temp) {          //�ж��ַ����Ƿ����������
		char date [] = temp.toCharArray();
		for(int i=0;i<date.length;i++) {
			if(date[i]>'9'||date[i]<'0') {
				return false;
			}
		}
		return true;
	}
}
