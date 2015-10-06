package opdracht4_6;

import java.applet.*;
import java.awt.*;

public class Stoplicht extends Applet {
	
	public void init(){
		setSize(150,300);
	}
	
	public void paint (Graphics g){
		g.fillRect(20, 20, 100, 275);
		g.setColor(Color.red);
		g.fillOval(32, 32, 75, 75);
		g.setColor(Color.orange);
		g.fillOval(32, 119, 75, 75);
		g.setColor(Color.green);
		g.fillOval(32, 206, 75, 75);
		
	}

}
