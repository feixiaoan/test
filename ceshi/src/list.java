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
		System.out.println("������" + title + "�۸�" + price);
	}
}
public class list {

	public static void main(String[] args) {
		
		Book bk = new Book();         //ʵ��������
		Book ck = new Book();
		bk.setTitle("java");       //������������
		bk.price = 50.4;  
		ck = bk;
		ck.price = 90.0;         //������������
		ck.getInfo();      //����������getInfo()�ķ���
	}    

}
