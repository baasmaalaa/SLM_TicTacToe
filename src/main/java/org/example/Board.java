package org.example;

public class Board {
    protected char[][] cells; // zweidimensionale Array von Zeichen, das das Spielfeld darstellt
    public Board() {
        cells = new char[3][3];
        clear();
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
    public void clear() {
        // Durchlaufe alle Zellen des Spielfelds
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Setze jede Zelle auf ein Leerzeichen
                cells[i][j] = ' ';
            }
        }
    }
}