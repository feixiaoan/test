package an.xiao.fei.vo;

import java.beans.ConstructorProperties;

public class Dept {
	private Integer deptno;
	private String dname;
	@ConstructorProperties(value = {"paramDeptno","paramDname"})
	public Dept(Integer deptno,String dname) {
		this.deptno = deptno;
		this.dname =dname;
	}
	
	public Integer getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "部门编号：" + this.deptno + ",部门名称" + this.dname;
	}
}
