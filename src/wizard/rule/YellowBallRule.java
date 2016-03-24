package wizard.rule;

import wizard.Exception.YellowBallException;
import wizard.ball.Ball;
import wizard.ball.BallCollection;
import wizard.ball.Color;

public class YellowBallRule implements Rule {

    @Override
    public boolean isBallAddable(BallCollection balls, Ball ball, int bagSize) throws YellowBallException {
        double yellowBallFactor = 0.4;
        if(ball.isOfSameColor(Color.YELLOW) && balls.numberOf(Color.YELLOW) >= (int)Math.floor(balls.numberOfTotalBalls() * yellowBallFactor))
            throw new YellowBallException();
        return true;
    }
}
