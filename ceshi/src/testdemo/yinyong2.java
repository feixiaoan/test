package testdemo;
class Dept {
	private int deptno; //部门编号
	private String dname; //部门名称
	private String loc; //部门位置
	private Emp Emps[]; //一个部门有多个雇员
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
		return "部门编号：" + this.deptno + ",名称：" + this.dname + ",位置：" + this.loc; 
	}
}
class Emp{
	private int empno; //雇员编号
	private String ename; //雇员姓名
	private String job;  //雇员职位
	private double sal; //雇员工资
	private double comm; //雇员佣金
	private Dept dept;  //对应的部门信息
	private Emp mgr; //雇员对应的领导信息
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
		return "雇员编号：" + this.empno + ",姓名："+ this.ename + ",职位：" + this.job + ",工资：" + this.sal + ",佣金：" + this.comm;
	}
}
public class yinyong2 {
	
	public static void main(String[] args) {
		//第一步：设 置 数 据 
		//  1.产生各自独立对象
		Dept dept = new Dept(10,"uiuiu","yuyu");
		System.out.println(dept.getInfo());   //部门信息
		Emp ea = new Emp(4561,"a","ai",546.3,0.96); //雇员信息
		Emp eb = new Emp(4562,"b","bi",4569.0,0.97);//雇员信息
		Emp ec = new Emp(4563,"c","ci",5555.0,1.0);//雇员信息
		//2.设置雇员和领导关系
		ea.setMgr(eb);
		eb.setMgr(ec);
		//设置雇员和部门关系
		ea.setDept(dept); //雇员与部门
		eb.setDept(dept); //雇员与部门
		ec.setDept(dept); //雇员与部门
		dept.setEmps(new Emp [] {ea,eb,ec});
		//第二步： 取出数据
		//1，通过雇员找到领导信息和部门信息
		System.out.println(ea.getInfo());
		System.out.println("|-"+ea.getMgr().getInfo());
		System.out.println("|-"+ea.getDept().getInfo());
		//2.根据每个部门找到所有雇员以及雇员的领导信息
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
