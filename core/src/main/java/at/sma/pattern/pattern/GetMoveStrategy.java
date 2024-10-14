package at.sma.pattern.pattern;

import java.util.Random;

public enum GetMoveStrategy {
    EAST, WEST, SOUTH, NORTH;

    private static final Random PRNG = new Random();

    public static GetMoveStrategy randomDirection()  {
        GetMoveStrategy[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }
}

