package classfile;
class Emp {
	private int empno;        //��Ա���
	private String ename;     //��Ա���� 
	private String job;       //��Աְλ
	private double sal;       //��Ա����
	private double comm;      //Ӷ��
	public Emp() {}           //�޲ι��췽��
	public Emp(int eno,String ena,String j,double s,double c) {
		empno = eno;
		ename = ena;
		job = j;
		sal = s;
		comm = c;
	}
	public void setEmpno(int e) {
		empno = e;
	}
	public void setEname(String e) {
		ename = e;
	}
	public void setJob(String j) {
		job = j;
	}
	public void setSal(double s) {
		sal = s;
	}
	public void setComm(double c) {
		comm = c;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public double getSal() {
		return sal;
	}
	public double getComm() {
		return comm;
	}
	public String  getInfo() {
		return "��Ա��ţ�" + empno + "\n" +
			   "��Ա������" + ename + "\n" +
			   "��Աְλ��" + job + "\n" +
		       "�������ʣ�" + sal + "\n" +
       		   "Ӷ       ��" + comm;          
	}	
}
public class oneclass {
	public static void main(String[] args) {
		Emp e = new Emp(7070,"SMSMIS","hangzhang",90.0,9.0);
		e.setEname("ALLLOP");
		System.out.println(e.getInfo());
        System.out.println("��Ա������" + e.getEname());		
	}
}

