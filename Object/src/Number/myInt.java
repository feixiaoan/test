package Number;
class mInt {    //一个类
	private int num;   //这个类包装的基本数据类型
	//构造的目的是为了将这个基本数据类型传递给对象
	public mInt(int num) {
		this.num = num;
	}
	public int intValue() {  //将包装的数据内容返回
		return this.num;
	}
}
public class myInt {

	public static void main(String[] args) {
		mInt my = new mInt(10); //将int包装为类
		int temp = my.intValue();
		System.out.println(temp*2);

	}

}
