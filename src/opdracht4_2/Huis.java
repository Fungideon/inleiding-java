package opdracht4_2;

import java.awt.*;
import java.applet.*;


public class Huis extends Applet {

	public void init(){
		setSize(250,250);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.black);
		//dak
		g.drawLine(100, 0, 0, 50);
		g.drawLine(100, 0, 200, 50);
		//muur
		g.drawRect(0, 50, 200, 100);
		//deur
		g.drawRect(50, 100, 25, 50);
		g.drawRect(56, 130, -2, -5);
		//raam
		g.drawRect(125, 100, 25, 25);
		g.drawLine(137, 125, 137, 100);
		g.drawLine(138, 125, 138, 100);
		g.drawLine(125, 112, 150, 112);
		g.drawLine(125, 113, 150, 113);
		
	}
}
