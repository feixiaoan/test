package test;
import com.mythread.www.MyThread;;
public class run {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		/*
		 ��ε���start�����������������쳣
		 Exception in thread "main" java.lang.IllegalThreadStateException
		 */
//		mythread.start();
//		mythread.start();
		System.out.println("���н�����");
	}

}
