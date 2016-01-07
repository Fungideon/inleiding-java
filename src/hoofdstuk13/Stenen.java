package hoofdstuk13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//opdracht 13.4
public class Stenen extends Applet {
	Button beton, baksteen;
	boolean baksteenReturn, tekenenReturn;
	
	public void init(){
		setSize(700, 700);
		beton = new Button("Beton");
		beton.setBackground(Color.gray);
		beton.addActionListener( new BetonListener());
		add(beton);
		baksteen = new Button("Baksteen");
		baksteen.setBackground(Color.red);
		baksteen.addActionListener( new BaksteenListener());
		add(baksteen);
	}
	
	public void paint(Graphics g){
		tekenStenen(g, baksteenReturn, tekenenReturn);
	}
	
	void tekenStenen(Graphics g, boolean baksteen, boolean tekenen){
		int x;
		int y;
		int width;
		int height;
		x = 0;
		y = 0;
		width = 40;
		height = 20;
		
		if(tekenen){
			if(baksteen == true){
				g.setColor(Color.red);
				for(int columnBaksteen = 0; columnBaksteen < 10; columnBaksteen++){
					y += 20;
					if(columnBaksteen % 2 == 0){
						x = 0;
						for(int rijBaksteen = 0; rijBaksteen < 15; rijBaksteen++){
							x = x + 20;
							g.fillRect(x, y, width, height);
							x = x + height + 2;
						}
					}
					else{
						x = 10;
						for(int rijBaksteen = 0; rijBaksteen < 15; rijBaksteen++){
							x = x + 20;
							g.fillRect(x, y, width, height);
							x = x + height + 2;
						}
					}
					y += 2;
				}
			}
			else{
				width += 20;
				height += 20;
				g.setColor(Color.gray);

				for(int columnBeton = 0; columnBeton < 5; columnBeton++){
					y += 20;
					if(columnBeton % 2 == 0){
						x = 0;
						for(int rijBeton = 0; rijBeton < 10; rijBeton++){
							x = x + 20;
							g.fillRect(x, y, width, height);
							x = x + height + 5;
						}
						y =  y + 25;
					}
					else{
						x = 10;
						for(int rijBeton = 0; rijBeton < 10; rijBeton++){
							x = x + 20;
							g.fillRect(x, y, width, height);
							x = x + height + 5;
						}
						y = y + 25;
					}
				}
			}
		}
		else{}
	}
	class BetonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			baksteenReturn = false;
			tekenenReturn = true;
			repaint();
		}
	}
	class BaksteenListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			baksteenReturn = true;
			tekenenReturn = true;
			repaint();
		}
	}
}