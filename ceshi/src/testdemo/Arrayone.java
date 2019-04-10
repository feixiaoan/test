
package testdemo;
class Book {
    String title;    //书名
	private double price;    //价格
	public Book() {}
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
	 public String getInfo()  {//此方法将图书调用
            return "图书名称：" + title + " 价格：" + price	;
	}
}
public class Arrayone {

	public static void main(String[] args) {
        //静态实例化对象
		Book book [] = new Book [] {
			new Book("java",90.9),
			new Book("jsp",89.0),
			new Book("spring",58.0)
		};
		
		/*动态实例化对象*/
		/*
		Book book [] = new Book [3];
		book [0] = new Book("java",90.9);
		book [1] = new Book("jsp",89.0);
		book [2] = new Book("spring",58.0);
		*/
		for(int i=0;i<book.length;i++) {
			System.out.println(book[i].getInfo());
		}

	}

}
