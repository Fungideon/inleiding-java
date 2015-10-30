package opdracht12_6;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Waarde extends Applet {
	TextField tekst;
	Button ok;
	int rij[] = { 100, 200, 300, 400, 500, 100, 100, 200 };
	Boolean gevonden;
	int index;
	
	public void init(){
		setSize(500, 500);
		tekst = new TextField("", 5);
		tekst.addActionListener( new OkListener() );
		ok = new Button("OK");
		ok.addActionListener( new OkListener() );
		add(tekst);
		add(ok);
	}
	
	public void paint(Graphics g){
		if(gevonden == true){
			g.drawString("de waarde komt " + index + " keer voor", 20, 20);
		}
	}
	
	public class OkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			index = 0;
			int getal = Integer.parseInt(tekst.getText());
			int teller = 0;
			while(teller < rij.length) {
	            if(rij[teller] == getal) {
	                gevonden = true;
	                index ++;
	            }
	            teller ++;
	        }
		repaint();
		}
	}
}
