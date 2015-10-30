package opdracht12_2;

import java.awt.*;
import java.applet.*;

public class Knop extends Applet {
	Button buttons[];
	
	public void init(){
		buttons = new Button[25];
		for(int teller = 0; teller < buttons.length; teller ++){
			buttons[teller] = new Button("Top Kek m8");
			add(buttons[teller]);
		}
	}
	
	public void paint(Graphics g){
		
	}
}