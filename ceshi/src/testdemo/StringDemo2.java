package testdemo;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = "1234567p9";
		char date [] = str.toCharArray();
		if(isNumber(str)) {
			System.out.println("字符串全部由数字组成");
		}
		else {
			System.out.println("字符串不是全部由数字组成");
		}
	}
	public static boolean isNumber(String temp) {          //判断字符串是否由数字组成
		char date [] = temp.toCharArray();
		for(int i=0;i<date.length;i++) {
			if(date[i]>'9'||date[i]<'0') {
				return false;
			}
		}
		return true;
	}
}
