package hello;

class Shu {
    String title;    //����
	private double price;    //�۸�
	
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
		
	}
}

public class gouzaofangfa {
	public static void main(String[] args) {
		 Shu book = new Shu();
		 book.setTitle("java");
		 book.setPrice(90.0);
		 
		 book.getInfo();
		
	}

}