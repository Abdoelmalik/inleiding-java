package h08;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H82 extends Applet{
	Button knop1;
	Button knop2;
	Button knop3;
	Button knop4;
	int Mannen;
	int Mannenlijk;
	int Vrouw;
	int Vrouwelijk;
	int Totaal;

	
	
	
	public void init(){
		knop1 = new Button("Mannen");
		knop1.addActionListener ( new Knop1Listener());
		knop2 = new Button("Mannenlijk");
		knop2.addActionListener ( new Knop2Listener());
		knop3 = new Button("Vrouw");
		knop3.addActionListener ( new Knop3Listener());
		knop4 = new Button("Vrouwelijk");
		knop4.addActionListener ( new Knop4Listener());
		int Totaal = 0;
		add(knop1);
		add(knop2);
		add(knop3);
		add(knop4);

				
		
	}
	
	public void paint(Graphics g){
		g.drawString("Mannen  " + Mannen, 670, 50);
		g.drawString("Mannelijk  " + Mannenlijk , 670, 70);
		g.drawString("Vrouw  " + Vrouw, 670, 90);
		g.drawString("Vrouwelijk  " + Vrouwelijk, 670, 110);
		g.drawString("Totaal=" + Totaal , 670, 130);
		
	}
	
    class Knop1Listener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		Mannenlijk++;
    		Mannen++;
    		Totaal++;
    		repaint();
    		
    	}
    }
    class Knop2Listener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		Mannenlijk++;
    		Totaal++;
    		repaint();
    	}
    }
    class Knop3Listener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		Vrouwelijk++;
    		Vrouw++;
    		Totaal++;
    		repaint();
    	}
    }
    class Knop4Listener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		Vrouwelijk++;
    		Totaal++;
    		repaint();
    	}
    }

        
}

