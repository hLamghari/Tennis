
import com.kata.tennis.Game;
import com.kata.tennis.Player;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
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
    Player player1 = new Player("player 1");
    Player player2 = new Player("player 2");
    private Game game = new Game(player1, player2);
    @Test
    public void gameStart(){
        assertThat(game.score(), is(equalTo("love-love")));
    }
    @Test
    public void player_1_scores(){
        player1.hasScored();
        assertThat(game.score(), is(equalTo("fifteen-love")));
    }
    @Test
    public void player_2_scores(){
        player2.hasScored();
        assertThat(game.score(), is(equalTo("love-fifteen")));
    }
    @Test
    public void players_deuce(){
        player1.hasScored();
        player1.hasScored();
        player1.hasScored();
        player2.hasScored();
        player2.hasScored();
        player2.hasScored();
        assertThat(game.score(), is(equalTo("deuce")));
    }
    
    @Test
    public void players_1_advantage(){
        player1.hasScored();
        player1.hasScored();
        player1.hasScored();
        player1.hasScored();
        player2.hasScored();
        player2.hasScored();
        player2.hasScored();
        assertThat(game.score(), is(equalTo("advantage player 1")));
    }
    
    @Test
    public void players_1_wins(){
        player1.hasScored();
        player1.hasScored();
        player1.hasScored();
        player1.hasScored();
        player1.hasScored();
        player2.hasScored();
        player2.hasScored();
        player2.hasScored();
        assertThat(game.score(), is(equalTo("player 1 wins")));
    }
    
    @Test
    public void players_2_wins(){
        player1.hasScored();
        player2.hasScored();
        player2.hasScored();
        player2.hasScored();
        player2.hasScored();
        assertThat(game.score(), is(equalTo("player 2 wins")));
    }
}
