package opdracht11_9;

import java.applet.*;
import java.awt.*;

public class Schaakbord extends Applet {
	
	public void init(){
		setSize(600,600);
	}
	
	public void paint(Graphics g){
		int x = 50;
		int y = 50;
		int width = 50;
		int height = 50;
		
		for(int rij = 0; rij < 8; rij++){
			x = 50;
			y += height;
			if(rij == 0 || rij == 2 || rij == 4 || rij == 6){
				for(int kolom = 0; kolom < 8; kolom++){
					if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
						g.setColor(Color.black);
						g.fillRect(x, y, width, height);
					}
					else{
						g.setColor(Color.white);
						g.fillRect(x, y, width, height);
					}
					x += width;
				}
			}
			else{
				for(int kolom = 0; kolom < 8; kolom++){
					if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
						g.setColor(Color.white);
						g.fillRect(x, y, width, height);
					}
					else{
						g.setColor(Color.black);
						g.fillRect(x, y, width, height);
					}
					x += width;
				}
				
			}
		}
		g.drawRect(50, 100, 400, 400);
	}

}
