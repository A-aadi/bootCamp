package wizard.ball;

import java.util.ArrayList;

public class BallCollection {

    private ArrayList<Ball> balls = new ArrayList<Ball>();

    public int numberOf(Color color) {
        int counter = 0;
        for (Ball ball : balls) {
            if (ball.isOfSameColor(color))
                counter++;
        }
        return counter;
    }

    public int numberOfTotalBalls(){
        return balls.size();
    }

    public void add(Ball ball){
        balls.add(ball);
    }
}
