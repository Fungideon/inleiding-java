package opdracht12_3;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sorteer extends Applet {
	Double getallen[];
	TextField tekst[];
	String schermtekst[];
	Button ok;
	
	public void init(){
		setSize(500, 500);
		tekst = new TextField[5];
		getallen = new Double[5];
		for(int teller = 0; teller < tekst.length; teller ++){
			tekst[teller] = new TextField("", 5);
			add(tekst[teller]);
		}
		ok = new Button("OK");
		ok.addActionListener( new ButtonListener() );
		add(ok);
	}
	
	public void paint(Graphics g){
		for(int teller = 0; teller < tekst.length; teller ++){
			g.drawString("" + getallen[teller] , 20, 20 * teller + 20);
		}
	}
	
	public class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			for(int teller = 0; teller < tekst.length; teller ++){
				getallen[teller] = Double.parseDouble(tekst[teller].getText());
			}
		repaint();
		}
	}
}
