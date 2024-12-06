package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Blue extends RainbowDecorator {
    public Blue(Rainbow decoratedRainbow) {
        super(decoratedRainbow);
    }

    @Override
    public void draw(Graphics g, int w, int h) {
        decoratedRainbow.draw(g, w, h);
        g.setColor(Color.BLUE);
        g.fillArc(40, 40, w-80, h-80, 0, 180);
    }
}
