package opdracht2_1;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

  public void init() {
	  setBackground(Color.blue);
  }
  
  public void paint(Graphics g) {
	g.setColor(Color.yellow);
    g.drawString("Timo Moederzoon", 50, 50 );
  }

}