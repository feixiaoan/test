package hello;

class Bk {
	private String title;
	private static int num = 0;
	public Bk() {
		System.out.println("mun " + num++);
	}
	public Bk(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
}

public class xuexi {

	public static void main(String[] args) {
		System.out.println(new Bk("java").getTitle());
		System.out.println(new Bk().getTitle());
		System.out.println(new Bk().getTitle());
		}
	}
	

