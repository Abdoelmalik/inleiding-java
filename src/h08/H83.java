package h08;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H83 extends Applet{
	TextField tekstvak;
	Label label;
	Button knop1;
	Button knop2;
	String s;
	
	
	public void init(){
		tekstvak = new TextField();
		tekstvak.addActionListener( new TekstvakListener ());
		label = new Label("Type een getal in");
		knop1 = new Button("OK");
		knop1.addActionListener( new Knop1Listener ());
		knop2 = new Button("Reset");
		knop2.addActionListener( new Knop2Listener ());
		add(tekstvak);
		add(label);
		add(knop1);
		add(knop2);
		s = "";
		
		
	}
	
	public void paint(Graphics g){
		g.drawString(s, 20, 20);
		
	}
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	s = tekstvak.getText();
        	repaint();

        }
    }
    class Knop1Listener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		s = tekstvak.getText();
    		repaint();
    		
    	}
    }
    class Knop2Listener implements ActionListener {
    	public void actionPerformed(ActionEvent e){
    		tekstvak.setText("");
    		s="";
    		repaint();
    	}
    }
    
}
    
    
    
    
