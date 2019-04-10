package testdemo;

public class yinyong1 {

	public static void main(String[] args) {              //引用特例 （  重    点   ）
		String msg = "hello" ;
		fun(msg);
        System.out.println(msg);
	}
	public static void fun(String temp) {
		temp = "world";
	}

}
