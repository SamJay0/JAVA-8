
package borderlayouttest;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
    
    String names[]={"Justo","Brian","Diana","Nickson","Gideon"};
    JButton buttons[]=new JButton[names.length];
    BorderLayoutTest(){
        super();
        for(int i=0;i<names.length;i++){
            buttons[i]=new JButton(names[i]);
        }
        JFrame frame=new JFrame();
        frame.setLayout(new BorderLayout());
        frame.add(buttons[0],BorderLayout.NORTH);
       /* frame.add(buttons[1],BorderLayout.SOUTH);
        frame.add(buttons[2],BorderLayout.WEST);
        frame.add(buttons[3],BorderLayout.EAST);
        frame.add(buttons[4],BorderLayout.CENTER);*/
        frame.setVisible(true);
        frame.setSize(1000, 1000);
    }
    public static void main(String[] args) {
        BorderLayoutTest border=new BorderLayoutTest();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
