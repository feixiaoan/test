package Number;

public class Integer4 {

	public static void main(String[] args) {
		int i = 100;
		//String str = i + "";// 会产生垃圾
		String str = String.valueOf(i);  //不会产生垃圾
		System.out.println(str.replaceAll("0","9"));

	}

}
