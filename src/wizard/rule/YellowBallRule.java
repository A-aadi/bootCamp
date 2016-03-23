package wizard.rule;

import wizard.ball.Ball;
import wizard.ball.BallCollection;
import wizard.ball.Color;

public class YellowBallRule implements Rule {

    private double yellowBallFactor = 0.4;

    @Override
    public boolean isBallAddable(BallCollection balls, Ball ball) {
        return balls.numberOf(Color.YELLOW) < (int)Math.floor(balls.numberOfTotalBalls() * this.yellowBallFactor);
    }
}
