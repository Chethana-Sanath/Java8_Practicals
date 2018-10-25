import java.util.LinkedList;
import java.util.List;


public class CustomLinkedList {

	//this class has 2 fields, node (root node) and size
	public Node root;
	public int size;
	
	public CustomLinkedList() {
		root = new Node();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		System.out.println("Size :"+linkedList.size);
		System.out.println("Return Ëlement with data 1 "+linkedList.find(1));
		System.out.println("Return Ëlement with data 5 "+linkedList.find(5));
		linkedList.remove(1);
		System.out.println("Size :"+linkedList.size);
	}
	
	public void add(int val) {
		Node newNode = new Node(val,root);
		root = newNode;
		size++;
	}
	
	public Node find(int val) {
		Node currentNode = root;
		while(currentNode!=null) {
			if(currentNode.getData()==val)
				return currentNode;
			currentNode = currentNode.getNextNode();
		}
		return null;
	}
	
	public boolean remove(int val) {
		Node currentNode=root;
		Node prevNode=null;
		while(currentNode!=null) {
			if(currentNode.getData()==val) {
				prevNode.setNextNode(currentNode.getNextNode());
				size--;
				return true;
			}
			prevNode=currentNode;
			currentNode=currentNode.getNextNode();
		}
		return false;
	}
	
	//Each node has data and pointer to next node
	private class Node {
		private int data;
		private Node nextNode;
		
		private Node() {}
		
		private Node(int data,Node nextNode) {
			this.data = data;
			this.nextNode = nextNode;
		}
		
		private int getData() {
			return data;
		}
		private void setData(int data) {
			this.data = data;
		}
		private Node getNextNode() {
			return nextNode;
		}
		private void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
		
		
	}

}
