package hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class VoldoendeGemiddelde extends Applet {
	TextField cijfer;
	Button add, ok;
	Label info;
	double cijfers, totaal;
	int teller;
	String voldoende, gemiddelde, geslaagd;
	
	public void init(){
		setSize(400,400);
		cijfer = new TextField("",3);
		add = new Button ("voeg toe");
		add.addActionListener( new AddListener() );
		ok = new Button ("OK");
		ok.addActionListener( new OkListener() );
		info = new Label ("Voer cijfer in");
		cijfers = 0;
		totaal = 0;
		teller = 0;
		add(info);
		add(cijfer);
		add(add);
		add(ok);
		voldoende = "";
		gemiddelde = "";
		geslaagd = "";
		
	}
	
	public void paint(Graphics g){
		g.drawString(voldoende, 20, 40);
		g.drawString(gemiddelde, 20, 55);
		g.drawString(geslaagd, 20, 70);
	}
	
	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			teller ++;
			if(Double.parseDouble(cijfer.getText()) < 5.5){
				voldoende = "Onvoldoende";
			}
			else{
				voldoende = "Voldoende";
			}
			totaal = totaal + (Double.parseDouble(cijfer.getText()));
			cijfer.setText("");
			repaint();
		}
	}
	
	class OkListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			voldoende = "";
			cijfers = totaal / teller;
			gemiddelde = "Gemiddelde : " + (String.format("%.1f", Double.valueOf(cijfers)));
			if(cijfers < 5.5){
				geslaagd = "Helaas, je bent gezakt";
			}
			else{
				geslaagd = "Hoera, je bent geslaagd";
			}
		repaint();
		}
	}
	
}