package classfile;
class Array {
    private int date [];  //定义一个数组
	private int foot;    //定义一个数组角标
	public Array(int len) {   
		if(len>0) {
			this.date = new int [len] ;    // 开辟数组大小
		}else {
			this.date = new int [1] ;
		}
	}
	public boolean add(int num) {
		if(this.date.length > this.foot) {
			this.date[this.foot++] = num;
			return true;
		}
		return false;
	}
	public int [] getDate() {
		return this.date;
	}
}
//排序子类
class SortArray extends Array {
	public SortArray(int len) {
		super(len);//明确调用父类有参构造
	}
	//父类中的getdate无法满足子类，所以子类在父类方法进行覆写，对父类方法进行扩充
	public int [] getDate() {
		java.util.Arrays.sort(super.getDate());
		return super.getDate();
	}
}
//反转子类
class ReverseArray extends Array {
	public ReverseArray(int len) {
		super(len);
	}
	public int [] getDate() {
		int center = super.getDate().length / 2;
		int head = 0;
		int tail = super.getDate().length - 1;
		for(int x = 0; x< center ; x++) {
			int temp = super.getDate()[head];
			super.getDate()[head] = super.getDate()[tail];
			super.getDate()[tail] = temp;
			head ++;
			tail --;
		}
		return super.getDate();
	}
}
public class sixclass {

	public static void main(String[] args) {
		ReverseArray arr = new ReverseArray(3);
		System.out.println(arr.add(23878));
		System.out.println(arr.add(24));
		System.out.println(arr.add(234));
		System.out.println(arr.add(235));
		System.out.println(arr.add(236));
		int temp [] = arr.getDate();
		for(int x=0; x<temp.length; x++ ) {
			System.out.println(temp[x]);
		}
	}

}
