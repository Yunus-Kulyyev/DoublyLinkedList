package main_package;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Surface extends JPanel{
	DoublyLinkedListStructure listToBeDrawn;
	
	public Surface(DoublyLinkedListStructure listToBeDrawn) {
		this.listToBeDrawn = listToBeDrawn;
	}
	
	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		int w = getWidth();
		int h = getHeight();
		
		DoublyLinkedListStructure oneLink = listToBeDrawn;
		int pusher = 30;
		
		while(oneLink != null) {
			//drawing a box around
			g2d.drawLine(15 + pusher, pusher*2+5, 60 + pusher, pusher*2+5);		//BOTTOM Line
			g2d.drawLine(15 + pusher, pusher*2-15, 60 + pusher, pusher*2-15);	//TOP Line
			g2d.drawLine(15 + pusher, pusher*2+5, 15 + pusher, pusher*2-15);	//LEFT Line
			g2d.drawLine(60 + pusher, pusher*2+5, 60 + pusher, pusher*2-15);	//RIGHT Line
			
			if(oneLink.getNext() != null) {
				g2d.drawLine((15 + pusher)+25, pusher*2+5, (15 + pusher)+30, pusher*2+25);
				g2d.drawLine((15 + pusher)+30, pusher*2+5, (15 + pusher)+35, pusher*2+25);
			}
			
			g2d.drawString("Key: " + oneLink.getKey(), 20 + pusher, pusher*2);
			oneLink = oneLink.getNext();
			pusher += 20;
		}
	}
	
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}
