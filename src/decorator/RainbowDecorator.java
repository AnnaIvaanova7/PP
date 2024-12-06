package decorator;

import java.awt.*;

public abstract class RainbowDecorator implements Rainbow{
    protected Rainbow decoratedRainbow;

    public RainbowDecorator(Rainbow decoratedRainbow) {
        this.decoratedRainbow = decoratedRainbow;
    }

    @Override
    public void draw(Graphics g, int w, int h) {
        decoratedRainbow.draw(g, w, h);
    }
}
