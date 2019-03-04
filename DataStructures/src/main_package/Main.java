package main_package;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main extends JFrame{

	private DoublyLinkedList doublyLinked;
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
            	Main main = new Main();
        		main.start();
                main.setVisible(true);
            }
        });
	}
	
	private void start() {
		doublyLinked = new DoublyLinkedList();
		
		doublyLinked.insertNode('A');
		doublyLinked.insertNode('B');
		doublyLinked.insertNode('C');
		doublyLinked.insertNode('D');
		doublyLinked.insertNode('E');
		doublyLinked.insertNode('F');
		doublyLinked.insertNode('G');
		doublyLinked.insertNode('H');
		doublyLinked.insertNode('I');
		doublyLinked.insertNode('J');
		doublyLinked.insertNode('K');
		
		//doublyLinked.displayLinksFromHead();
		Surface surface = new Surface(doublyLinked.getHeadLink());
		
		add(surface);
		
		setTitle("DoublyLinkedList Visualization");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}





