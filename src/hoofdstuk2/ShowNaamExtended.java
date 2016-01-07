package hoofdstuk2;

import java.awt.*;
import java.applet.*;

public class ShowNaamExtended extends Applet {

  public void init() {
	  setBackground(Color.white);
  }
  
  public void paint(Graphics g) {
	g.setColor(Color.blue);
    g.drawString("Timo", 50, 50 );
    g.setColor(Color.RED);
    g.drawString("Moederzoon", 50, 60);
  }

}