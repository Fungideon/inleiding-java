package hoofdstuk4;

import java.awt.*;
import java.applet.*;


public class Vlag extends Applet {

	public void init(){
		setSize(200,200);
	}
	
	public void paint (Graphics g){
		g.drawRect(16, 0, 100, 76);
		g.drawRect(0, 0, 15, 150);
		g.setColor(Color.red);
		g.fillRect(16, 1, 100, 25);
		g.setColor(Color.white);
		g.fillRect(16, 26, 100, 25);
		g.setColor(Color.blue);
		g.fillRect(16, 51, 100, 25);
		
	}
	
}
