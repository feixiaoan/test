package testdemo;
//   this���ù��췽��
class Shu {
	private String title;
	private double price;
	public Shu() {
		System.out.println("*********");
	}
	public Shu(String title) {
		this();       //�����޲ι���
		this.title = title;
	}
	public Shu(String title,double price) {
		this(title);   //���õ��ι���
		this.price = price;
	}
	public String getInfo() {
		return "������" + this.title + ",�۸�:" + this.price;
	}
}//ʡ��getter,setter����

public class ThisDemo {
	
	public static void main(String [] args) {
		Shu book = new Shu("java",89.0);
		System.out.println(book.getInfo());
	}
}