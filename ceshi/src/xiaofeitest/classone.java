package xiaofeitest;
class Book {
	private String bname;   //书名  
	private String author;  //作者
	private double price;   //价格
	private String press;   //出版社
	private String time;    //出版时间
	private String suggest; //上架建议
	public Book() {}        //无参构造
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
		return "书名：" + this.bname + "\n" +
			   "作者：" + this.author + "\n" +
			   "价格：" + this.price + "\n" +
			   "出版社：" + this.press + "\n" +
			   "出版时间：" + this.time + "\n" +
			   "上架建议：" + this.suggest;
	}
}
public class classone {
	public static void main(String[] args) {
	
		Book book = new Book("Spring+Mybatis","疯狂软件",58.0,"电子工业出版社","2017年1月","计算机->Java");
		book.setBname("Spring+Mybatis企业应用实战");
		System.out.println(book.getInfo());;
	}
}
