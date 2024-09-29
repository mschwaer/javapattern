package at.sma.pattern;

import at.sma.pattern.actors.Circle;
import at.sma.pattern.actors.RectangleLG;
import at.sma.pattern.actors.Triangle;
import at.sma.pattern.pattern.Singleton;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private BitmapFont font;
    Sprite backGroundSprite;
    RectangleLG rlg;
    Triangle tri,tri2;
    Circle cir;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
        font = new BitmapFont();
        backGroundSprite = new Sprite(new Texture("background_800.jpg"));
        backGroundSprite.setPosition(0,0);
        rlg = new RectangleLG(100,300,40,40, Color.BLACK);
        tri = new Triangle(100,200,40,40,Color.RED);
        cir = new Circle(100,100,40,Color.YELLOW);
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        backGroundSprite.draw(batch);
        font.draw(batch, Singleton.writeText(),10,100);
        tri.draw(batch);
        rlg.draw(batch,100);
        cir.draw(batch,100);
        batch.end();

    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
