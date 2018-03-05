package MainPackage;


import java.util.*;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.*;

public class Speelveld {
	List<Tegel> tegelList = new ArrayList<Tegel>();
	public void controleerSpeelveld(int playSize)
	{
		try {
			if(playSize >= 10)
			{
				
				playSize = playSize - 8;
				
			}else
			{
				throw new Exception("Te klein");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void teken(int playSize)
	{


	}
	public void tekenMuur(int playSize)
	{
		int muur;
	}
	private void createWalls()
	{
		
	}
}
