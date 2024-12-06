package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Yellow extends RainbowDecorator {
    public Yellow(Rainbow decoratedRainbow) {
        super(decoratedRainbow);
    }

    @Override
    public void draw(Graphics g, int w, int h) {
        decoratedRainbow.draw(g, w, h);
        g.setColor(Color.YELLOW);
        g.fillArc(20, 20, w-40, h-40, 0, 180);
    }
}
