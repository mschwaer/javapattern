package at.sma.pattern.actors;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;


public class GameActor extends SpielObjekt {

    public Rectangle boundary;

    public GameActor(int x, int y, String image) {
        super(x, y, new Texture(Gdx.files.internal(image)));
        boundary = new Rectangle();
        this.setBoundary();
    }

    @Override
    public void draw(Batch b, float parentAlpha) {
        RectangleLG rect = new RectangleLG (boundary.getX(),boundary.getY(),boundary.getWidth(), boundary.getHeight(),new Color(Color.GREEN));
        rect.draw(b,1);
        this.getImage().draw(b);
    }


    public void update(float delta) {
        this.setBoundary();
        this.image.setX(this.getX());
        this.image.setY(this.getY());

    }

    private void setBoundary() {
        boundary.set(this.getX(),this.getY(),this.getWidth(), this.getHeight());
    }

    public boolean collide(Rectangle shape) {
        Rectangle tmprect = new Rectangle();
        if (Intersector.intersectRectangles(this.boundary,shape,tmprect))
            return true;
        else
            return false;
    }

    @Override
    public void act(float dt) {
        super.act(dt);
        this.update(dt);
    }
}
