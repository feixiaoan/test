package hello;
class Q {
	int info = 2;
	public  void print() {
		System.out.println(info);
		System.out.println("����");
	}
}
class W extends Q {
	int info = 10;
	public void print() {
		System.out.println(super.info);  //super���ø�������
		System.out.println("����");
	}
}
class Z extends Q {
	
	public void print() {
		System.out.println("��һ��");
	}
}

public class extend1 {

	public static void main(String[] args) {
		new W().print();
		new Z().print();
	}
}
