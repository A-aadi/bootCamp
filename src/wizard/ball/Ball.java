package wizard.ball;

public class Ball {
    private Color color;

    private Ball(Color color) {

        this.color = color;
    }

    public boolean isOfSameColor(Color color) {
        return this.color.equals(color);
    }

    public static Ball createGreenBall(){
        return new Ball(Color.GREEN);
    }

    public static Ball createRedBall(){
        return new Ball(Color.RED);
    }

    public static Ball createBlueBAll(){
        return new Ball(Color.BLUE);
    }

    public static Ball createYellowBall(){
        return new Ball(Color.YELLOW);
    }
};