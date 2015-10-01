package h10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H105 extends Applet{
	Button knop;
	TextField tekstvak;
	Label label;
	double getal;
	double gemiddelde;
	double som, aantal;
	String tekst, s;
	
	
	
	public void init(){
		setSize(400,400);
		knop = new Button("Ok");
		knop.addActionListener ( new KnopListener());
		tekstvak = new TextField("", 20);
		label = new Label("Tik een cijfer in");
		som = 0;
		aantal = 0;
		s = "";
		add(knop);
		add(tekstvak);
		add(label);
		
				
		
	}
	
	public void paint(Graphics g){
		g.drawString("" + tekst, 20, 40);
		g.drawString("Het gemiddelde is " + (som / aantal), 20, 60);
		
		
	}

    class KnopListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		s = tekstvak.getText();
    		tekstvak.setText("");
    		getal = Double.parseDouble(s);
    		som += getal;
    		aantal ++;
    		if ( getal >= 5.5 ) {
    		    tekst = "U heeft een Voldoende.";
    		  
    		}
    		else    			
    			 tekst = "U heeft een Onvoldoende.";
    		
    			if ( getal > 10 || getal < 0) {
    				tekst = "Foute invoer";
    				
    			}
    		repaint();
    	  	}
   }
}

