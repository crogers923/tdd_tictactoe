import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TicTacToeSolvedTest {

    /**
     * Our tests:
     *  1. Space is blank - X or O can be placed
     *  2. Space is filled - X or O cannot be placed
     *  3. only X or O is placed
     *  4. X/O placed
     *  5. Board is full
     *  6. Player has 3 in a row (wins)
     *  7. O cannot go first
     *  8. X must go first
     *  9. Board is not bigger than 3 x 3
     */
    TicTacToeSolved game;
    @Before
    public void setup(){
        game = new TicTacToeSolved();
    }
    @After
    public void teardown(){

    }

    /**
     * 1.
     * Given:
     * When: space is blank
     * Then: X or O can be placed
     */
    @Test
    public void whenBlankThenContinue_Step1Through4() {
        //step 3:
        boolean isBlank = true;
        assertTrue(isBlank);
    }

    @Test
    public void whenBlankThenNoContinue_Refactor(){
        //create class TicTacToe
        //create method boardSpaceIsBlank
        //setup: add new TicTacToe class
        assertTrue(game.boardSpaceIsBlank());
    }

    /**
     * 2.
     * given:
     * when: space is filled
     * then: X or O cannot be placed
     */
    @Test
    public void whenFilledThenContinue_Step1(){
        //step 3:
        boolean isFilled = true;
        assertTrue(isFilled);
    }

    @Test
    public void whenFilledThenContinue_Refactor(){
        //create method boardSpaceIsFilled
        assertTrue(game.boardSpaceIsFilled());
    }

    /**
     * 3(a)
     * given:
     * when: X or O is played
     * then: continue
     */
    @Test
    public void whenXOrOPlayedThenContinue_Step1(){
        char played = 'X';
        assertTrue(played=='X' || played == 'O');
        played = 'O';
        assertTrue(played=='X' || played =='O');
    }

    @Test
    public void whenXOrOPlayedThenContinue_Refactor() throws Exception{
        //create play method which accepts a token
        char played = 'X';
        game.playToken(played);
        played = 'O';
        game.playToken(played);
        assertTrue(true);
    }

    /**
     * 3(b)
     * when: other than X or O is played
     * then: exception is thrown
     */
    @Test(expected = Exception.class)
    public void whenNotXNorOPlayedThenThrow_Step1() throws Exception{
        char played = 'M';
        game.playToken(played);
        assertTrue(true);
        //refactor not needed here - method is already written and accepts a token.
    }

    /**
     * 4.
     * given: space is blank
     * when: token is placed on space
     * then: position is filled by token
     *
     * TODO: should I refactor/add isFilled to be isFilledByToken?
     */
    @Test
    public void testTokenPlacedInSpace_Step1(){
        //step 3:
        // this is where you have to decide how you define a space. Is it a position? X,Y coordinates? I chose position.
        char spaceToken = 'X';
        int spacePosition = 0;
        char[] array = new char[spacePosition+1];
        array[spacePosition] = spaceToken;
        assertEquals(array[spacePosition], spaceToken);
    }

    @Test
    public void testTokenPlaced_Refactor(){
        //create method to place token in TicTacToe
        char spaceToken = 'X';
        int spacePosition = 0;
        assertEquals(game.placeTokenInSpace(spaceToken, spacePosition)[spacePosition], spaceToken);
    }


    /**
     * 5.
     * Passes when board has no more blank spaces
     */
    @Test
    public void testBoardIsFull_Step1(){
        int size = 9;
        char[] spaces = new char[size];
        for(int i= 0; i < size;i++){
            //step 3:
            spaces[i] = 'X';
        }
        for(int j=0; j<spaces.length; j++){
            assertNotNull(spaces[j]);
        }
    }

    @Test
    public void testBoardIsFull_Refactor(){
        //create method for isBoardFull
        //refactor placeToken to support multiple moves
        for(int i= 0; i < game.getSize();i++){
            game.placeTokenInSpace_Refactored('X', i);
        }
        assertTrue(game.isBoardFull());

    }

    @Test
    public void testPlayerWins(){

    }

    @Test
    public void testXCannotBePlaced(){

    }

    @Test
    public void testOCannotBePlaced(){

    }

    @Test
    public void testOCannotGoFirst(){

    }

    @Test
    public void testXGoesFirst(){

    }

    @Test
    public void testBoardIsRightSize() {

    }

}
