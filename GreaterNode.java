package task;

public class GreaterNode {

	public static void main(String[] args) {
		getInput();
	}

	private static void getInput() {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.insertAtPosition(0, 2);
		linkedList.insertAtPosition(1, 7);
		linkedList.insertAtPosition(2, 4);
		linkedList.insertAtPosition(3, 3);
		linkedList.insertAtPosition(4, 5);
		linkedList.insertAtPosition(5, 6);
		System.out.println("Input : ");
		linkedList.display();
		System.out.println("Output : ");
		linkedList.findGreaterNode(linkedList);
	}
}
