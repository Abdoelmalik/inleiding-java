package h08;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H81 extends Applet{
	double getal;
	Button knop;
	double btw;
	TextField tekstvak;
	Label label;
	String s;
	String a;
	
	
	
	public void init(){
		knop = new Button("ok");
		tekstvak = new TextField("", 20);
        label = new Label("Type een bedrag");
        tekstvak.addActionListener( new knopListener() );
        knop.addActionListener( new knopListener() );
		add(knop);
		add(label);
		add(tekstvak);
		a="";
		
		
		
	}
	
	public void paint(Graphics g){
		g.drawString(s + btw, 20, 40);
		
		
	}
    class knopListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		String s = tekstvak.getText();
    		btw = getal * 1.21;
    		getal = Double.parseDouble( s );
    		repaint();
    	}
    }
}
