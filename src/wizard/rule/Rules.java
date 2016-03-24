package wizard.rule;

import wizard.Exception.*;
import wizard.ball.Ball;
import wizard.ball.BallCollection;

import java.util.ArrayList;

public class Rules {
    private ArrayList<Rule> rules = new ArrayList<Rule>();
    public void add(Rule rule){
        rules.add(rule);
    }

    public boolean checkValidation(BallCollection balls, Ball ball, int bagSize) throws BagFullException, RedBallException, YellowBallException, BlueBallException, GreenBallException {
        for (Rule rule : rules) {
            rule.isBallAddable(balls, ball, bagSize);

        }
        return true;
    }
}
