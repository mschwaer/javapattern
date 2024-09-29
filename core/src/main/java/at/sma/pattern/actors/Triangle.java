package at.sma.pattern.actors;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Triangle extends Actor {
    private Texture texture;

    public Triangle(float x, float y, float width, float height, Color color) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        setColor(color);
        createTexture((int)width, (int)height, getColor());
    }

    private void createTexture(int width, int height, Color color) {
        Pixmap pixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);
        pixmap.setColor(color.r, color.g, color.b, color.a * 100);
        System.out.println(getWidth() + " " + getHeight());
        pixmap.fillTriangle(0, 0, width, 0, (int) width / 2, width);
        texture = new Texture(pixmap);
        pixmap.dispose();
    }

    public void draw(Batch batch) {;
        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
    }
}
