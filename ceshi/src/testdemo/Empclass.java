package testdemo;
class Emp{
	private int empno; //��Ա���
	private String ename; //��Ա����
	private String job;  //��Աְλ
	private double sal; //��Ա����
	private double comm; //��ԱӶ��
	private Dept dept;  //��Ӧ�Ĳ�����Ϣ
	private Emp mgr; //��Ա��Ӧ���쵼��Ϣ
	public Emp() {
		
	}
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
		return "��Ա��ţ�" + this.empno + "������"+ this.ename + "ְλ��" + this.job + "���ʣ�" + this.sal + "Ӷ��" + this.comm;
	}

}