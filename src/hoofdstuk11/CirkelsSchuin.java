package hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class CirkelsSchuin extends Applet {
	int teller;
    public void init() {
    	setSize(600, 600);
    }
    
    public void paint(Graphics g) {
        int y = 10;
        int x = 20;
		
        for( teller = 0; teller < 100; teller ++){
        	g.drawOval(y, y, x, x);
        	y += 2;
        	x += 3;
        	
        }
    }
}