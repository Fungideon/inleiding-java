package hoofdstuk14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;

//Praktijkopdracht hoofdstuk 14
public class Smileys extends Applet {
	
	private Image afbeelding, end;
	TextField getalInput;
	Button speelButton, reset;
	int totaal;
	String computerTekst;
	
	public void init(){
		setSize(500, 500);
		totaal = 23;
		afbeelding = getImage(getCodeBase(), "hoofdstuk14/lenny.png");
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
		//tekent de smileys (lenny.png) op het scherm
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
			//computer is aan het winnen
			computerafneem = ((totaal-1)%4);
			totaal -= computerafneem;
		}
		else {
			//computer verliest
			computerafneem = (int)(Math.random()*3+1);
			totaal -= computerafneem;
		}
		computerTekst = "De computer heeft " + computerafneem + " afgenomen";
	}
	
	class actieListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int player = Integer.parseInt(getalInput.getText());
			//checkt voor geldige invoer
			if(player >= 1 && player <= 3){
				totaal -= player;
				//als het totaal < 1 is dan heb je verloren
				if(totaal < 1){
					computerTekst = "Je Hebt verloren, de computer wint";
					end = getImage(getCodeBase(), "hoofdstuk14/awesomeface.png"); 
				}
				else{
					//start de functie computerSet die de computerset berekend
				computerSet();
					if(totaal < 1){
						computerTekst = "De computer heeft verloren";
						end = getImage(getCodeBase(), "hoofdstuk14/smiley_sad.png");
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
			//reset alle parameters naar de default waarde
				totaal = 23;
				end = getImage(getCodeBase(), "");
				computerTekst = "Voer een Getal in";
				repaint();
			}
		}

}
