package h10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class H102 extends Applet{
	int getal1;
	int getal2;
	Button knop;
	TextField tekstvak;
	String s = "Tik een getal in";
	
	public void init(){
		knop = new Button("Ok");
		knop.addActionListener ( new KnopListener ());
		tekstvak = new TextField("", 20);
		getal2 = Integer.MAX_VALUE;
		add(knop);
		add(tekstvak);
		
	}
	
	public void paint(Graphics g){
		g.drawString ("" + s, 20,80);
		
	}
	
    class KnopListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    			getal1 = Integer.parseInt(tekstvak.getText());
    			
				if ( getal1 < getal2 ) 
					{
						getal2 = getal1;
						s = tekstvak.getText();
						
					}
				
				
				
				repaint();
								
				}
    		
    		
    	}
    }
