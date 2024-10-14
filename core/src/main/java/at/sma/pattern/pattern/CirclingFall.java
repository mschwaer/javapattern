package at.sma.pattern.pattern;


import java.awt.*;

public class CirclingFall implements MoveStrategy {
	private float time;
	private int middleX;

	public CirclingFall(int middleX) {
		this.middleX = middleX;
	}

	@Override
	public void updatePos(float delta, Point position) {
		this.time += delta*120;


		float upperY = time / 7;
		float lowerY = time / 7 + 50;

		float angle = timeToRadiands(time);
		float deltaX = (float) Math.cos(angle) * 50;

		position.x = (int) (deltaX + middleX);
		position.y = (int) ((lowerY - upperY) * (float) Math.sin(angle) + (lowerY / 2));
	}

	private float timeToRadiands(float time) {
		return time / 200;
	}
}
