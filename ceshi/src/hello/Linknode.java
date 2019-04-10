package hello;

class Node {
	private String date;
	private Node next;
	public Node(String date) {
		this.date = date;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public String getDate() {
		return this.date;
	}
	public Node getNext() {
		return this.next;
	}

	
}
public class Linknode {

	public static void main(String[] args) {
		//��һ�������ö���
		Node root = new Node("��ͷ");
		Node n1 = new Node("����");
		Node n2 = new Node("���г�");
		//���ù�ϵ
		root.setNext(n1);
		n1.setNext(n2);
		print(root);
		/*Node head = root;
		while(head != null) {
			System.out.println(head.getDate());
			head = head.getNext();
		}
		*/
	}
	public static void print(Node head) { 
		if(head == null) {
			return ;
		}
		System.out.println(head.getDate());
		print(head.getNext());
		
	}

}
