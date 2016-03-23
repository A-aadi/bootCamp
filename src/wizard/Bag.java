package wizard;

import java.util.ArrayList;
import java.util.HashMap;

/*
    * Job Of Bag---
     it should add a ball in valid condition
 */

public class Bag {
    private final HashMap<String, ArrayList<Ball>> bag;
    private final int maxSize;
    private String previousColor = "";
    private String status = "[";
    private int counter = 0;

    public Bag(int size) {
        this.maxSize = size;
        this.bag = new HashMap<String, ArrayList<Ball>>();
    }


    public boolean addBall(Ball ball) throws RulesAreBrokenException {
        if(!isSafeToAdd(ball))
            throw new RulesAreBrokenException();
        bag.get(ball.getColor()).add(ball);
        updateStatus(ball.getColor());
        return true;

    }

    private void updateStatus(String color){
        if((previousColor.equals(color)  || previousColor.equals(""))){
            previousColor = color;
            counter++;
        }
        if(!previousColor.equals(color)){
            status += counter+""+previousColor+", ";
            previousColor = color;
            counter =1;
        }
    }

    private boolean isSafeToAdd(Ball ball){
        return (getTotalNumberOfBalls() < this.maxSize) && canAdd(ball);
    }

    private boolean canAdd(Ball ball){
        if(!bag.containsKey(ball.getColor())){
            bag.put(ball.getColor(),new ArrayList<Ball>());}
        if(!(bag.containsKey("green")) && ball.getColor().equals("red")){
            return false;}
        if(bag.containsKey("red") && bag.get("green").size() > 0 && (bag.get("red").size() > 2*(bag.get("green").size())-2))
            return false;
        if(maxSize - getTotalNumberOfBalls() < 0)
            return false;
        if(bag.containsKey("green") && ball.getColor().equals("green") && bag.get("green").size() > 2)
           return false;
        if(bag.containsKey("yellow") && bag.get("yellow").size() >= getFortyPerscentOfExistingBalls() )
            return false;
        return true;
    }

    private int getTotalNumberOfBalls(){
        int counter = 0;
        for (String s : bag.keySet()) {
            counter += bag.get(s).size();
        }
        return counter;
    }

    private int getFortyPerscentOfExistingBalls(){
        return (int) Math.floor(getTotalNumberOfBalls() * 0.4);
    }



    public String getSummary(){
        status += counter+""+previousColor+"]";
        return status;
    }
}
