package at.sma.pattern.pattern;

import java.awt.*;

public class SinusFall implements MoveStrategy {
	private float time;
	private int middleX;

	public SinusFall(int middleX, float phi) {
		this.time = phi;
		this.middleX = middleX;
	}

	@Override
	public void updatePos(float delta, Point position) {
		this.time += delta * 60;
		position.x = (int) ((int) middleX + (float) Math.sin(time / 400) * 80);
		position.y += (int) (delta *60);
	}
}
