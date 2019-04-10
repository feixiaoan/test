
public class object1 {

	public static void main(String[] args) {
		Object obj = new int [] {1,2,3};
		System.out.println(obj);
		if(obj instanceof int  []) {
			int date [] = (int []) obj;
			for(int x = 0;x < date.length; x++) {
				System.out.println(date [x]);
			}
		}
 
	}

}
