package hello;
class MyThread extends Thread {
	public void run() {
		for(int i = 0;i < 1000000000; i++) {
			System.out.print("Nice!");
			if(i%100==0)
				System.out.println();
		}
	}
}
class MyThr extends Thread {
	public void run() {
		for(int i = 0;i < 1000000000; i++) {
			System.out.print("llllgppppppp!");
			if(i%100==0)
				System.out.println();
		}
	}
}
public class xiancheng {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		MyThr y = new MyThr();
		y.start();
		t.start();
		for(int i = 0;i < 1000000000; i++) {
			System.out.print("Good!");
			if(i%100==0)
				System.out.println();
		}
	}

}
