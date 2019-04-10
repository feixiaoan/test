package classfile;
class Admin {
	private String aid;
	private String password;
	private Role role;
	public Admin() {}
	public Admin(String aid,String password) {
		this.aid = aid;
		this.password = password;
	}
	public Role getRole() {
		return this.role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getAid() {
		return this.aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
	public String getInfo() {
		return "����Ա��ţ�" + this.aid + ",���룺" + this.password;
	}
}
class Role {
	private int rid;
	private String title;
	private Admin admins[];
	private Group groups[];
	public Role() {}
	public Role(int rid,String title) {
		this.rid = rid;
		this.title = title;
	}
 	public Group[] getGroups() {
 		return this.groups;
 	}
 	public void setGroups(Group groups[]) {
 		this.groups = groups;
 	}
	public Admin[] getAdmins() {
		return this.admins;
	}
	public void setAdmins(Admin admins[]) {
		this.admins = admins;
	}
	public int getRid() {
		return this.rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfo() {
		return "��ɫ��ţ�" + this.rid + ",���ƣ�" + this.title;
	}
}
class Group {
	private int gid;
	private String title;
	private Role roles[];
	private Action actions[];
	public Group() {}
	public Group(int gid,String title) {
		this.gid = gid;
		this.title = title;
	}
	public Action[] getActions() {
		return this.actions;
	}
	public void setActions(Action actions[]) {
		this.actions = actions;
	}
	public Role[] getRoles() {
		return this.roles;
	}
	public void setRoles(Role roles[]) {
		this.roles = roles;
	}
	public int getGid() {
		return this.gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfo() {
		return " Ȩ�����ţ�  " + this.gid + ",���ƣ�" + this.title;
	}
}
class Action {
	private int aid;
	private String title;
	private String url;
	private Group groups;
	public Action() {}
	public Action(int aid,String title,String url) {
		this.aid = aid;
		this.title = title;
		this.url = url;
	}
	public Group getGroups() {
		return this.groups;
	}
	public void setGroups(Group groups) {
		this.groups = groups;
	}
	public int getAid() {
		return this.aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getInfo() {
		return "Ȩ�ޱ�ţ�" + this.aid + ",���ƣ�" + this.title + ",·����" + this.url;
	}
}
public class fiveclass {

	public static void main(String[] args) throws Exception {
		//��һ������������
		Admin a1 = new Admin("admin","hello");
		Admin a2 = new Admin("mldn","huiio");
		Admin a3 = new Admin("qwer","uiuiui");
		Role r1 = new Role(1," ϵͳ����Ա ");
		Role r2 = new Role(2,"��Ϣ����Ա");
		Group g1 = new Group(10,"��Ϣ����");
		Group g2 = new Group(11,"�û�����");
		Group g3 = new Group(12,"���ݹ���");
		Group g4 = new Group(13,"�ӿڹ���");
		Group g5 = new Group(14,"���ݹ���");
		Action ac1 = new Action(1001,"���ŷ���","-");
		Action ac2 = new Action(1002,"�������","-");
		Action ac3 = new Action(1003,"�����б�","-");
		Action ac4 = new Action(1004,"�����û�","-");
		Action ac5 = new Action(1005,"�û��б�","-");
		Action ac6 = new Action(1006,"��½��־","-");
		Action ac7 = new Action(1007,"��Ա����","-");
		Action ac8 = new Action(1008,"��������","-");
		Action ac9 = new Action(1009,"��˾����","-");
		Action ac10 = new Action(1010,"������","-");
		Action ac11 = new Action(1011,"����ƽ̨","-");
		Action ac12 = new Action(1012,"ȫ������","-");
		Action ac13 = new Action(1013,"�ֲ�����","-");
		//2.���ö����Ļ�����ϵ
		//���ù���Ա�ͽ�ɫ
		a1.setRole(r1);
		a2.setRole(r2);
		a3.setRole(r2);
		r1.setAdmins(new Admin[] {a1});
		r2.setAdmins(new Admin[] {a2,a3});
		//���ù���Ա�͹���Ա��
		r1.setGroups(new Group[] {g1,g2,g3,g4,g5});
		r2.setGroups(new Group[] {g1,g2});
		g1.setRoles(new Role[] {r1,r2});
		g2.setRoles(new Role[] {r1,r2});
		g3.setRoles(new Role[] {r1});
		g4.setRoles(new Role[] {r1});
		g5.setRoles(new Role[] {r1});
		//���ù���Ա���Ȩ��
		g1.setActions(new Action[] {ac1,ac2,ac3});
		g2.setActions(new Action[] {ac4,ac5,ac6});
		g3.setActions(new Action[] {ac7,ac8,ac9});
		g4.setActions(new Action[] {ac10,ac11});
		g5.setActions(new Action[] {ac12,ac13});
		ac1.setGroups(g1);
		ac2.setGroups(g1);
		ac3.setGroups(g1);
		ac4.setGroups(g2);
		ac5.setGroups(g2);
		ac6.setGroups(g2);
		ac7.setGroups(g3);
		ac8.setGroups(g3);
		ac9.setGroups(g3);
		ac10.setGroups(g4);
		ac11.setGroups(g4);
		ac12.setGroups(g5);
		ac13.setGroups(g5);
		//�ڶ�����ȡ������
		System.out.println(a1.getInfo());
		System.out.println("\t|-" + a1.getRole().getInfo());
		for(int x = 0;x < a1.getRole().getGroups().length; x++) {
			System.out.println("\t\t|-" + a1.getRole().getGroups()[x].getInfo());
			for(int y = 0;y < a1.getRole().getGroups()[x].getActions().length; y++) {
				System.out.println("\t\t\t|-" + a1.getRole().getGroups()[x].getActions()[y].getInfo());
			}
		}
		System.out.println("--------------------------------------------------------");
		System.out.println(g1.getInfo());
		for(int x = 0;x < g1.getActions().length; x++) {
			
			System.out.println("\t|-" + g1.getActions()[x].getInfo());
			System.out.println("\t\t|-" + g1.getActions()[x].getGroups().getInfo());
		}
		System.out.println("--------------------------------------------------------");
		for(int x = 0;x < g2.getRoles().length; x++) {
			System.out.println(g2.getRoles()[x].getInfo());
			for(int y = 0;y < g2.getRoles()[x].getAdmins().length; y ++) {
				System.out.println("\t\t|-" + g2.getRoles()[x].getAdmins()[y].getInfo());
			}
		}
		System.out.println("--------------------------------------------------------");
	}

}
