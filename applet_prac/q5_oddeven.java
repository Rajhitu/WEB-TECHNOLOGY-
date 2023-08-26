// 5. Design an applet with one label, one text field and one button so that on
// clicking the button it will check and display in the applet whether the value entered
// in the text field is even or odd or blank.

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class q5_oddeven extends Applet implements ActionListener
{
            TextField input;
            Button check;
            int flag=0;
            public void init()
            {
                        check=new Button("check");
                        Label inp=new Label("Enter any number :",Label.RIGHT);
                        
                        input=new TextField(5);

                        input.setBackground(Color.yellow);
                        add(inp);
                        add(input);
                        add(check);
                        input.addActionListener(this);
                        check.addActionListener(this);
            }
            public void actionPerformed(ActionEvent ae)
            {         
                        String str=ae.getActionCommand();
                        if(str.equals("check"))
                        {
                                    int n=Integer.parseInt(input.getText());
		         flag=0;
                                    if(n%2==0)
                                    {
                                        flag=1;
                                    }
                                   
                        }
                        repaint();
                                               
            }
            public void paint (Graphics g)
            {
                if(flag == 1) 
                    g.drawString("Even number",100,200); 
                else if(flag==0)
                    g.drawString("odd number",100,200);
            }
}

/*<applet code="q5_oddeven" width=500 height=500></applet>*/





