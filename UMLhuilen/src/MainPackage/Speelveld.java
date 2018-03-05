package MainPackage;


import java.awt.*;  
import javax.swing.*;  

public class Speelveld{
private static int rows;
private static int columns;
static JFrame f = new JFrame();  
public static void main(String[] args) {  
    new Speelveld();
    rows = 6;
    columns = 6;
    
    drawGrid(f);
    f.setSize((columns*52), (rows*52));
    f.setVisible(true);
}
public static void drawGrid(JFrame f)
{
	for(int i = 0;i < columns;i++){
	    Muur muurtje = new Muur();
	    muurtje.Teken(f,i,0);
	}
	
	for(int i = 1 ; i <= (rows-2);i++)
	{
	    Muur muurtje = new Muur();
	    muurtje.Teken(f,0,i);
	    for(int k = 1; k <= (columns-2);k++)
	    {
	    	Leeg leegtje = new Leeg();
	    	leegtje.Teken(f,i,k);
	    }
	    muurtje.Teken(f,(columns-1),i);
	}
	

}
}  
