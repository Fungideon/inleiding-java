package opdracht13_1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KnoppenKleur extends Applet {
	Button knop[];
	Color[] kleur = { Color.red, Color.blue, Color.magenta, Color.green, Color.yellow};
	String[] kleuren = { "rood", "blauw", "magenta", "groen", "geel"};
	String text;
	
	public void init(){
		text = "";
		setSize(500, 500);
		knop = new Button[kleur.length];
		knoppen();
	}
	
	public void paint(Graphics g){
		g.drawString("" + text, 50, 50);
	}
	
	void knoppen(){
		for(int teller = 0; teller < kleur.length; teller++){
			knop[teller] = new Button();
			knop[teller].setBackground(kleur[teller]);
			knop[teller].setLabel("" + kleuren[teller]);
			knop[teller].addActionListener( new ButtonHandler());
			add(knop[teller]);
		}
	}
		
	class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Button src = (Button)e.getSource();
			text = src.getLabel();
			repaint();
		}
	}
}
