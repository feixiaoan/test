package Trycath;
class Mycatch {
	public static int div(int x,int y) throws Exception {
		return x/y;
	}
}
public class Try2 {

	public static void main(String[] args) {
		try {
			System.out.println(Mycatch.div(10,2));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
