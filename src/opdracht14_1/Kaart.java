package opdracht14_1;

import java.applet.*;
import java.awt.*;

public class Kaart extends Applet {
	String[] kleuren = { "Klaver", "Ruiten", "Schoppen", "Harten" };
	String[] kaarten = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "koning", "aas" };
	public void init(){
		
	}
	
	public void paint(Graphics g){
		g.drawString(drawCard(), 50, 50);
	}
	
	String drawCard(){
		double k = Math.random();
        int kleur = (int)(k * 4 + 0);
        double w = Math.random();
        int getal = (int)(w * 13 + 0);

        return kleuren[kleur]+", "+kaarten[getal];
	}

}
