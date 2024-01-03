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
        String expectedOutput = String.format("|   |  %s---+---+---%s   |   |  %s---+---+---%s   |   |",lineSeperator,lineSeperator,lineSeperator,lineSeperator);
        String unExpectedOutput = String.format("|   |  %s---+---+---%s   |    |  %s---+---+---%s   |   |",lineSeperator,lineSeperator,lineSeperator,lineSeperator);
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
    }

    @Test
    public void testIsFull() {
    }

    @Test
    public void testClear() {
    }
}