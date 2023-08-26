// 3. Design an applet with following components on it – Label, Textbox, Text area,
// Checkbox, Radio button and Button.

import java.applet.*;
import java.awt.*;
public class q3_checkboxes extends Applet 
{
    Label label = new Label ("Welcome TO HITU RAJ CODE");
    Button button = new Button ("Button");
    Checkbox toggle = new Checkbox ("Toggle this");
    TextField text = new TextField ("Sample textarea", 200);
    public void init () 
    {
    add (label);
    add (button);
    add (toggle);
    add (text);
    }
}
/*<applet code ="q3_checkboxes" width=300 height=600>
</applet>*/
