package wizard;

import wizard.Exception.*;
import wizard.ball.Ball;
import wizard.ball.BallCollection;
import wizard.rule.Rules;

/*
    * Job Of Bag ---
     it should add a ball in valid condition
 */

public class Bag {
    private BallCollection balls = new BallCollection();
    private final int bagSize;
    private Rules rules;

    public Bag(Rules rules, int size) {
        this.rules = rules;
        this.bagSize = size;
    }

    public int put(Ball ball) throws BagFullException, RedBallException, YellowBallException, BlueBallException, GreenBallException{
        if(isFull())
            throw new BagFullException();
        rules.checkValidation(balls, ball, bagSize);
        balls.add(ball);
        return balls.numberOfTotalBalls();
    }

    private boolean isFull() {
        return balls.numberOfTotalBalls() >= this.bagSize;
    }

//
//    private void updateStatus(String color){
//        if((previousColor.equals(color)  || previousColor.equals(""))){
//            previousColor = color;
//            counter++;
//        }
//        if(!previousColor.equals(color)){
//            status += "["+counter+""+previousColor+", ";
//            previousColor = color;
//            counter =1;
//        }
//    }
//


}
