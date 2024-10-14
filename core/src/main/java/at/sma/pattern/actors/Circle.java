package at.sma.pattern.actors;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.awt.*;

public class Circle extends GameObject {

    public Circle(int x, int y, int durchmesser , Color color) {
        super(x, y, durchmesser, durchmesser, color);
        createTexture();

    }

    private void createTexture() {
        Pixmap pixmap = new Pixmap((int) getWidth(), (int) getHeight(), Pixmap.Format.RGBA8888);
        pixmap.setColor(getColor());
        pixmap.fillCircle((int)getWidth() /2 , (int) getHeight() /2 , (int) getHeight()/2);
        texture = new Texture(pixmap);
        pixmap.dispose();
    }


}
