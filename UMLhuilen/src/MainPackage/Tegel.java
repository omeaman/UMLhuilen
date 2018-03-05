package MainPackage;

import java.awt.*;
import javax.swing.*;

public class Tegel{
	Color kleurtje;
	public void Teken(JFrame f)
	{
        Canvas Tegel = new Canvas();
        Tegel.setBackground(Color.BLUE);
        
		f.add(Tegel);
		f.repaint();
		
		  
	    f.setLayout(new GridLayout(3,3));  
	    //setting grid layout of 3 rows and 3 columns  
	  
	    f.setSize(300,300);  
	    f.setVisible(true);  
	}
}
