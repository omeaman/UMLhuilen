package MainPackage;

import java.awt.*;
import javax.swing.*;

public class Tegel{
	public Color kleurtje;
	
	public void Teken(JFrame f,int x, int y)
	{
        Canvas Tegels = new Canvas();
        Tegels.setSize(50, 50);
        Tegels.setBackground(kleurtje);
        Tegels.setLocation((x*50), (y*50));
        Coordinaat coor = new Coordinaat();
        coor.setColumn(y);
        coor.setRij(x);
		f.add(Tegels);
	}
}
