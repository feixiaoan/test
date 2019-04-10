package Number;

public class Integer3 {

	public static void main(String[] args) {
		Integer objA = 10;
		Integer objB = 10;
		Integer objC = new Integer(10);
		System.out.println(objA == objB);
		System.out.println(objA == objC);
		System.out.println(objB == objC);
		System.out.println(objA.equals(objC));
		System.out.println(objB.equals(objC));

	}
}
