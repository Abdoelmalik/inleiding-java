package h08;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkopdrachtH8 extends Applet{
	double getal1;
	double getal2;
	double antwoord;
	TextField tekstvak;
	TextField tekstvak1;
	Button PlusKnop;
	Button MinKnop;
	Button KeerKnop;
	Button Deel;
	String s;
	
	

	public void init() {

		 tekstvak = new TextField("", 20);
		 tekstvak1 = new TextField("", 20);
		 PlusKnop = new Button("+");
		 PlusKnop.addActionListener ( new PlusListener());
		 MinKnop = new Button("-");
		 MinKnop.addActionListener ( new MinListener());
		 KeerKnop = new Button("*");
		 KeerKnop.addActionListener ( new KeerListener());
		 Deel = new Button("/");
		 Deel.addActionListener ( new DeelListener());
		 add(PlusKnop);
		 add(MinKnop);
		 add(KeerKnop);
		 add(Deel);
		 add(tekstvak);
		 add(tekstvak1);
		 s ="";
	
						
	}
	
	public void paint(Graphics g){
		
		
	}
	
		
    class PlusListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		String s = tekstvak.getText();
    		getal1 = Double.parseDouble( s );
    		String a = tekstvak1.getText();
    		getal2 = Double.parseDouble( a );
    		antwoord = getal1 + getal2;
			tekstvak.setText("" + antwoord);
			tekstvak1.setText("");
    		
    		
    		
    		repaint();
    	}
    }
    class MinListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
        	String s = tekstvak.getText();
        	getal1 = Double.parseDouble( s );
        	String a = tekstvak1.getText();
        	getal2 = Double.parseDouble( a );
        	antwoord = getal1 - getal2;
        	tekstvak.setText(""+ antwoord);
        	tekstvak1.setText("");
            repaint();
            
    		
    		
    		repaint();
    	}
    }
	class KeerListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
			String s = tekstvak.getText();
			getal1 = Double.parseDouble( s );
			String a = tekstvak1.getText();
			getal2 = Double.parseDouble( a );
			antwoord = getal1 * getal2;
			tekstvak.setText("" + antwoord);
			tekstvak1.setText("");
			
			
		
			repaint();
		}
	}		
	class DeelListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
			String s = tekstvak.getText();
			getal1 = Double.parseDouble( s );
			String a = tekstvak1.getText();
			getal2 = Double.parseDouble( a );
			antwoord = getal1 / getal2;
			tekstvak.setText("" + antwoord);
			tekstvak1.setText("");
			
			
			repaint();
	
	
		}
	}
	
	
	
	
}



