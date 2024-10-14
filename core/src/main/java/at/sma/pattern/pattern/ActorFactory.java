package at.sma.pattern.pattern;

import at.sma.pattern.actors.Circle;
import at.sma.pattern.actors.GameObject;
import at.sma.pattern.actors.RectangleLG;
import at.sma.pattern.actors.Triangle;
import com.badlogic.gdx.graphics.Color;

import java.util.Random;


public class ActorFactory {

    public GameObject createGameObject(String name){
        switch (name) {
            case "circle":
                return new Circle(100,100,40,Color.YELLOW);
            case "rectangle":
                return new RectangleLG(100,300,40,40,Color.BLACK);
            case "triangle":
                return new Triangle(100,200,40,40,Color.RED);
            case "triangle_random":
                Triangle triangle = new Triangle(100,200,40,40,Color.RED);
                return triangle;
            default:
                return createRandomObject();
        }
    }


    public GameObject createRandomObject(){
        return createRandomObject(new StraightFall());
    }

    public GameObject createRandomObjectMoveStrategy(){
        return createRandomObject(createRandomMoveStrategy());
    }

    private GameObject createRandomObject(MoveStrategy moveStrategy){
        Random rand = new Random();
        GameObject go = null;
        switch (rand.nextInt(3)) {
           case 0:
                Circle circle = new Circle(100,100,40,Color.YELLOW);
                circle.setMoveStrategy(moveStrategy);
                go= circle;
           case 1:
                RectangleLG rect = new RectangleLG(100,300,40,40,Color.BLACK);
                rect.setMoveStrategy(moveStrategy);
                go = rect;
           case 2:
               Triangle triangle = new Triangle(100,200,40,40,Color.RED);
               triangle.setMoveStrategy(moveStrategy);
               go =triangle;

        }
        return go;
    }

    private MoveStrategy createRandomMoveStrategy(){
        Random rand = new Random();
        MoveStrategy moveStrategy = null;
        switch (rand.nextInt(3)) {
            case 0:
                moveStrategy = new CirclingFall(rand.nextInt(300,500));
                break;
            case 1:
                moveStrategy = new SinusFall(rand.nextInt(300,700),0 );
                break;
            case 2:
                moveStrategy= new StraightFall();
                break;
        }
        return moveStrategy;
    }
}
