package opdracht11_6;

import java.awt.*;
import java.applet.*;


public class Cirkels extends Applet {
	int teller;
    public void init() {
    	setSize(300, 400);
    }
    
    public void paint(Graphics g) {
        int y = 100;
        int x = 20;
		
        for( teller = 0; teller < 5; teller ++){
        	g.drawOval(y, y, x, x);
        	y -= 10;
        	x += 20;
        	
        }
    }
}