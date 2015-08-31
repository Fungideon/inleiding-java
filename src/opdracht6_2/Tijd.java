package opdracht6_2;

import java.applet.*;
import java.awt.*;

public class Tijd extends Applet {
	int sec, minuut, uur, dag, jaar; 	
	
	public void init(){
		sec = 1;
		uur = (sec * 60 * 60);
		dag = (uur * 24);
		jaar = (dag * 365);
		
	}
	public void paint(Graphics g){
		g.drawString("Seconden", 5, 11);
		g.drawString("uur    " + uur, 5, 25);
		g.drawString("dag   " + dag, 5, 45);
		g.drawString("jaar   " + jaar, 5, 65);
		g.drawLine(30, 15, 30, 80);
		g.drawLine(5, 70, 100, 70);
		
	}
	
	
}
