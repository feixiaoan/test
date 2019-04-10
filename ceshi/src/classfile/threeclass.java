package classfile;
class Province {      //省份
	private int pid;    //省份编号
	private String name;  //省份名称
	private City citys[];   //一个省份包含多个城市
	public Province() {}
	public Province(int pid,String name) {
		this.pid = pid;
		this.name = name;
	}
	public void setCitys(City []citys) {
		this.citys = citys;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return this.pid;
	}
	public String getNmae() {
		return this.name;
	}
	public City[] getCitys() {
		return citys;
	}
	public String getInfo() {
		return "省份编号：" + this.pid + ",省份名称：" + this.name;
	}
}
class City {
	private int cid;       //城市编号
	private String name;    //城市名称
	private Province province;  //一个城市属于一个省份
	public City() {}
	public City(int cid,String name) {
		this.cid = cid;
		this.name = name;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCid() {
		return this.cid;
	}
	public String getName() {
		return this.name;
	}
	public Province getProvince() {
		return this.province;
		
	}
	public String getInfo() {
		return "城市编号：" + this.cid + ",城市名称：" + this.name;
	}
	
}

public class threeclass {

	public static void main(String[] args) {
		//第一步：设置关系数据
		//1.先准备好各自单独对象
		Province pro = new Province(1,"陕西省");
		City c1 = new City(1001,"西安市");
		City c2 = new City(1002,"咸阳市");
		City c3 = new City(1003,"宝鸡市");
		//2.设置关系
		c1.setProvince(pro);
		c2.setProvince(pro);
		c3.setProvince(pro);
		pro.setCitys(new City [] {c1,c2,c3});
		//第二步：取出关系数据
		System.out.println(c1.getProvince().getInfo());
		c1.setName("ooooo");
		for(int x=0;x<pro.getCitys().length;x++) {
			System.out.println("\t|-" + pro.getCitys()[x].getInfo());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
