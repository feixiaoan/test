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
		su.setName("����");
		su.setSchool("����״�ѧ");
		System.out.println("ѧ��������" + su.getName() + "��  ѧ�����䣺" + su.getAge() + "��   ѧУ��" + su.getSchool());

	}

}
