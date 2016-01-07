package hoofdstuk6;

import java.applet.*;
import java.awt.*;

public class Geld extends Applet {
	double a, b, uitkomst;
	
	
	public void init(){
		a = 113;
		b = 4;
		uitkomst = (a / b);
		
	}
	
	public void paint(Graphics g){
		g.drawString("Iedereen krijgt € " + uitkomst, 20, 20);
		
	}
	
	
}
