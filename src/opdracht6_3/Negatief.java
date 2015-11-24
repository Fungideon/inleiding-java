package opdracht6_3;

import java.applet.*;
import java.awt.*;

public class Negatief extends Applet {
	int a, b, c;
	
	public void init(){
		a = 2147483647;
		b = 420;
		c = a + b;	
	}
	public void paint(Graphics g){
		g.drawString("" + a, 22, 20);
		g.drawString("+  " + b, 10, 40);
		g.drawString("=  " + c, 10, 60);
		g.drawLine(20, 45, 100, 45);
	}
	
	
}
