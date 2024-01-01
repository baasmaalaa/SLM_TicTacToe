package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void print() {
        // Arrange
        Board board = new Board(); // Replace YourClass with the actual class name
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        board.print();

        // Assert
        String expectedOutput = "|   |  \n---+---+---\n   |   |  \n---+---+---\n   |   |";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());

        // Reset System.out to its original state
        System.setOut(System.out);
    }

    @Test
    public void isCellEmpty() {
        // Arrange
        Board board = new Board(); // Replace YourClass with the actual class name

        // Act & Assert
        assertTrue(board.isCellEmpty(0, 0));
        assertTrue(board.isCellEmpty(1, 2));
    }

    @Test
    public void place() {
    }

    @Test
    public void isFull() {
    }

    @Test
    public void clear() {
    }
}