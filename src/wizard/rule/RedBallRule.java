package wizard.rule;

import wizard.ball.Ball;
import wizard.ball.BallCollection;
import wizard.ball.Color;

public class RedBallRule implements Rule {

    @Override
    public boolean isBallAddable(BallCollection collectionOFBalls, Ball ball) {
        int numberOfGreenBAlls = collectionOFBalls.numberOf(Color.GREEN);
        if(numberOfGreenBAlls == 0 || collectionOFBalls.numberOf(Color.RED) == 2*(numberOfGreenBAlls)-1)
            return false;
        return true;
    }
}
