package hello;
class Book {
	//构造函数的重载
	public Book() {       
		System.out.println("无参构造");
	}
	public Book(String t) {
		System.out.println("有一个参数的构造");
	}
	public Book(String t,double p) {
		System.out.println("有两个参数的构造");
	}
	//封装类的方法
    /*String title;    //书名
	private double price;    //价格
	public Book(String t,double p) {
		title = t;
		setPrice(p);
	}
    public void setTitle(String t) {
    	title = t;
    }
    public void setPrice(double p) {
    	if(p>0) {
    		price = p;
    	}
    }
   public String getTitle() {
  	  return title;
   }
    public double getPrice() {
    	return price;
    }
	public void getInfo()  {//此方法将图书调用
		System.out.println("图书名称：" + title + " 价格：" + price );	
	}*/
}
public class fengzhuangxing {
	public static void main(String[] args) {
		Book book = new Book("java",78.0);//声明实例化对象
		// book.getInfo();
	}

}
