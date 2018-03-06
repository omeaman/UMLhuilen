package MainPackage;

import java.awt.*;
import javax.swing.*;

public class Tegel{
	public Color kleurtje;
    Coordinaat coor = new Coordinaat();
	public void Teken(JFrame f,int x, int y)
	{
	    System.out.println("x" + x + "y" + y);
        JButton Tegels = new JButton();
        Tegels.setSize(50, 50);

        Tegels.setBackground(kleurtje);
        Tegels.setLocation((x*50), (y*50));

        coor.setRij(y);
        coor.setColumn(x);

		f.add(Tegels);
	}
	public Integer getRow()
	{
		return this.coor.getRij();
	}
	public Integer getColumn()
	{
		return this.coor.getColumn();
	}
	public String getType()
	{
		return this.getClass().getName();
	}
}