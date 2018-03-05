package MainPackage;

import java.awt.*;
import javax.swing.*;  
import java.util.*;

public class Speelveld{
static int rows = 6;
static int columns = 7;
static JFrame f = new JFrame();
static Doel doeltje = new Doel();
static Tegel[][] tegelSave = new Tegel[columns][rows];
public static void main(String[] args) {  
    drawGrid(f);

    f.setVisible(true);
    f.setSize((columns*55), (rows*55));
    
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
	    tegelSave[i][0] = muurtje;
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
	    	}else {
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
	    tegelSave[i][0] = doeltje;

	}

    Canvas Tegels = new Canvas();							//Beunhaas oplossing voor het grote button probleem.
    Tegels.setSize(0, 0);
	f.add(Tegels);
}
public void searchTileTypeByLocation(int row, int column)
{
	for(int i = 0; i< columns;i++){
		for(int k = 0; k < row;k++)
		{
			if(tegelSave[i][k].getType)						//TODO Hier ken je tegel type vinden
			{
				
			}
		}
	}

}
}