package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class TicTacToeTest {

    @Test
    public void testStart() {
    }

    @Test
    public void testSwitchCurrentPlayer() {
        TicTacToe game = new TicTacToe();
        assertEquals(game.getCurrentPlayer(), game.getPlayer1());
        game.switchCurrentPlayer();
        assertEquals(game.getCurrentPlayer(), game.getPlayer2());
        game.switchCurrentPlayer();
        assertEquals(game.getCurrentPlayer(), game.getPlayer1());

    }
    @Test
    public void testHasWinner() {
        TicTacToe game = new TicTacToe();
        game.getBoard().place(0,0,'X');
        game.getBoard().place(0,1,'O');
        game.getBoard().place(0,2,'X');
        game.getBoard().place(1,0,'X');
        game.getBoard().place(1,1,'O');
        game.getBoard().place(1,2,'X');
        game.getBoard().place(2,0,'O');
        game.getBoard().place(2,1,'X');
        game.getBoard().place(2,2,'O');
        assertFalse(game.hasWinner());

        game.getBoard().clear();
        game.getBoard().place(0,0,'X');
        game.getBoard().place(0,1,'O');
        game.getBoard().place(0,2,'X');
        game.getBoard().place(1,0,'X');
        game.getBoard().place(1,1,'O');
        game.getBoard().place(1,2,'O');
        game.getBoard().place(2,0,'X');
        game.getBoard().place(2,1,'X');
        game.getBoard().place(2,2,'O');
        assertTrue(game.hasWinner());
    }
}