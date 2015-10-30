package opdracht12_7;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adresboek extends Applet {
	TextField naam, telefoon;
	Label naamn, telefoonn;
	Button ok;
	int gevuld;
	String namen[];
	String telefoons[];

	
	public void init(){
		setSize(500, 500);
		gevuld = 0;
		namen = new String[10];
		telefoons = new String[10];
		setSize(500, 500);
		naam = new TextField("", 20);
		telefoon = new TextField("", 20);
		ok = new Button("OK");
		ok.addActionListener( new OkListener() );
		naamn = new Label("Naam");
		telefoonn = new Label("Telefoon");
		add(naamn);
		add(naam);
		add(telefoonn);
		add(telefoon);
		add(ok);
	}
	
	public void paint(Graphics g){
		if(gevuld == namen.length){
			for(int teller = 0; teller < namen.length; teller ++){
				g.drawString("Naam : " + namen[teller] + "  Telefoon Nummer : " + telefoons[teller], 20, 20 * teller + 40);
			}
		}
	}
	
	class OkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			namen[gevuld] = naam.getText();
		    telefoons[gevuld] = telefoon.getText();
		    telefoon.setText("");
		    naam.setText("");
		    gevuld ++;
		    if(gevuld == namen.length){
		    	repaint();
		    }
			
		}
	}
}