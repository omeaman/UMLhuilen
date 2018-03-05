package MainPackage;


import java.awt.*;  
import javax.swing.*;  

public class Speelveld{
private static int rows;
private static int columns;
static JFrame f;  
Speelveld(){  
f=new JFrame();
f.setSize(300, 400);
f.setVisible(true);
f.repaint();    
}
public static void main(String[] args) {  
    new Speelveld();
    rows = 3;
    columns = 3;
    drawGrid(f);
    f.setLayout(new GridLayout(3,3));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}
public static void drawGrid(JFrame f)
{
	for(int i = 0;i < rows;i++){
	    Muur muurtje = new Muur();
	    muurtje.Teken(f);
	}
	for(int i = 0 ; i < columns;i++)
	{
	    Muur muurtje = new Muur();
	    muurtje.Teken(f);
	    for(int k = 0; k < (columns - 2);k++)
	    {
	    	Leeg leegtje = new Leeg();
	    	leegtje.Teken(f);
	    }
	}

}
}  
