package testdemo;

public class StringDemo {
	
	public static void main(String args[]) {
		
		/*String strb = null;
		if(strb.equals("jiao")) {
			System.out.println("hello word !!!");
		}*/
			
		String stra = new String("hello").intern();    //Êý¾ÝÈë³Ø
		String strb = "hello";
		print(stra,strb);
	}
	public static void print(String x,String y) {
		System.out.println(x == y);
	}
}