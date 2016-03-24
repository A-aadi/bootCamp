package wizard.rule;

import org.junit.Before;
import org.junit.Test;
import wizard.ball.Ball;
import wizard.ball.BallCollection;

import static junit.framework.TestCase.assertEquals;

public class YellowBallRuleTest {
    YellowBallRule yellowBallRule;
    @Before
    public void setUp() throws Exception {
        YellowBallRule yellowBallRule = new YellowBallRule();
    }

    @Test
    public void it_should_return_true_is_all_conditions_are_valid() throws Exception {
        BallCollection balls = new BallCollection();
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createYellowBall());
//        assertEquals(true, yellowBallRule.isBallAddable(balls, Ball.createYellowBall()));
    }


}