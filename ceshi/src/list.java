import java.io.Serializable;

class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	double price;
	public void setTitle(String p) {
		title = p;
	}
	public String getTitle() {
		return title;
	}
	public void getInfo() {
		System.out.println("书名：" + title + "价格：" + price);
	}
}
public class list {

	public static void main(String[] args) {
		
		Book bk = new Book();         //实例化对象
		Book ck = new Book();
		bk.setTitle("java");       //操作属性内容
		bk.price = 50.4;  
		ck = bk;
		ck.price = 90.0;         //操作属性内容
		ck.getInfo();      //调用属性类getInfo()的方法
	}    

}
