package testdemo;
abstract class ZA {
	public abstract void print();
	private static class ZB extends ZA {   //内部抽象子类
		public void print() {     //覆写抽象类的方法
			System.out.println("++++++++=");
		}
	}
	public static ZA getInstance() {  //这个方法不受实例化控制
		return new ZB();
	}
}

public class Abstract3 {

	public static void main(String[] args) {
		ZA za = ZA.getInstance();
		za.print(); 
	}

}
