package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Green extends RainbowDecorator {
    public Green(Rainbow decoratedRainbow) {
        super(decoratedRainbow);
    }
    @Override
    public void draw(Graphics g, int w, int h) {
        decoratedRainbow.draw(g, w, h);
        g.setColor(Color.GREEN);
        g.fillArc(30, 30, w-60, h-60, 0, 180);
    }
}
