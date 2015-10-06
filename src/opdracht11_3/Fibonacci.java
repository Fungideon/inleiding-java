package opdracht11_3;

import java.awt.*;
import java.applet.*;


public class Fibonacci extends Applet {
	int a, b, c;
    public void init() {
    	setSize(300, 400);
    	a = 1;
    	b = 1;
    	c = 0;
    }
    

    public void paint(Graphics g) {
        g.drawString("" + a, 0, 20);
        g.drawString("" + b, 50, 20);
        c = a + b;
        g.drawString("" + c, 100, 20);
    	int y = 40;
		int x = 0;
		
        do{
        	a = c + b;
        	x = 0;
        	g.drawString("" + a, x, y);
        	x += 50;
        	b = c + a;
        	g.drawString("" + b, x, y);
        	x += 50;
        	c = a + b;
        	g.drawString("" + c, x, y);
        	y += 20;
        }while (c < 2000);
    }
}