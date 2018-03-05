package MainPackage;

import java.awt.*;
import javax.swing.*;

public class Tegel{
	private int squareX = 50;
	private int squareY = 50;
	private int squareW = 20;
	private int squareH = 20;
	Coordinaat coor = new Coordinaat();
	public void Teken(JFrame f)
	{
		for(int i = 0; i < 9 ; i++){
        Canvas Tegel = new Canvas();
        Tegel.setBackground(Color.BLUE);
        if(i == 2)
        {
        	Tegel.setBackground(Color.BLACK);
        }
		f.add(Tegel);
		f.repaint();
		}
		  
	    f.setLayout(new GridLayout(3,3));  
	    //setting grid layout of 3 rows and 3 columns  
	  
	    f.setSize(300,300);  
	    f.setVisible(true);  
	}
}
