package opdracht4_4;

import java.awt.*;
import java.applet.*;

public class Gewicht extends Applet {
	
	public void init(){
		setSize(250,250);
		
	}
	
	public void paint (Graphics g){
		g.drawString("Gewicht", 5, 15);
		g.drawLine(0, 200, 250, 200);
		g.drawString("Valerie", 20, 220);
		g.drawString("Hans", 80, 220);
		g.drawString("Jeroen", 140, 220);
		g.setColor(Color.YELLOW);
		g.fillRect(25, 160, 25, 40);
		g.setColor(Color.BLUE);
		g.fillRect(80, 120, 25, 80);
		g.setColor(Color.RED);
		g.fillRect(140, 100, 25, 100);
		g.setColor(Color.black);
		g.drawLine(25, 180, 250, 180);
		g.drawString("20", 1, 180);
		g.drawLine(25, 160, 250, 160);
		g.drawString("40", 1, 160);
		g.drawLine(25, 140, 250, 140);
		g.drawString("60", 1, 140);
		g.drawLine(25, 120, 250, 120);
		g.drawString("80", 1, 120);
		g.drawLine(25, 100, 250, 100);
		g.drawString("100", 1, 100);
		g.drawLine(25, 80, 250, 80);
		g.drawString("120", 1, 80);


		
	}
	

}
