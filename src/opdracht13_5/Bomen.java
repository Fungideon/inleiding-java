package opdracht13_5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Bomen extends Applet {
	int hoogteboom;
	int aantalbomen;
	int aantalrijen;
	int margehoogte;
	int margebreedte;
	int xpos;
	int ypos;
	Color bruin;
	
	public void init(){
		setSize(500,500);
		hoogteboom = 150;
		aantalrijen = 2;
		aantalbomen = 5;
		margebreedte = 10;
		margehoogte = 10;
		xpos = 50;
		ypos = 50;
		bruin = new Color (127, 51, 0, 255);	
	}
	
	public void paint(Graphics g){
		for(int tellerrij = 0; tellerrij < aantalrijen; tellerrij++){
			for(int tellerboom = 0; tellerboom < aantalbomen; tellerboom++){
				tekenBoom(g, xpos, ypos);
				xpos = xpos + ((hoogteboom /3) + margebreedte);
			}
			xpos = 50;
			ypos = ypos + (hoogteboom + margehoogte);
		}
		ypos = 50;
	}
	
	void tekenBoom(Graphics g, int x1, int y1){
		int hoogtekruin = hoogteboom /3;
		int breedtekruin = hoogtekruin;
		int breedtestam = breedtekruin /3;
		int hoogtestam = hoogtekruin * 2;
		
		g.setColor(bruin);
		g.fillRect(x1 + breedtestam, y1 + hoogtekruin, breedtestam, hoogtestam);
		g.setColor(Color.green);
		g.fillOval(x1, y1, breedtekruin, hoogtekruin);
	}
}