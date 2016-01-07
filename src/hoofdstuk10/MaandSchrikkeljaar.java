package hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MaandSchrikkeljaar extends Applet {
	Label info;
	TextField maand, jaar;
	String maandnaam, dag;
	Button ok;
	int jaartal;
	
	public void init(){
		setSize(400,400);
		info = new Label("Voor de nummer van de maand in");
		maand = new TextField("", 5);
		jaar = new TextField ("", 5);
		ok = new Button("OK");
		ok.addActionListener( new OkListener() );
		add(info);
		add(maand);
		add(jaar);
		add(ok);
		maandnaam = "";
		dag = "";
		
	}
	
	public void paint(Graphics g){
		g.drawString(maandnaam, 20, 40);
		g.drawString(dag, 20, 55);
	}
	
	class OkListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			jaartal = Integer.parseInt(jaar.getText());
			if( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0 ) {
				switch(Integer.parseInt(maand.getText())){
				case 1:
					maandnaam = "Maand : Januari";
					dag = "Dagen : 31";
					break;
				case 2:
					maandnaam = "Maand : Febrauri";
					dag = "Dagen : 29";
					break;
				case 3:
					maandnaam = "Maand : Maart";
					dag = "Dagen : 31";
					break;
				case 4:
					maandnaam = "Maand : April";
					dag = "Dagen : 30";
					break;
				case 5:
					maandnaam = "Maand : Mei";
					dag = "Dagen : 31";
					break;
				case 6:
					maandnaam = "Maand : Juni";
					dag = "Dagen : 30";
					break;
				case 7:
					maandnaam = "Maand : Juli";
					dag = "Dagen : 31";
					break;
				case 8:
					maandnaam = "Maand : Augustus";
					dag = "Dagen : 31";
					break;
				case 9:
					maandnaam = "Maand : September";
					dag = "Dagen : 30";
					break;
				case 10:
					maandnaam = "Maand : Oktober";
					dag = "Dagen : 31";
					break;
				case 11:
					maandnaam = "Maand : November";
					dag = "Dagen : 30";
					break;
				case 12:
					maandnaam = "Maand : December";
					dag = "Dagen : 31";
					break;
				}
			}
			else{
				switch(Integer.parseInt(maand.getText())){
				case 1:
					maandnaam = "Maand : Januari";
					dag = "Dagen : 31";
					break;
				case 2:
					maandnaam = "Maand : Febrauri";
					dag = "Dagen : 28";
					break;
				case 3:
					maandnaam = "Maand : Maart";
					dag = "Dagen : 31";
					break;
				case 4:
					maandnaam = "Maand : April";
					dag = "Dagen : 30";
					break;
				case 5:
					maandnaam = "Maand : Mei";
					dag = "Dagen : 31";
					break;
				case 6:
					maandnaam = "Maand : Juni";
					dag = "Dagen : 30";
					break;
				case 7:
					maandnaam = "Maand : Juli";
					dag = "Dagen : 31";
					break;
				case 8:
					maandnaam = "Maand : Augustus";
					dag = "Dagen : 31";
					break;
				case 9:
					maandnaam = "Maand : September";
					dag = "Dagen : 30";
					break;
				case 10:
					maandnaam = "Maand : Oktober";
					dag = "Dagen : 31";
					break;
				case 11:
					maandnaam = "Maand : November";
					dag = "Dagen : 30";
					break;
				case 12:
					maandnaam = "Maand : December";
					dag = "Dagen : 31";
					break;
				}
			}
		repaint();
		}
	}
}
