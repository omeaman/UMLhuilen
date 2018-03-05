package MainPackage;


import java.awt.*;  
import javax.swing.*;  

public class Speelveld{
private static int rows;
private static int columns;
static JFrame f = new JFrame();
static Doel doeltje = new Doel();
public static void main(String[] args) {  
    new Speelveld();
    rows = 6;
    columns = 6;
    
    drawGrid(f);
    f.setSize((columns*55), (rows*55));
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void drawGrid(JFrame f)
{
	double rdmrow = Math.random();
	double rdmcolumn = Math.random();
	rdmrow = (rdmrow*(rows-3))+1;
	rdmcolumn = (rdmcolumn*(columns-3))+1;
	rdmrow = Math.round(rdmrow);
	rdmcolumn = Math.round(rdmcolumn);
	
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
		    	
		    	doeltje.Teken(f,(i+1),(k+1));
	    	}else {
		    	Leeg leegtje = new Leeg();
		    	leegtje.Teken(f,(i+1),(k+1));
	    	}
	    }
	    muurtje.Teken(f,(columns-1),(i+1));
	}
	
	for(int i = 0;i < columns;i++){
	    Muur muurtje = new Muur();
	    muurtje.Teken(f,i,0);
	}
}
}