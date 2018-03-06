package MainPackage;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Speler extends Tegel{
	Canvas Tegels = new Canvas();
	public int playercolumn, playerrow;
	public Speler(){
		kleurtje = Color.RED;
	}
	public void beweeg(JFrame f,int x,int y,Tegel[][] tegelSave)
	{
		if(tegelSave[(playercolumn+y-1)][(playerrow+x-1)] != null){
		if(tegelSave[(playercolumn+y-1)][(playerrow+x-1)].getType() == "MainPackage.Doel")
		{
			realyMove(f,x,y,tegelSave);
			System.out.println("Gewonnen");
		}else if(tegelSave[(playercolumn+y-1)][(playerrow+x-1)].getType() == "MainPackage.Leeg")
		{
			realyMove(f,x,y,tegelSave);
		}

		}
	}
	private void realyMove(JFrame f,int x,int y,Tegel[][] tegelSave)
	{
		playerrow += x;
		playercolumn += y;
		Tegels.setLocation((playerrow*50), (playercolumn*50));
        coor.setRij(playercolumn);
        coor.setColumn(playerrow);
		Tegels.repaint();
	}
	public void Teken(JFrame f,int x, int y)
	{

	    System.out.println("player x" + x + "y" + y);
        Tegels.setSize(50, 50);

        Tegels.setBackground(kleurtje);
        Tegels.setLocation((x*50), (y*50));
        playerrow = (x);
        playercolumn = (y);
        coor.setRij(y);
        coor.setColumn(x);
    	f.add(Tegels);
	}
}
