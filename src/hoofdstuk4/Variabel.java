package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Variabel extends Applet {
	int valerie, hans, jeroen, valerie2, hans2, jeroen2;
	
	public void init(){
		hans = 80;
		valerie = 40;
		jeroen =  100;
		hans2 = 200 - hans;
		valerie2 = 200 - valerie;
		jeroen2 = 200 - jeroen;
		setSize(250,250);	
	}
	
	public void paint (Graphics g){
		g.drawString("Gewicht", 5, 15);
		g.drawLine(0, 200, 250, 200);
		g.drawString("Valerie", 20, 220);
		g.drawString("Hans", 80, 220);
		g.drawString("Jeroen", 140, 220);
		//gewicht bars
		//Valerie
		g.setColor(Color.YELLOW);
		g.fillRect(25, valerie2, 25, valerie);
		//Hans
		g.setColor(Color.BLUE);
		g.fillRect(80, hans2, 25, hans);
		//Jeroen
		g.setColor(Color.RED);
		g.fillRect(140, jeroen2, 25, jeroen);
		//lijn verdeling en text
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
		g.drawLine(25, 60, 250, 60);
		g.drawString("140", 1, 60);

		
	}
	

}
