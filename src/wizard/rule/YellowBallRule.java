package wizard.rule;

import wizard.Exception.YellowBallException;
import wizard.ball.Ball;
import wizard.ball.BallCollection;
import wizard.ball.Color;

public class YellowBallRule implements Rule {

    private double yellowBallFactor = 0.4;

    @Override
    public boolean isBallAddable(BallCollection balls, Ball ball, int bagSize) throws YellowBallException {
//        System.out.println((int)Math.floor(balls.numberOfTotalBalls() * this.yellowBallFactor));
        if(ball.isOfSameColor(Color.YELLOW) && balls.numberOf(Color.YELLOW) >= (int)Math.floor(balls.numberOfTotalBalls() * this.yellowBallFactor))
            throw new YellowBallException();
        return true;
    }
}
