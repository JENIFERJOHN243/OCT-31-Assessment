package task;

public class SinglyLinkedList {
	class Node {
		int val;
		Node next;
		Node(int val){
			this.val = val;
			next = null;
		}
	}
	Node head;	
	SinglyLinkedList() {
		head = null;
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		if(head==null) {
			head = node;
		}else {
			node.next = head;
			head = node;
		}
	}
	
	public void insertAtPosition(int position, int value) {
		if(position==0) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		Node temp = head;
		for(int i=1;i<position;i++) {
			temp = temp.next;
			if(temp==null) {
				System.out.println("invalid position");
			}
		}
		node.next = temp.next;
		temp.next = node;
	}
	
	public void findGreaterNode(SinglyLinkedList linkedList) {
		int[] answer= new int[6];
		int index=0;
		while(head!=null) {
			int max =head.val;
			Node temp = head;
		while(temp!=null) {
			int value1 = temp.val;
			if(value1>max) {
				max=Math.max(max, value1);
				break;
			}
			temp=temp.next;
		}
		if(max==head.val) {
			answer[index++]=0;
		}else {
		answer[index++]=max;
		}
		head=head.next;
		}
		for(int i =0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		 }
   }
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next; 
		}
		System.out.println();
	}

}