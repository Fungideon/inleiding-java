package hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class CirkelsGroot extends Applet {
	int teller;
    public void init() {
    	setSize(600, 600);
    }
    
    public void paint(Graphics g) {
        int y = 300;
        int x = 20;
		
        for( teller = 0; teller < 50; teller ++){
        	g.drawOval(y, y, x, x);
        	y -= 5;
        	x += 10;
        	
        }
    }
}