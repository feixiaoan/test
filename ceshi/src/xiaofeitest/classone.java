package xiaofeitest;
class Book {
	private String bname;   //����  
	private String author;  //����
	private double price;   //�۸�
	private String press;   //������
	private String time;    //����ʱ��
	private String suggest; //�ϼܽ���
	public Book() {}        //�޲ι���
	public Book(String bname,String author,double price,String press,String time,String suggest) {
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.press = press;
		this.time = time;
		this.suggest = suggest;
	}
	public void setBname(String b) {
		bname = b;
	}
	public void setAuthor(String a) {
		author = a;
	}
	public void setPrice(double p) {
		price = p;
	}
	public void setPress(String p) {
		press = p;
	}
	public void setTime(String t) {
		time = t;
	}
	public void setSuggest(String s) {
		suggest = s;
	}
	public String getBname() {
		return bname;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public String getPress() {
		return press;
	}
	public String getTime() { 
		return time;
	}
	public String getSuggest() {
		return suggest;
	}
	public String getInfo() {
		return "������" + this.bname + "\n" +
			   "���ߣ�" + this.author + "\n" +
			   "�۸�" + this.price + "\n" +
			   "�����磺" + this.press + "\n" +
			   "����ʱ�䣺" + this.time + "\n" +
			   "�ϼܽ��飺" + this.suggest;
	}
}
public class classone {
	public static void main(String[] args) {
	
		Book book = new Book("Spring+Mybatis","������",58.0,"���ӹ�ҵ������","2017��1��","�����->Java");
		book.setBname("Spring+Mybatis��ҵӦ��ʵս");
		System.out.println(book.getInfo());;
	}
}
