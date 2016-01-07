package hoofdstuk13;

import java.awt.*;
import java.applet.*;

//opdracht 13.3
public class Baksteen extends Applet {
	
	public void init(){
		setSize(700, 700);
	}
	
	public void paint(Graphics g){
		tekenBaksteen(g, 10, 15);
	}
	
	void tekenBaksteen(Graphics g, int column, int rijlengte){
		int x;
		int y;
		int width;
		int height;
		x = 0;
		y = 0;
		width = 40;
		height = 20;
		g.setColor(Color.red);
		for(int teller = 0; teller < column; teller++){
			y += 20;
			if(teller % 2 == 0){
				x = 0;
				for(int rij = 0; rij < rijlengte; rij++){
					x = x + 20;
					g.fillRect(x, y, width, height);
					x = x + height + 2;
				}
			}
			else{
				x = 10;
				for(int rij = 0; rij < rijlengte; rij++){
					x = x + 20;
					g.fillRect(x, y, width, height);
					x = x + height + 2;
				}
			}
			y += 2;
		}
	}
	
}
