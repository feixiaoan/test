package hello;
class Bok {
	
	private String title;
	private double price;
	public Bok(String title,double price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return this.title; 
	}
	public double getPrice() {
		return this.price;
	}
	public boolean compare(Bok b) {
		if(b == null) {    //判断是否为空
			return false;
		}
		if(this == b) {   //判断是否为同一对象
			return true;
		}
		if(this.title.equals(b.title)&&this.price== b.price) {
			return true;
		}else {
			return false;
		}
	}
}
public class duixiangbijiao {

	public static void main(String[] args) {
		Bok b1 = new Bok("java",19.0);
		Bok b2 = new Bok("java",19.0);
		if(b1.compare(b2)) {
			System.out.println("是同一对象");
		}
		else {
			System.out.println("不是同一对象");
		}
		

	}

}
