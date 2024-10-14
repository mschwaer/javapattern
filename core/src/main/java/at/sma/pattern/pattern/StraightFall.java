package at.sma.pattern.pattern;


import java.awt.*;

public class StraightFall implements MoveStrategy {
	@Override
	public void updatePos(float delta, Point position) {
		//position.y += (int) (delta / 5);
        position.y += (int) (delta * 60);
	}
}
