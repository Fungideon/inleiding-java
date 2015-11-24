package opdracht4_5;

import java.applet.*;
import java.awt.*;

public class Ellips extends Applet {

	public void init(){
		setBackground(Color.blue);
		setSize(180,250);
		
	}
	
	public void paint (Graphics g){
		g.setColor(Color.yellow);
		g.fillArc(20, 20, 100, 200, 0, 360);
		
	}
	
	
	
}
