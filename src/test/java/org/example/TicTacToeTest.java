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
    }
}