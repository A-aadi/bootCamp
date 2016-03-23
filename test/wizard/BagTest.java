package wizard;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void bag_should_be_able_to_add_a_ball_in_it() throws Exception {
        Bag bag = new Bag(3);
        Ball ball = new Ball(Color.GREEN);
        assertEquals(true, bag.addBall(ball));
    }

    @Test
    public void it_throws_exception_in_case_of_adding_more_balls_than_bagSize() throws Exception {
        thrown.expect(RulesAreBrokenException.class);
        thrown.expectMessage("You are not allowed to destroy Balloria");
        Bag bag = new Bag(1);
        Ball greenBall1 = new Ball(Color.GREEN);
        Ball greenBall2 = new Ball(Color.GREEN);
        bag.addBall(greenBall1);
        bag.addBall(greenBall2);
//
    }
//
    @Test
    public void it_throws_exception_in_addition_of_more_than_three_green_balls() throws Exception {
        thrown.expect(RulesAreBrokenException.class);
        thrown.expectMessage("You are not allowed to destroy Balloria");
        Bag bag = new Bag(12);

        Ball greenBall1 = new Ball(Color.GREEN);
        Ball greenBall2 = new Ball(Color.GREEN);
        Ball greenBall3 = new Ball(Color.GREEN);
        Ball greenBall4 = new Ball(Color.GREEN);

        bag.addBall(greenBall1);
        bag.addBall(greenBall2);
        bag.addBall(greenBall3);
        bag.addBall(greenBall4);

    }

    @Test
    public void it_throws_exception_in_addition_of_red_ball_if_there_is_no_green_ball_in_bag() throws Exception {
        thrown.expect(RulesAreBrokenException.class);
        thrown.expectMessage("You are not allowed to destroy Balloria");
        Bag bag = new Bag(12);

        Ball redBall1 = new Ball(Color.RED);
        bag.addBall(redBall1);
    }

    @Test
    public void it_is_not_to_allowed_to_add_red_balls_more_than_double_of_green_balls() throws Exception {
        thrown.expect(RulesAreBrokenException.class);
        thrown.expectMessage("You are not allowed to destroy Balloria");
        Bag bag = new Bag(12);

        bag.addBall(new Ball(Color.GREEN));

        bag.addBall(new Ball(Color.RED));
        bag.addBall(new Ball(Color.RED));
    }

    @Test
    public void should_allow_to_add_as_many_blue_balls_as_the_size_of_bag() throws Exception {
        Bag bag = new Bag(3);

        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        assertEquals(true, bag.addBall(new Ball(Color.BLUE)));
    }
    @Test
    public void it_throw_exception_while_adding_blue_ball_more() throws Exception {
        thrown.expect(RulesAreBrokenException.class);
        thrown.expectMessage("You are not allowed to destroy Balloria");
        Bag bag = new Bag(3);

        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.BLUE));
    }
    @Test
    public void it_should_allow_to_put_yellow_ball_till_40Percent_of_number_of_the_balls_in_bag() throws Exception {
        Bag bag = new Bag(8);
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.YELLOW));
        assertEquals(true, bag.addBall(new Ball(Color.YELLOW)));
    }

    @Test
    public void it_throws_error_in_addition_of_yellow_balls_more_than_40Percent_of_existing_balls() throws Exception {
        thrown.expect(RulesAreBrokenException.class);
        thrown.expectMessage("You are not allowed to destroy Balloria");
        Bag bag = new Bag(8);
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.YELLOW));
        bag.addBall(new Ball(Color.YELLOW));
    }

    @Test
    public void should_be_able_to_get_summary_of_balls() throws Exception {
        Bag bag = new Bag(14);
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.BLUE));
        bag.addBall(new Ball(Color.RED));
        bag.addBall(new Ball(Color.RED));
        bag.addBall(new Ball(Color.RED));
        bag.addBall(new Ball(Color.RED));
        bag.addBall(new Ball(Color.RED));

        String expected = "[2green, 2blue, 1green, 1blue, 5red]";
        assertEquals(expected, bag.getSummary());

    }
}