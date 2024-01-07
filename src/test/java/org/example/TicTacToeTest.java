package org.example;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class TicTacToeTest {

    @Test
    public void testStart() {
        String input = "1\n2\n4\n5\n7\nn\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        String lineSeperator = System.lineSeparator();
        String expectedOutput = String.format("|   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler X, bitte wähle eine Zelle (1-9):%s" +
                "1%s" +
                "%s" +
                " X |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler O, bitte wähle eine Zelle (1-9):%s" +
                "2%s" +
                "%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler X, bitte wähle eine Zelle (1-9):%s" +
                "4%s" +
                "%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                " X |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler O, bitte wähle eine Zelle (1-9):%s" +
                "5%s" +
                "%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler X, bitte wähle eine Zelle (1-9):%s" +
                "7%s" +
                "%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                " X |   |  %s" +
                "%s" +
                "Glückwunsch! Spieler X hat gewonnen!%s"+
                "Wollen Sie ein neues Spiel starten? J für Ja / N für Nein",lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator);

        String unexpectedOutput = String.format("|   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler X, bitte wähle eine Zelle (1-9):%s" +
                "1%s" +
                "%s" +
                " X |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler O, bitte wähle eine Zelle (1-9):%s" +
                "2%s" +
                "%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler X, bitte wähle eine Zelle (1-9):%s" +
                "4%s" +
                "%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                " X |   |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler O, bitte wähle eine Zelle (1-9):%s" +
                "5%s" +
                "%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                "   |   |  %s" +
                "%s" +
                "Spieler X, bitte wähle eine Zelle (1-9):%s" +
                "7%s" +
                "%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                " X | O |  %s" +
                "---+---+---%s" +
                " X |   |  %s" +
                "%s" +
                "Glückwunsch! Spieler X hat gewonnen!%s",lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator,lineSeperator);


        TicTacToe game = new TicTacToe();
        game.start();

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
        assertNotEquals(unexpectedOutput, outputStreamCaptor.toString().trim());
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