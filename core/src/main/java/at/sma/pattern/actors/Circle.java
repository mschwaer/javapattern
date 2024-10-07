package at.sma.pattern.actors;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.awt.*;

public class Circle extends Actor {

    private Texture texture;
    private Point point;
    public Circle(int x, int y, int durchmesser , Color color) {
        setX(x);
        setY(y);
        setWidth(durchmesser);
        setHeight(durchmesser);
        setColor(color);
        createTexture();
        this.point = new Point(x, y);
    }

    private void createTexture() {
        Pixmap pixmap = new Pixmap((int) getWidth(), (int) getHeight(), Pixmap.Format.RGBA8888);
        pixmap.setColor(getColor());
        pixmap.fillCircle((int)getWidth() /2 , (int) getHeight() /2 , (int) getHeight()/2);
        texture = new Texture(pixmap);
        pixmap.dispose();
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
    }
}
