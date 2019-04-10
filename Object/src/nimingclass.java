interface AA {
	public void print() ;
}

public class nimingclass {

	public static void main(String[] args) {
		fun(new AA() { 
			public void print() {    //匿名内部类
				System.out.println("Hello World !");
				}
		});

	}
	public static void fun(AA msg) {
		msg.print();
	}

}
