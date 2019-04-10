package xiaofeitest;

class Books {
	private String bname;
	private String author;
	private double price;
	private String press;
	private String time;
	private String suggest;
	public Books() {
		System.out.println("无参构造");
	}
	public Books(String bname) {
		this.bname = bname;
	}
	public Books(String bname,String author) {
		this.bname = bname;
		this.author = author;
	}
	public Books(String bname,String author,double price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	public Books(String bname,String author,double price,String press) {
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.press = press;
	}
	public Books(String bname,String author,double price,String press,String time) {
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.press = press;
		this.time = time;
	}
	public Books(String bname,String author,double price,String press,String time,String suggest) {
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.press = press;
		this.time = time;
		this.suggest = suggest;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
	public String getBname() {
		return this.bname;
	}
	public String getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return this.price;
	}
	public String getPress() {
		return this.press;
	}
	public String getTime() {
		return this.time;
	}
	public String getSuggest() {
		return this.suggest;
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

public class study {

	public static void main(String[] args) {
		Books book = new Books("java");
		book.setPrice(90.0);
		System.out.println(book.getInfo());
		System.out.println(book.getTime());
		
	}

}
