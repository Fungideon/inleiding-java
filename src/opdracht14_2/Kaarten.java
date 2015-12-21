package opdracht14_2;

import java.applet.*;
import java.awt.*;
import java.util.Random;

public class Kaarten extends Applet {
	String[] kleuren = { "Klaver", "Ruiten", "Schoppen", "Harten" };
	String[] kaarten = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "koning", "aas" };
	String[] deck = new String[52];
	String[] player1 = new String[13];
	String[] player2 = new String[13];
	String[] player3 = new String[13];
	String[] player4 = new String[13];
	
	public void init(){
		setSize(800, 800);
		int index = 0;
		
		for(int i = 0; i < kleuren.length; i++){
			String kleur = kleuren[i];
			for(int j = 0; j < kaarten.length; j++){
				String kaart = kaarten[j];
				deck[index] = kleur + " " + kaart;
				index++;
			}
			
		}
		for(int i = 0; i < 13; i++){
			player1[i] = deelKaart();
			player2[i] = deelKaart();
			player3[i] = deelKaart();
			player4[i] = deelKaart();
		}
		
	}
	
	public void paint(Graphics g){
		int x1= 50;
		int x2= 250;
		int x3= 450;
		int x4= 650;
		int y = 70;
		
		g.drawString("Speler 1", x1, y);
		g.drawString("Speler 2", x2, y);
		g.drawString("Speler 3", x3, y);
		g.drawString("Speler 4", x4, y);
		y = 100;
		for(int i = 0; i < 13; i++){
			g.drawString(player1[i], x1, y);
			g.drawString(player2[i], x2, y);
			g.drawString(player3[i], x3, y);
			g.drawString(player4[i], x4, y);
			y += 20;
		}
		
		
		
	}
	
	String deelKaart() {
		int random = new Random().nextInt(deck.length);
		String kaart = deck[random];
		String[] hulplijst = new String[deck.length -1];
		int hulpindex = 0;
		for(int i = 0; i < deck.length; i++){
			if( i != random){
				hulplijst[hulpindex] = deck[i];
				hulpindex++;
			}
		}
		deck = hulplijst;
		return kaart;
	}

}
