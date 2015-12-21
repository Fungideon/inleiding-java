package opdracht14_3;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;

public class Smileys extends Applet {
	
	private Image afbeelding, end;
	TextField getalInput;
	Button speelButton, reset;
	int totaal;
	String computerTekst;
	
	public void init(){
		setSize(500, 500);
		totaal = 23;
		afbeelding = getImage(getCodeBase(), "opdracht14_3/lenny.png");
		end = getImage(getCodeBase(), "");
		computerTekst = "Voer een Getal in";
		
		getalInput = new TextField("", 5);
		speelButton = new Button("Speel");
		speelButton.addActionListener(new actieListener());
		getalInput.addActionListener(new actieListener());
		add(getalInput);
		add(speelButton);
		reset = new Button("Nieuw Spel?");
		reset.addActionListener(new resetListener());
		add(reset);
	}
	
	public void paint(Graphics g){
		int x = 50;
		int y = 50;
		g.drawString(computerTekst, 30, 40);
		for(int teller = 0; teller < totaal; teller++){
			g.drawImage(afbeelding, x, y, 60, 60, this);
			x += 70;
			if(x >= 280){
				y += 70;
				x = 50;
			}
		}
		g.drawImage(end, x, y, 200, 200, this);
	}
	
	void computerSet(){
		int computerafneem = 0;
		if((totaal -1) %4 != 0){
			computerafneem = ((totaal-1)%4);
			totaal -= computerafneem;
		}
		else {
			computerafneem = (int)(Math.random()*3+1);
			totaal -= computerafneem;
		}
		computerTekst = "De computer heeft " + computerafneem + " afgenomen";
	}
	
	class actieListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int player = Integer.parseInt(getalInput.getText());
			if(player >= 1 && player <= 3){
				totaal -= player;
				if(totaal < 1){
					computerTekst = "Je Hebt verloren, de computer wint";
					end = getImage(getCodeBase(), "opdracht14_3/awesomeface.png"); 
					getalInput.setEnabled(false);
					speelButton.setEnabled(false);
				}
				else{
				computerSet();
					if(totaal < 1){
						computerTekst = "De computer heeft verloren";
						end = getImage(getCodeBase(), "opdracht14_3/smiley_sad.png");
						add(reset);
						getalInput.setEnabled(false);
						speelButton.setEnabled(false);
					}
				}
			}
			else{
				computerTekst = "Voer een Geldige invoer in";
			}
			getalInput.setText("");
			repaint();
		}
	}
	class resetListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				totaal = 23;
				end = getImage(getCodeBase(), "");
				getalInput.setEnabled(true);
				speelButton.setEnabled(true);
				repaint();
			}
		}

}
