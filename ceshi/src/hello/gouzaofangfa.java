package hello;

class Shu {
    String title;    //书名
	private double price;    //价格
	
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