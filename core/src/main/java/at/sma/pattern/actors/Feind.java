package at.sma.pattern.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;

public class Feind  extends SpielObjekt {

    public Rectangle boundary;

    public Feind(int x, int y, String image ) {
        super(x, y, new Texture(Gdx.files.internal(image)));
        boundary = new Rectangle();
        this.setBoundary();
    }

    public void update(float delta) {
        this.setBoundary();
    }

    private void setBoundary() {
        boundary.set(this.getX(),this.getY(),this.getWidth(), this.getHeight());
    }

    @Override
    public void draw(Batch b, float parentAlpha) {
        this.getImage().draw(b);
    }
}
