// 1. Design an applet to display the user information such as Roll No., Name,
// Branch and Section in separate lines.



import java.applet.*;
import java.awt.*;

public class q1_student extends Applet
{
	public void paint (Graphics g)
	{
		String name = getParameter("name");
		String rollno = getParameter("rollno");
        String branch = getParameter("branch");
        String section = getParameter("section");
		g.setColor(Color.GREEN);
		Font f=new Font("TIMES ROMAN", Font.BOLD | Font.ITALIC,34);
		g.setFont(f);
		g.drawString("Name : "+name,70,50);
		g.drawString("Roll no : "+rollno,70,100); 
        g.drawString("Branch : "+branch,70,150); 
        g.drawString("section: "+section,70,200); 
	}
}

/*<applet code="q1_student" height=500 width=500>

<param name="name" value="HITU RAJ"> </param>

<param name="rollno" value="2005025"> </param>

<param name="branch" value="CSE"> </param>

<param name="section" value=" 12"> </param>

</applet>*/

