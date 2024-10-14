package at.sma.pattern.actors;

import at.sma.pattern.pattern.MoveStrategy;
import at.sma.pattern.pattern.StraightFall;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.awt.*;

public abstract class GameObject extends Actor {
    protected Texture texture;
    protected Point point;
    private MoveStrategy moveStrategy;

    public GameObject(float x, float y, float width, float height, Color color) {
        this.point = new Point((int) x, (int) y);
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        setMoveStrategy(new StraightFall());
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    private void createTexture(int width, int height, Color color) {};

    public void update(float delta) {
        // move
        this.moveStrategy.updatePos(delta,this.point);
        this.setX(this.point.x);
        this.setY(this.point.y);
        if (this.getY() > 800 ) {
            this.point.y = 0;
        }
    }

    public void draw(Batch batch) {
        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
    };
}
