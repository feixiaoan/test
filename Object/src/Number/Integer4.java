package Number;

public class Integer4 {

	public static void main(String[] args) {
		int i = 100;
		//String str = i + "";// ���������
		String str = String.valueOf(i);  //�����������
		System.out.println(str.replaceAll("0","9"));

	}

}
