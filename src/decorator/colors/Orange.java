package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Orange extends RainbowDecorator {
    public Orange(Rainbow decoratedRainbow) {
        super(decoratedRainbow);
    }

    @Override
    public void draw(Graphics g, int w, int h) {
        decoratedRainbow.draw(g, w, h);
        g.setColor(Color.ORANGE);
        g.fillArc(10, 10, w-20, h-20, 0, 180);
    }
}
