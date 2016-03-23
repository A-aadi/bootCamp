package wizard.rule;

import wizard.ball.Ball;
import wizard.ball.BallCollection;

public class BlueBallRule implements Rule {

    @Override
    public boolean isBallAddable(BallCollection balls, Ball ball) {
        int bagSize = 12;
        return balls.numberOfTotalBalls() < bagSize;
    }
}
