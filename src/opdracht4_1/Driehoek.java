package opdracht4_1;

import java.awt.*;
import java.applet.*;


public class Driehoek extends Applet {

	public void init(){
		
	}
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.drawLine(100, 0, 0, 200);
		g.drawLine(100, 0, 200, 200);
		g.drawLine(0, 200, 200, 200);
		
	}
}
