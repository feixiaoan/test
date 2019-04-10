package testdemo;
class Emp{
	private int empno; //雇员编号
	private String ename; //雇员姓名
	private String job;  //雇员职位
	private double sal; //雇员工资
	private double comm; //雇员佣金
	private Dept dept;  //对应的部门信息
	private Emp mgr; //雇员对应的领导信息
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
		return "雇员编号：" + this.empno + "姓名："+ this.ename + "职位：" + this.job + "工资：" + this.sal + "佣金：" + this.comm;
	}

}