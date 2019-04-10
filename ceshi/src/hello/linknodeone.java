package hello;
class Node1 {
	private String date;
	private Node1 next;
	private Node newNode;
	public Node1(String date) {
		this.date = date;
	}
	public String getDate() {
		return this.date;
	}
	public void setNext(Node1 next) {
		this.next = next;
	}
	public Node1 getNext() {
		return this.next;
	}
	public void addNode(Node newNode) {
		this.newNode = newNode;
	}
}
class Link {
	private Node root;
	public void add(String date) {
		Node newNode = new Node(date);
		if(this.root == null) {
			this.root = newNode;
		}else {
			
		}
	}
	public void print() {
	
	}
}

public class linknodeone {

	public static void main(String[] args) {
		Link l = new Link();
		l.add("java");
		l.add("jsp");
		

	}

}
