package h06;

import java.applet.Applet;
import java.awt.Graphics;

public class H61 extends Applet{

	double getal;
	double getal1;
	double uitkomst;

	public void init()	{
		getal = 113;
		getal1 = 4;
		uitkomst = (getal / getal1);

	}	
		
		
	public void paint(Graphics g) {
		g.drawString (" Jan krijgt € " +  uitkomst, 20, 20);
		g.drawString (" Ali krijgt € " + uitkomst, 20, 40);
		g.drawString (" jeanette krijgt € " + uitkomst ,20, 60);
		g.drawString (" ik krijg € " +  uitkomst, 20, 80);
			
	
			
			
			
			
			
		}
}