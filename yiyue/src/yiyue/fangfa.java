package yiyue;
/**
 * 实现方法的引用接口
 * @param <P> 引用方法的参数类型
 * @param <R> 引用方法的返回类型
 */
@FunctionalInterface
interface Immade<C> {
	public C create(String t,double p);
}
class Book {
	String name;
	double price;
	public Book(String name,double price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}
public class fangfa {

	public static void main(String[] args) {
		Immade<Book> msg = Book :: new ;
		Book book = msg.create("Java 开发", 20.2);
		System.out.println(book);

	}

}
