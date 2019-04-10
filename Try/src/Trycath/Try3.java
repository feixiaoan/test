package Trycath;

public class Try3 {

	public static void main(String[] args) {
	
		try {
			throw new Exception("自己定义的异");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
