package opdracht8_3;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Btw extends Applet {
	TextField tekstvlak;
	Button ok;
	double totaal;
	Label label;
	
	public void init(){
		setSize(500, 100);
		tekstvlak = new TextField("", 10);
		label = new Label("Schrijf hier het bedrag in");
		ok = new Button("OK");
		ok.addActionListener( new OkListener() );
		tekstvlak.addActionListener( new TekstvlakListener() );
		add(label);
		add(tekstvlak);
		add(ok);
		totaal = 0;
	}
	
	public void paint(Graphics g){
		g.drawString("Totaal bedrag met BTW(19%) : €" + totaal, 20, 60);
	}
	
	class OkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			totaal = Double.parseDouble(tekstvlak.getText());
			totaal = totaal / 100 * 19 + totaal;
			repaint();
		}
	}
	
	class TekstvlakListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			totaal = Double.parseDouble(tekstvlak.getText());
			totaal = totaal / 100 * 19 + totaal;
			repaint();
		}
	}
	
}
