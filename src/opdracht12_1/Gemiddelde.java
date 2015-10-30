package opdracht12_1;

import java.awt.*;
import java.applet.*;

public class Gemiddelde extends Applet {
	double rij[];
	double gemiddelde;
	
	public void init(){
		setSize(500, 500);
		rij = new double [10];
		for(int teller = 0; teller < rij.length; teller++){
			rij[teller] = 1 * teller + 1;
			gemiddelde = gemiddelde + rij[teller];
		}
		gemiddelde = gemiddelde / rij.length;
	}
	
	public void paint(Graphics g){
		 for (int teller = 0; teller < rij.length; teller ++) {
	            g.drawString("" + rij[teller], 50, 20 * teller + 20);
	            g.drawString("gemiddlde " + gemiddelde, 50, 20 * rij.length + 20);
		 }
	}

}
