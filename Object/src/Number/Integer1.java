package Number;

public class Integer1 {

	public static void main(String[] args) {
		
		Integer obj = 10;  //自动装箱
		int temp = obj;    //自动拆箱
		obj ++;   //包装类直接进行数学计算
		System.out.println(temp * obj);
	
	}

}
