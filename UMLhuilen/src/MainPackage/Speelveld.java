package MainPackage;

import java.awt.*;
import javax.swing.*;  
import java.util.*;
import java.awt.event.*;

public class Speelveld{
static int rows = 10;
static int columns = 10;
private static double rdmrow = Math.random();
private static double rdmcolumn = Math.random();
private static int moveVertical;
private static int moveHorizontal;
static JFrame f = new JFrame();
static JPanel p = new JPanel();
static Doel doeltje = new Doel();
static Speler spelertje = new Speler();
static Tegel[][] tegelSave = new Tegel[columns][rows];
public static void main(String[] args) {  
	genereerDoelLocatie();
	genereerSpelerLocatie();
	
	 f.getContentPane().add(p);
	
	drawGrid(f);
    
    f.setVisible(true);
    f.setSize((columns*55), (rows*55));
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    p.addKeyListener(new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {
            checkKey(e);
        }
    });
    
	p.setFocusable(true);
    p.requestFocusInWindow();
}


public static void checkKey(KeyEvent e) {
	int code = e.getKeyCode();
	if(code == 38) {
		moveHorizontal = 0;
		moveVertical = -1;
		spelertje.beweeg(f,moveHorizontal, moveVertical,tegelSave);
	}
	if(code == 40) {
		moveHorizontal = 0;
		moveVertical = 1;
		spelertje.beweeg(f,moveHorizontal, moveVertical,tegelSave);
	}
	if(code == 37) {
		moveHorizontal = -1;
		moveVertical = 0;
		spelertje.beweeg(f,moveHorizontal, moveVertical,tegelSave);
	}
	if(code == 39) {
		moveHorizontal = 1;
		moveVertical = 0;
		spelertje.beweeg(f,moveHorizontal, moveVertical,tegelSave);
	}
}

public static void drawGrid(JFrame f)
{
	spelertje.Teken(f,(spelertje.playercolumn),(spelertje.playerrow));
	for(int i = 0;i < columns;i++){
	    Muur muurtje = new Muur();
	    muurtje.Teken(f,i,0);
	}

	for(int i = 0 ; i < (rows-2);i++)
	{
	    Muur muurtje = new Muur();
	    muurtje.Teken(f,0,(i+1));
	    for(int k = 0; k < (columns-2);k++)
	    {
	    	if(i == rdmrow-1 && k == rdmcolumn-1) {
	    		doeltje.Teken(f,(k+1),(i+1));
		    	tegelSave[i][k] = doeltje;
	    	}else if(i == spelertje.playerrow-1 && k == spelertje.playercolumn-1){
	    		
	    		Leeg leegtje = new Leeg();
		    	leegtje.Teken(f,(k+1),(i+1));
		    	tegelSave[i][k] = leegtje;
	    	}else{
	    		Leeg leegtje = new Leeg();
		    	leegtje.Teken(f,(k+1),(i+1));
		    	tegelSave[i][k] = leegtje;
	    	}
	    }
	    muurtje.Teken(f,(columns-1),(i+1));
	}
	
	for(int i = 0;i < columns;i++){
	    Muur muurtje = new Muur();
	    muurtje.Teken(f,i,(rows-1));

	}

    Canvas Tegels = new Canvas();							//Beunhaas oplossing voor het grote button probleem.
    Tegels.setSize(0, 0);
	f.add(Tegels);
}
public static void genereerDoelLocatie() {
	rdmrow = (rdmrow*(rows-3))+1;
	rdmcolumn = (rdmcolumn*(columns-3))+1;
	rdmrow = Math.round(rdmrow);
	rdmcolumn = Math.round(rdmcolumn);
}
private static void genereerSpelerLocatie() {
	if(rdmrow <= (rows-2)/2) {
		spelertje.playerrow = rows-2;
	}else {
		spelertje.playerrow = 1;
	}
	
	if(rdmcolumn <= (rows-2)/2) {
		spelertje.playercolumn = columns-2;
	}else {
		spelertje.playercolumn = 1;
	}
}
}