package hoofdstuk10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GetalLaagsteHoogste extends Applet {
	int getalvlak, getalhoog, getallaag;
	TextField getal;
	
	public void init(){
		getalvlak = 0;
		getalhoog = 0;
		getallaag = 0;
		getal = new TextField("");
		getal.addActionListener( new GetalListener() );
		add(getal);
	}
	
	public void paint(Graphics g){
		g.drawString("Hoogste Getal " + getalhoog, 20, 50);
		g.drawString("Laagste Getal " + getallaag, 20, 70);
	}
	
	class GetalListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			getalvlak = Integer.parseInt(getal.getText());
			if (getalvlak > getalhoog){
				getalhoog = getalvlak;
				getal.setText("");
			}
			else{
				if (getallaag > getalvlak){
					getallaag = getalvlak;
					getal.setText("");
				}
			getal.setText("");
			}
		repaint();
		}
	}
}
