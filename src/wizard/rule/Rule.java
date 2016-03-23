package wizard.rule;

import wizard.ball.Ball;
import wizard.ball.BallCollection;

public interface Rule {
    public boolean isBallAddable(BallCollection balls, Ball ball);
}
