package main_package;

public class DoublyLinkedListStructure {
	private DoublyLinkedListStructure next;
	private DoublyLinkedListStructure previous;
	private char key;
	
	public DoublyLinkedListStructure(char key) {
		this.key = key;
		next = previous = null;
	}
	
	public void setNext(DoublyLinkedListStructure next) {
		this.next = next;
	}
	
	public void setPrevious(DoublyLinkedListStructure previous) {
		this.previous = previous;
	}
	
	public DoublyLinkedListStructure getNext() {
		return next;
	}
	
	public DoublyLinkedListStructure getPrevious() {
		return previous;
	}
	
	public char getKey() {
		return key;
	}
}
