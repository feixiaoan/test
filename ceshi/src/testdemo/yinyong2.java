package testdemo;
class Dept {
	private int deptno; //���ű��
	private String dname; //��������
	private String loc; //����λ��
	private Emp Emps[]; //һ�������ж����Ա
	public Dept() {}
	public Dept(int deptno,String dname,String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public void setEmps(Emp [] Emps ) {
		this.Emps = Emps;
	}
	public int getDeptno() {
		return this.deptno;
	}
	public String getDname() {
		return this.dname;
	}
	public String getLoc() {
		return this.loc;
	}
	public Emp [] getEmps() {
		return this.Emps ;
	}
	public String getInfo() {
		return "���ű�ţ�" + this.deptno + ",���ƣ�" + this.dname + ",λ�ã�" + this.loc; 
	}
}
class Emp{
	private int empno; //��Ա���
	private String ename; //��Ա����
	private String job;  //��Աְλ
	private double sal; //��Ա����
	private double comm; //��ԱӶ��
	private Dept dept;  //��Ӧ�Ĳ�����Ϣ
	private Emp mgr; //��Ա��Ӧ���쵼��Ϣ
	public Emp() {}
	public Emp(int empno,String ename,String job,double sal,double comm) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public void setMgr(Emp mgr) {
		this.mgr = mgr;
	}
	public int getEmpno() {
		return this.empno;
	}
	public String getEname() { 
		return this.ename;
	}
	public String getJob() {
		return this.job;
	}
	public double getSal() {
		return this.sal;
	}
	public double getComm() {
		return this.comm;
	}
	public Dept getDept() {
		return this.dept;
	}
	public Emp getMgr() {
		return this.mgr;
	}
	public String getInfo() {
		return "��Ա��ţ�" + this.empno + ",������"+ this.ename + ",ְλ��" + this.job + ",���ʣ�" + this.sal + ",Ӷ��" + this.comm;
	}
}
public class yinyong2 {
	
	public static void main(String[] args) {
		//��һ������ �� �� �� 
		//  1.�������Զ�������
		Dept dept = new Dept(10,"uiuiu","yuyu");
		System.out.println(dept.getInfo());   //������Ϣ
		Emp ea = new Emp(4561,"a","ai",546.3,0.96); //��Ա��Ϣ
		Emp eb = new Emp(4562,"b","bi",4569.0,0.97);//��Ա��Ϣ
		Emp ec = new Emp(4563,"c","ci",5555.0,1.0);//��Ա��Ϣ
		//2.���ù�Ա���쵼��ϵ
		ea.setMgr(eb);
		eb.setMgr(ec);
		//���ù�Ա�Ͳ��Ź�ϵ
		ea.setDept(dept); //��Ա�벿��
		eb.setDept(dept); //��Ա�벿��
		ec.setDept(dept); //��Ա�벿��
		dept.setEmps(new Emp [] {ea,eb,ec});
		//�ڶ����� ȡ������
		//1��ͨ����Ա�ҵ��쵼��Ϣ�Ͳ�����Ϣ
		System.out.println(ea.getInfo());
		System.out.println("|-"+ea.getMgr().getInfo());
		System.out.println("|-"+ea.getDept().getInfo());
		//2.����ÿ�������ҵ����й�Ա�Լ���Ա���쵼��Ϣ
		System.out.println("-------------------------------------------");
		System.out.println(dept.getInfo());
		for(int x=0;x<dept.getEmps().length; x++) {
			System.out.println("\t|-"+dept.getEmps()[x].getInfo());
			if(dept.getEmps()[x].getMgr()!=null) {
				System.out.println("\t\t|-"+dept.getEmps()[x].getMgr().getInfo());
			}
		}
	}
}
