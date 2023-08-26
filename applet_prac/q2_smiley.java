// 2. Design an applet to display a colored smiley.


import java.applet.*;
import java.awt.*;
public class q2_smiley extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("HITU RAJ_2005025 ",70,50);
       		 g.setColor(Color.orange); 
		// Oval for face outline
		g.fillOval(100, 100, 400, 400);

		// Ovals for eyes
		g.setColor(Color.BLACK);
		g.fillOval(200, 250, 50, 50);
		g.fillOval(350, 250, 50, 50);

		// Arc for the smile
		g.drawArc(200, 350, 190, 90, 180, 180);
	}
}
/*<applet code ="q2_smiley" width=600 height=600>
</applet>*/
