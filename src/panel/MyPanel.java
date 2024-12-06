package panel;

import decorator.Rainbow;
import decorator.Red;
import decorator.colors.*;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private Rainbow rainbow;
    public MyPanel(){
        rainbow = new Violet(
                new Blue(
                        new Green(
                                new Yellow(
                                        new Orange(
                                                new Red()
                                        )
                                )
                        )
                )
        );
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        rainbow.draw(g, w, h);
    }
}


