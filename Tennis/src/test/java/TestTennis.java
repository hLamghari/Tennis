
import com.kata.tennis.Game;
import static org.hamcrest.CoreMatchers.equalTo;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hlamghari
 */
public class TestTennis {
    private Game game = new Game();
    @Test
    public void gameStart(){
        MatcherAssert.assertThat(game.score(), is(equalTo("love-love")));
    }
}
