package decorator;

import java.awt.*;

public class Red implements Rainbow{
    @Override
    public void draw(Graphics g, int w, int h) {
        g.setColor(Color.RED);
        g.fillArc(0,0,w,h,0,180);
    }
}
