package wizard.rule;

import wizard.Exception.RedBallException;
import wizard.Exception.RulesAreBrokenException;
import wizard.ball.Ball;
import wizard.ball.BallCollection;
import wizard.ball.Color;

public class RedBallRule implements Rule {

    @Override
    public boolean isBallAddable(BallCollection balls, Ball ball, int bagSize) throws RedBallException {
        int numberOfGreenBalls = balls.numberOf(Color.GREEN);
        if ((ball.isOfSameColor(Color.RED) && balls.numberOf(Color.RED) >= 2 * (numberOfGreenBalls) - 1) ||
                (ball.isOfSameColor(Color.RED) && balls.numberOf(Color.GREEN )== 0)
                ){
            throw new RedBallException();}
        return true;
    }
}
