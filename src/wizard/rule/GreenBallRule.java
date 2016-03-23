package wizard.rule;

import wizard.ball.Ball;
import wizard.ball.BallCollection;
import wizard.ball.Color;

public class GreenBallRule implements Rule {
    private int greenBallLimit = 3;

    @Override
    public boolean isBallAddable(BallCollection balls, Ball ball) {
        return balls.numberOf(Color.GREEN) < this.greenBallLimit;
    }


}
