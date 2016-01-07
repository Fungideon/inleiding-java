package hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class TienVerticaleLijnen extends Applet {
	
    public void init() {
    	setSize(300, 400);
    }
    

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;
		
        while(teller < 10) {
            x += 20;
            g.drawLine(x , 50, x, 300 );
            teller++;
        }
    }
}