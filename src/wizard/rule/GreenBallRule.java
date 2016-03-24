package wizard.rule;

import wizard.Exception.GreenBallException;
import wizard.Exception.RulesAreBrokenException;
import wizard.ball.Ball;
import wizard.ball.BallCollection;
import wizard.ball.Color;

public class GreenBallRule implements Rule {

    @Override
    public boolean isBallAddable(BallCollection balls, Ball ball, int bagSize) throws GreenBallException {
        int greenBallLimit = 3;
        if(ball.isOfSameColor(Color.GREEN) && balls.numberOf(Color.GREEN) == greenBallLimit)
            throw new GreenBallException();
        return true;
    }
}
