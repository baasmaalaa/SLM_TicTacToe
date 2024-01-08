package org.example;

public class Board {
    protected char[][] cells; // zweidimensionale Array von Zeichen, das das Spielfeld darstellt
    public Board() {
        cells = new char[3][3];
        clear();
    }
    public void print() {
        System.out.println();
        int cellNumber = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" ");
                if (cells[i][j] == ' ') {
                    System.out.print(cellNumber);
                } else {
                    System.out.print(cells[i][j]);
                }
                System.out.print(" ");

                if (j < 2) {
                    System.out.print("|");
                }
                cellNumber++;
            }
            System.out.println();

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }

    // Methode, um zu überprüfen, ob eine Zelle leer ist
    public boolean isCellEmpty(int x, int y) {
        // Überprüfe, ob die Zelle ein Leerzeichen enthält
        return cells[x][y] == ' ';
    }

    public void place(int x, int y, char marker) {
        // Setzt das Zeichen in die Zelle
        cells[x][y] = marker;
    }

    // Methode, um zu überprüfen, ob das Spielfeld voll ist
    public boolean isFull() {
        // Durchlaufe alle Zellen des Spielfelds
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Wenn eine Zelle leer ist, ist das Spielfeld nicht voll
                if (isCellEmpty(i, j)) {
                    return false;
                }
            }
        }
        // Alle Zellen sind belegt, das Spielfeld ist voll
        return true;
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