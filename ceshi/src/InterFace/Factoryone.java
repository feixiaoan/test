package InterFace;
interface Fruit {
	public void eat();
}
class Apple implements Fruit {
	@Override
	public void eat() {
		System.out.println("³ÔÆ»¹û");
	}
}
class Orange implements Fruit {
	@Override
	public void eat() {
		System.out.println("³ÔéÙ×Ó");
		
	}
}
class Factory {
	public static Fruit getInstance(String classname) {
		if ("apple".equals(classname)) {
			return new Apple ();
		}else if("orange".equals(classname)) {
			return new Orange();
		}else {
			return null;
		}
	}
}
public class Factoryone {

	public static void main(String[] args) {
		Fruit f = Factory.getInstance("apple");
		f.eat();		
	}

}
