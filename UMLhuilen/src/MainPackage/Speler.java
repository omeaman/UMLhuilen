package MainPackage;

import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;

public class Speler extends Tegel{
	Canvas Tegels = new Canvas();
	public Speler(){
		kleurtje = Color.RED;
	}
	public void beweeg(int x,int y)
	{
		Speelveld.playerrow += x;
		Speelveld.playercolumn += y;
		Speelveld.updateSpeler();
	}
	public void Teken(JFrame f,int x, int y)
	{
		int firstdraw = 0;
		if(Tegels.getBackground() == null)
		{
			firstdraw = 1;
		}
	    System.out.println("player x" + x + "y" + y);
        Tegels.setSize(50, 50);

        Tegels.setBackground(kleurtje);
        Tegels.setLocation((x*50), (y*50));

        coor.setRij(y);
        coor.setColumn(x);
        if(firstdraw == 1){
    		f.add(Tegels);
        }else
        {
        	Tegels.repaint();
        }

	}
}
