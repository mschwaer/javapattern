package at.sma.pattern.pattern;

import java.awt.*;

public interface MoveStrategy {
	void updatePos(float delta, Point position);
}
