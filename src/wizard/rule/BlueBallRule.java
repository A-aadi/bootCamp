package wizard.rule;

import wizard.Exception.BlueBallException;
import wizard.ball.Ball;
import wizard.ball.BallCollection;

public class BlueBallRule implements Rule {

    @Override
    public boolean isBallAddable(BallCollection balls, Ball ball, int bagSize) throws BlueBallException {
        if(balls.numberOfTotalBalls() < bagSize)
            return true;
        throw new BlueBallException();
    }
}
