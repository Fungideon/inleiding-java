package opdracht10_6;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Voldoende extends Applet {
	TextField cijfer;
	Label info;
	int cijfers;
	String schermtekst;
	Button ok;
	
	public void init(){
		setSize(400, 400);
		info = new Label ("Voer je cijfer in");
		cijfer = new TextField("", 2);
		ok = new Button("OK");
		ok.addActionListener( new OkListener() );
		add(info);
		add(cijfer);
		add(ok);
		schermtekst = "";
		cijfers = 0;
	}
	
	public void paint(Graphics g){
		g.drawString(schermtekst, 50, 50);
	}
	
	class OkListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(Integer.parseInt(cijfer.getText()) < 0 || Integer.parseInt(cijfer.getText()) > 10 ){
				schermtekst = "Voer een geldig getal in tussen de 1 en de 10";
			}
			else {
				switch(Integer.parseInt(cijfer.getText())){
				case 1:
					schermtekst = "Slecht";
					break;
				case 2:
					schermtekst = "Slecht";
					break;
				case 3:
					schermtekst = "Slecht";
					break;
				case 4:
					schermtekst = "Onvoldoende";
					break;
				case 5:
					schermtekst = "Matig";
					break;
				case 6:
					schermtekst = "Voldoende";
					break;
				case 7:
					schermtekst = "Voldoende";
					break;
				case 8:
					schermtekst = "Goed";
					break;
				case 9:
					schermtekst = "Goed";
					break;
				case 10:
					schermtekst = "Goed";
					break;
				}
			}
		repaint();
		}
	}
}