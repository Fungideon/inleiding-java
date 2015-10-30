package opdracht12_5;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends Applet {
	TextField tekst;
	Button ok;
	int rij[] = { 100, 200, 300, 400, 500 };
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
			g.drawString("de waarde " + rij[index] + " is gevonden op " + index, 20, 20);
		}
		else{
			g.drawString("de waarde is niet gevonden", 20, 20);
		}
	}
	
	public class OkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			gevonden = false;
			int getal = Integer.parseInt(tekst.getText());
			int teller = 0;
			while(teller < rij.length) {
	            if(rij[teller] == getal) {
	                gevonden = true;
	                index = teller;
	            }
	            teller ++;
	        }
		repaint();
		}
	}
}
