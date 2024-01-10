package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void testPrint() {
        // Arrange
        Board board = new Board();
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        board.print();

        // Assert
        String lineSeperator = System.lineSeparator();
        String expectedOutput = String.format("1 | 2 | 3 %s---+---+---%s 4 | 5 | 6 %s---+---+---%s 7 | 8 | 9",lineSeperator,lineSeperator,lineSeperator,lineSeperator);
        String unExpectedOutput = String.format(" |   |  %s---+---+---%s   |    |  %s---+---+---%s   |   |",lineSeperator,lineSeperator,lineSeperator,lineSeperator);
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
        assertNotEquals(unExpectedOutput,outputStreamCaptor.toString().trim());

        // Reset System.out to its original state
        //System.setOut(System.out);
    }


    @Test
    public void testIsCellEmpty() {
        // Arrange
        Board board = new Board();
        // Act & Assert
        assertTrue(board.isCellEmpty(0, 0));
        assertTrue(board.isCellEmpty(1, 2));
    }

    @Test
    public void testPlace() {
        Board board = new Board();
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        board.place(0,1,'X');
        board.print();

        // Assert
        String lineSeperator = System.lineSeparator();
        String expectedOutput = String.format("1 | X | 3 %s---+---+---%s 4 | 5 | 6 %s---+---+---%s 7 | 8 | 9",lineSeperator,lineSeperator,lineSeperator,lineSeperator);
        String unExpectedOutput = String.format("| O |  %s---+---+---%s   |   |  %s---+---+---%s   |   |",lineSeperator,lineSeperator,lineSeperator,lineSeperator);
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
        assertNotEquals(unExpectedOutput,outputStreamCaptor.toString().trim());

    }

    @Test
    public void testIsFull() {
        Board board = new Board();
        assertFalse(board.isFull());

        board.place(0,0,'X');
        board.place(0,1,'O');
        board.place(0,2,'X');
        board.place(1,0,'X');
        board.place(1,1,'O');
        board.place(1,2,'X');
        board.place(2,0,'O');
        board.place(2,1,'X');
        board.place(2,2,'O');
        assertTrue(board.isFull());

    }

    @Test
    public void testClear() {
        Board board = new Board();

        board.place(0,0,'X');
        board.place(0,1,'O');
        board.place(0,2,'X');
        board.place(1,0,'X');
        board.place(1,1,'O');
        board.place(1,2,'X');
        board.place(2,0,'O');
        board.place(2,1,'X');
        board.place(2,2,'O');
        board.clear();
        assertFalse(board.isFull());

    }
}