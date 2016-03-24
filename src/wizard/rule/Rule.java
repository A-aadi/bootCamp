package wizard.rule;

import wizard.Exception.*;
import wizard.ball.Ball;
import wizard.ball.BallCollection;

public interface Rule {
    boolean isBallAddable(BallCollection balls, Ball ball, int bagSize) throws  BlueBallException, YellowBallException, RedBallException, GreenBallException;
}
