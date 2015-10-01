package h10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H103 extends Applet{
	Button knop;
	TextField tekstvak;
	Label label;
	String s, tekst;
	int dag;
	
	
	public void init(){
		knop = new Button("Ok");
		knop.addActionListener ( new KnopListener());
		tekstvak = new TextField("",10);
		label = new Label("Tik een maandnummer in");
		s = "";
		add(knop);
		add(tekstvak);
		add(label);
		
			
	}
	
	public void paint(Graphics g){
		g.drawString(tekst, 50, 60);
		
		
	}
	class KnopListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		s = tekstvak.getText();
    		dag = Integer.parseInt( s);
    		switch(dag) {
            case 1:
                tekst = "De maand Januari heeft 31 dagen";
                break;
            case 2:
                tekst = "De maand Februari heeft 28 dagen";
                break;
            case 3:
                tekst = "De maand Maart heeft 31 dagen";
                break;
            case 4:
                tekst = "De maand April heeft 30 dagen";
                break;
            case 5:
                tekst = "De maand Mei heeft 31 dagen";
                break;
            case 6:
                tekst = "De maand Juni heeft 30 dagen";
                break;
            case 7:
                tekst = "De maand Julie heeft 31 dagen";
                break;
            case 8:
                tekst = "De maand Augustus heeft 31 dagen";
                break;
            case 9:
                tekst = "De maand September heeft 30 dagen";
                break;
            case 10:
                tekst = "De maand Oktober heeft 31 dagen";
                break;
            case 11:
                tekst = "De maand November heeft 30 dagen";
                break;
            case 12:
                tekst = "De maand December heeft 31 dagen";
                break;
            default:
                tekst = "Er zijn maar 12 maanden in het jaar.";
                break;
    			
    		}
    		repaint();
    	}
	}
}