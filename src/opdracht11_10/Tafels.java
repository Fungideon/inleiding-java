package opdracht11_10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tafels extends Applet {
	int teller;
	int totaal;
	int getal;
	Button ok;
	Label info;
	
	public void init(){
		setSize(400, 400);
		ok = new Button("ok");
		ok.addActionListener( new OkListener() );
		info = new Label("Druk voor de volgende tafel");
		add(info);
		add(ok);
		getal = 1;
	}
	
	public void paint(Graphics g){
		int y = 20;
        for( teller = 1; teller <= 10; teller ++){
        	totaal = getal * teller;
        	g.drawString(teller + " x " + getal + " = " + totaal, 10, y);
        	y += 20;

        }	
	}
	
	class OkListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			getal ++;
			if(getal > 10){
				getal = 1;
			}
            repaint();
		}
	}
}
