package opdracht11_4;

import java.awt.*;
import java.applet.*;


public class Drie extends Applet {
	int teller;
    public void init() {
    	setSize(300, 400);
    }
    

    public void paint(Graphics g) {
        int y = 20;
        int getal = 3;
        int totaal = 0;
		
        for( teller = 1; teller <= 10; teller ++){
        	totaal = getal * teller;
        	g.drawString(getal + " x " + teller + " = " + totaal, 10, y);
        	y += 20;
        }
    }
}