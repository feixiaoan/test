package hello;
class Book {
	//���캯��������
	public Book() {       
		System.out.println("�޲ι���");
	}
	public Book(String t) {
		System.out.println("��һ�������Ĺ���");
	}
	public Book(String t,double p) {
		System.out.println("�����������Ĺ���");
	}
	//��װ��ķ���
    /*String title;    //����
	private double price;    //�۸�
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
	public void getInfo()  {//�˷�����ͼ�����
		System.out.println("ͼ�����ƣ�" + title + " �۸�" + price );	
	}*/
}
public class fengzhuangxing {
	public static void main(String[] args) {
		Book book = new Book("java",78.0);//����ʵ��������
		// book.getInfo();
	}

}
