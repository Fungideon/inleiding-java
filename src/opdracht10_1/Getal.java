package opdracht10_1;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Getal extends Applet {
	int getalvlak, getaloud;
	TextField getal;
	
	public void init(){
		getalvlak = 0;
		getaloud = 0;
		getal = new TextField("");
		getal.addActionListener( new GetalListener() );
		add(getal);
	}
	
	public void paint(Graphics g){
		g.drawString("Hoogste Getal " + getaloud, 20, 50);
	}
	
	class GetalListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			getalvlak = Integer.parseInt(getal.getText());
			if (getalvlak > getaloud){
				getaloud = getalvlak;
				getal.setText("");
				repaint();
			}
			else{
				getal.setText("");
				repaint();
			}
		}
	}
}
