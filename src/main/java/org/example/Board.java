package org.example;

public class Board {
    protected char[][] cells; // zweidimensionale Array von Zeichen, das das Spielfeld darstellt
    public Board() {
        cells = new char[3][3];
    }
    public void print() {
        System.out.println();
        System.out.println(" " + cells[0][0] + " | " + cells[0][1] + " | " + cells[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + cells[1][0] + " | " + cells[1][1] + " | " + cells[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + cells[2][0] + " | " + cells[2][1] + " | " + cells[2][2]);
        System.out.println();
    }
}