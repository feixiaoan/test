interface AA {
	public void print() ;
}

public class nimingclass {

	public static void main(String[] args) {
		fun(new AA() { 
			public void print() {    //�����ڲ���
				System.out.println("Hello World !");
				}
		});

	}
	public static void fun(AA msg) {
		msg.print();
	}

}
