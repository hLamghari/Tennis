
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
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
    private Game game;
    @Test
    public void gameStart(){
        MatcherAssert.assertThat(game.score(), Is.is(CoreMatchers.equalTo("love-love")));
    }
}
