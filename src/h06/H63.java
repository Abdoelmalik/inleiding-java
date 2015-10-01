package h06;

import java.applet.Applet;
import java.awt.Graphics;

public class H63 extends Applet {
	int teller;
	int teller1;
	
	public void init() {
		teller = 100;
		teller1 = 100;
		
		
		
	}
	
	public void paint(Graphics g) {
		g.drawString(" uitkomst is: " + -(teller + teller1), 20, 20);
		
		
	}
	
	
	
	
}
