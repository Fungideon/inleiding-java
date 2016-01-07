package hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class VijfVierkanten extends Applet {
	int teller;
    public void init() {
    	setSize(300, 400);
    }
    
    public void paint(Graphics g) {
        int y = 20;
        int x = 20;
        int y2 = 20;
        int x2 = 20;
		
        for( teller = 0; teller < 5; teller ++){
        	g.drawRect(x, y, x2, y2);
        	y += 20;
        	x += 20;
        }
    }
}