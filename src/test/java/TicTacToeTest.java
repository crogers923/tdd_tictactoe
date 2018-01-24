import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {
    /**
     * 1. When one player goes, then they can't go again
     * 2. 1st player is X
     * 3. We have a board
     * 4. Can't play on an already filled spot
     */

    TicTacToe game;

    @Before
    public void setup(){
        game = new TicTacToe();
    }

    @Test
    public void whenOnePlayerGoesThenCannotPlayAgain(){
        assertNotEquals(game.returnCurrentPlayer(), "O");
    }

    @Test
    public void whenGameStartsThenXGoesFirst(){
        int playCounter = 0;
        if(playCounter==0) {
            assertEquals(game.returnCurrentPlayer(), "X");
        }
    }


}
