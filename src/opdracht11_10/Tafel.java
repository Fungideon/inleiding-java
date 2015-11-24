package opdracht11_10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tafel extends Applet {
	int teller;
	int totaal;
	int getal;
	Button ok;
	TextField cijfer;
	
	public void init(){
		setSize(400, 400);
		ok = new Button("ok");
		cijfer = new TextField("", 5);
		ok.addActionListener( new OkListener() );
		add(cijfer);
		add(ok);
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
			getal = Integer.parseInt(cijfer.getText());
            repaint();
		}
	}
}
