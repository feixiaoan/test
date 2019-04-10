package yiyue;

interface Imessag {
    public void print(String str);	
}
public class niming1 {

	public static void main(String[] args) {
		fun((s) -> {
			s = s.toUpperCase();
		    System.out.println(s);
		});
	}
	public static void fun(Imessag msg) {
		msg.print("hello world");
	}

}
