package testdemo;
//   this调用构造方法
class Shu {
	private String title;
	private double price;
	public Shu() {
		System.out.println("*********");
	}
	public Shu(String title) {
		this();       //调用无参构造
		this.title = title;
	}
	public Shu(String title,double price) {
		this(title);   //调用单参构造
		this.price = price;
	}
	public String getInfo() {
		return "书名：" + this.title + ",价格:" + this.price;
	}
}//省略getter,setter方法

public class ThisDemo {
	
	public static void main(String [] args) {
		Shu book = new Shu("java",89.0);
		System.out.println(book.getInfo());
	}
}