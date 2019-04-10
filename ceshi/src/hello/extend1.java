package hello;
class Q {
	int info = 2;
	public  void print() {
		System.out.println(info);
		System.out.println("父类");
	}
}
class W extends Q {
	int info = 10;
	public void print() {
		System.out.println(super.info);  //super调用父类属性
		System.out.println("子类");
	}
}
class Z extends Q {
	
	public void print() {
		System.out.println("子一类");
	}
}

public class extend1 {

	public static void main(String[] args) {
		new W().print();
		new Z().print();
	}
}
