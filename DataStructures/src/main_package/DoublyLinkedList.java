package main_package;

public class DoublyLinkedList {
	
	private DoublyLinkedListStructure head;
	private DoublyLinkedListStructure tail;
	
	public DoublyLinkedList() {
		head = tail = null;
	}
	
	public DoublyLinkedListStructure getHeadLink() {
		return head;
	}
	
	public void insertNode(char key) {
		DoublyLinkedListStructure newNode = new DoublyLinkedListStructure(key);
		if(head == null) {
			head = tail = newNode;
			head.setNext(tail);
		} else {
			newNode.setPrevious(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public boolean removeNode(char key) {
		DoublyLinkedListStructure oneLink = head;
		
		while(oneLink != null) {
			if(oneLink.getKey() == key) {
				oneLink.getPrevious().setNext(oneLink.getNext());
				oneLink.getNext().setPrevious(oneLink.getPrevious());
				System.out.println("Key successfully deleted");
				return true;
			}
			oneLink = oneLink.getNext();
		}
		
		System.out.println("Key is not found");
		return false;
	}
	
	public void displayLinksFromHead() {
		DoublyLinkedListStructure oneLink = head;
		System.out.println("From Head");
		while(oneLink != null) {
			System.out.println("Key: " + oneLink.getKey());
			oneLink = oneLink.getNext();
		}
	}
	
	public void displayLinksFromTail() {
		DoublyLinkedListStructure oneLink = tail;
		System.out.println("From Tail");
		while(oneLink != null) {
			System.out.println("Key: " + oneLink.getKey());
			oneLink = oneLink.getPrevious();
		}
	}
}
