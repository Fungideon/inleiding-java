package opdracht13_5;

import java.awt.*;
import java.applet.*;

public class Boom extends Applet {
	int hoogteboom;
	int xpos;
	int ypos;
	Color bruin;
	
	public void init(){
		hoogteboom = 150;
		xpos = 50;
		ypos = 50;
		bruin = new Color (127, 51, 0, 255);
		
	}
	
	public void paint(Graphics g){
		tekenBoom(g, xpos, ypos);
	}
	
	void tekenBoom(Graphics g, int x1, int x2){
		int hoogtekruin = hoogteboom /3;
		int breedtekruin = hoogtekruin;
		int breedtestam = breedtekruin /3;
		int hoogtestam = hoogtekruin * 2;
		
		g.setColor(bruin);
		g.fillRect(x1 + breedtestam, x2 + hoogtekruin, breedtestam, hoogtestam);
		g.setColor(Color.green);
		g.fillOval(x1, x2, breedtekruin, hoogtekruin);
	}

}
