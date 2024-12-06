package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Violet extends RainbowDecorator {
    public Violet(Rainbow decoratedRainbow) {
        super(decoratedRainbow);
    }

    @Override
    public void draw(Graphics g, int w, int h) {
        decoratedRainbow.draw(g, w, h);
        g.setColor(new Color(128, 0, 128));
        g.fillArc(50, 50, w-100, h-100, 0, 180);
    }
}
