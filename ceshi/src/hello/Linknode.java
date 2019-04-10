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
		//第一步：设置对象
		Node root = new Node("火车头");
		Node n1 = new Node("汽车");
		Node n2 = new Node("自行车");
		//设置关系
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
