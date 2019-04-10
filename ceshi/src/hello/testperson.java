package hello;
class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
class Student extends Person {
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	} 
	
}
public class testperson {

	public static void main(String[] args) {
		Student su = new Student();
		su.setAge(10);
		su.setName("积极");
		su.setSchool("家里蹲大学");
		System.out.println("学生姓名：" + su.getName() + "，  学生年龄：" + su.getAge() + "，   学校：" + su.getSchool());

	}

}
