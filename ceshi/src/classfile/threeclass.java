package classfile;
class Province {      //ʡ��
	private int pid;    //ʡ�ݱ��
	private String name;  //ʡ������
	private City citys[];   //һ��ʡ�ݰ����������
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
		return "ʡ�ݱ�ţ�" + this.pid + ",ʡ�����ƣ�" + this.name;
	}
}
class City {
	private int cid;       //���б��
	private String name;    //��������
	private Province province;  //һ����������һ��ʡ��
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
		return "���б�ţ�" + this.cid + ",�������ƣ�" + this.name;
	}
	
}

public class threeclass {

	public static void main(String[] args) {
		//��һ�������ù�ϵ����
		//1.��׼���ø��Ե�������
		Province pro = new Province(1,"����ʡ");
		City c1 = new City(1001,"������");
		City c2 = new City(1002,"������");
		City c3 = new City(1003,"������");
		//2.���ù�ϵ
		c1.setProvince(pro);
		c2.setProvince(pro);
		c3.setProvince(pro);
		pro.setCitys(new City [] {c1,c2,c3});
		//�ڶ�����ȡ����ϵ����
		System.out.println(c1.getProvince().getInfo());
		c1.setName("ooooo");
		for(int x=0;x<pro.getCitys().length;x++) {
			System.out.println("\t|-" + pro.getCitys()[x].getInfo());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
