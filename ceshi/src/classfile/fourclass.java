package classfile;

class Item {     //����Ŀ
	private int iid;
	private String name;
	private String note;
	private Subitem subitems [];
	private Product products [];
	public Item() {}
	public Item(int iid,String name,String note) {
		this.iid = iid;
		this.name = name;
		this.note = note;
	}
	public void setSubitems(Subitem subitems[]) {
		this.subitems = subitems;
	}
	public Subitem[] getSubitems() {
		return subitems;
	}
	public void setProducts(Product products []) {
		this.products = products;
	}
	public Product[] getProducts() {
		return products;
	}
	public int getIid() {
		return this.iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}
    public String getInfo() {
    	return "��Ŀ��ţ�" + this.iid + ",���ƣ�" + this.name + ",������" + this.note;
    }
}
class Subitem {   //����Ŀ
	private int sid;
	private String name;
	private String note;
	private Item items;
	private Product products [];
	public Subitem() {}
	public Subitem(int sid,String name,String note) {
		this.sid = sid;
		this.name = name;
		this.note = note;
	}
	public Item getItems() {
		return this.items;
	}
	public void setItems(Item items) {
		this.items = items;
	}
	public Product[] getProducts() {
		return this.products;
	}
	public void SetProducts(Product products[]) {
		this.products = products;
	}
	public int getSid() {
		return this.sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getInfo() {
		return "����Ŀ��ţ�" + this.sid + ",���ƣ�" + this.name + ",������" + this.note;
	}
}
class Product {         //��Ʒ
	private int pid;
	private String name;
	private double price;
	private Item items;
	private Subitem subitems;
	public Product () {}
	public Product (int pid,String name,double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Item getItems() {
		return this.items;
	}
	public void setItems(Item items) {
		this.items = items;
	}
	public Subitem getSubitems() {
		return this.subitems;
	}
	public void setSubitems(Subitem subitems) {
		this.subitems = subitems;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInfo() {
		return "��Ʒ��ţ�" + this.pid + ",���ƣ�" + this.name + ",�۸�" + this.price;
	}
}
public class fourclass {

	public static void main(String[] args) {
		//�������ݹ�ϵ
		//1.׼���������������
		Item item = new Item(1,"�����þ�","--");
		Subitem suba = new Subitem(1001,"����","----");
		Subitem subb = new Subitem(1002,"����","----");
		Subitem subc = new Subitem(1003,"�;�","----");
		Product proa = new Product(9001,"����",500.0);
		Product prob = new Product(9002,"����",800.0);
		Product proc = new Product(9003,"�˵�",1000.0);
		Product prod = new Product(9004,"ˮ����",2000.0);
		Product proe = new Product(9005,"�໨��",3000.0);
		Product prof = new Product(9006,"ˮ����",5000.0);
		//2.�������ݹ�ϵ
		suba.setItems(item);
		subb.setItems(item);
		subc.setItems(item);
	    item.setSubitems(new Subitem[] {suba,subb,subc});
	    proa.setSubitems(suba);
	    proa.setItems(item);
	    prob.setSubitems(suba);
	    prob.setItems(item);
	    proc.setSubitems(subb);
	    proc.setItems(item);
	    prod.setSubitems(subb);
	    prod.setItems(item);
	    proe.setSubitems(subc);
	    proe.setItems(item);
	    prof.setSubitems(subc);
	    prof.setItems(item);
	    suba.SetProducts(new Product[] {proa,prob});
	    subb.SetProducts(new Product [] {proc,prod});
	    subc.SetProducts(new Product[] {proe,prof});
	    item.setProducts(new Product[] {proa,prob,proc,prod,proe,prof});
	   // �ڶ�����ȡ������ 
	    //1.ͨ��һ�������ҵ�����ȫ��������
	    System.out.println(item.getInfo());
	    for(int i = 0;i < item.getSubitems().length; i++) {
	    	System.out.println("\t|-" + item.getSubitems()[i].getInfo());
	    }
	    System.out.println("-----------------------------------------------");
	    //2.ͨ��һ�����ҵ�����ȫ����Ʒ�Լ�ÿ����Ʒ��Ӧ��������
	    System.out.println(item.getInfo());
	    for(int i = 0; i < item.getProducts().length; i++) {
	    	 System.out.println("\t|-" + item.getProducts()[i].getInfo());
	    	 System.out.println("\t\t|-" + item.getProducts()[i].getSubitems().getInfo());	 
	    }
	    //3.ͨ��һ���������ҵ�����Ӧ��ȫ����Ʒ
	    System.out.println("------------------------------------------------");
	    System.out.println(subb.getInfo());
	    for(int i = 0;i < subb.getProducts().length; i++) {
	    	System.out.println("\t|-" + subb.getProducts()[i].getInfo());
	    }
	}
}
