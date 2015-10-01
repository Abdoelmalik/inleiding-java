package h06;

import java.applet.Applet;
import java.awt.Graphics;

public class PraktijkopdrachtH6 extends Applet {
	double getal1;
	double getal2;
	double getal3;
	double gemiddelde;
	double geheel1;
	double uitkomst;
	int geheel;
		

	public void init() {
		getal1 = 5.9;
		getal2 = 6.3;
		getal3 = 6.9;
		gemiddelde = (getal1 + getal2 + getal3) / 3;
		geheel1 = gemiddelde * 100;
		geheel = (int) geheel1;
		uitkomst = (double) geheel / 100;
		
		
		
		
		
		
	}
	
	public void paint (Graphics g) {
		g.drawString(" de uitkomst is " + uitkomst, 20, 20);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
