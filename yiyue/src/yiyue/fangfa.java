package yiyue;
/**
 * ʵ�ַ��������ýӿ�
 * @param <P> ���÷����Ĳ�������
 * @param <R> ���÷����ķ�������
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
		Book book = msg.create("Java ����", 20.2);
		System.out.println(book);

	}

}
