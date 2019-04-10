package testdemo;

public class ArrayDemo {

	public static void main(String[] args) {
		int date [] = new int [] {8,1,4,6,9,3,7,2};
		java.util.Arrays.sort(date);              //×Ô¶¯ÅÅÐò
		print(date);

	}
	public static void print(int temp[]) {
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i] + ",");
		}
		System.out.println();
	}

}
