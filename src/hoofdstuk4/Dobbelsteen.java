package hoofdstuk4;

import java.applet.*;
import java.awt.*;

public class Dobbelsteen extends Applet {
	
	public void init(){
		setSize(300,300);
		
	}
	
	public void paint (Graphics g){
		g.drawRoundRect(20, 20, 250, 250, 50, 50);
		g.fillOval(35, 35, 75, 75);
		g.fillOval(175, 35, 75, 75);
		g.fillOval(35, 175, 75, 75);
		g.fillOval(175, 175, 75, 75);
		
	}

}
