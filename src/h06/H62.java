package h06;

import java.applet.Applet;
import java.awt.Graphics;

public class H62 extends Applet {
	int seconden;
	int minuut;
	int uur;
	int dag;
	int jaar;
	
	public void init() {
		seconden = 1;
		minuut = seconden * 60;
		uur = minuut * 60;
		dag = uur * 24;
		jaar = dag * 365;
		
		
		
	
	}
	public void paint(Graphics g) {
		g.drawString (" seconde " + seconden + " seconde ", 20, 20);
		g.drawString (" in een minuut zitten: " + minuut + " seconde ", 20, 40);
		g.drawString (" in een uur zitten: " + uur + " seconde ",20, 60);
		g.drawString (" in een dag zitten: " + dag + " seconde ", 20, 80);
		g.drawString (" in een jaar zitten: " + jaar + " seconde ", 20, 100);
		
		
		
	}
	

}
 
