package org.example;

import java.util.Scanner;

public class TicTacToe {

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public void start() {
        Scanner in = new Scanner(System.in);

        while (!hasWinner() && !board.isFull()) {
            board.print();
            System.out.println("Spieler " + currentPlayer.getMarker() + ", bitte wähle eine Zelle (1-9):");

            int input = 0;
            try {
                String s = in.nextLine();

                input = Integer.parseInt(s);
                System.out.println(input);

            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte gib eine Zahl zwischen 1 und 9 ein.");
                continue;
            }
        }
    }

    public void switchCurrentPlayer() {
        // Wenn der aktuelle Spieler der erste Spieler ist, wird es auf den zweiten Spieler gesetzt
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            // Wenn der aktuelle Spieler der zweite Spieler ist, wird es auf den ersten Spieler gesetzt
            currentPlayer = player1;
        }
    }

    public boolean hasWinner() {
        // Überprüft, ob es eine horizontale, vertikale oder diagonale Reihe von drei gleichen Zeichen gibt
        for (int i = 0; i < 3; i++) {
            // Horizontale Reihe
            if (board.cells[i][0] != ' ' && board.cells[i][0] == board.cells[i][1] && board.cells[i][0] == board.cells[i][2]) {
                return true;
            }
            // Vertikale Reihe
            if (board.cells[0][i] != ' ' && board.cells[0][i] == board.cells[1][i] && board.cells[0][i] == board.cells[2][i]) {
                return true;
            }
        }
        // Diagonale Reihe
        if (board.cells[0][0] != ' ' && board.cells[0][0] == board.cells[1][1] && board.cells[0][0] == board.cells[2][2]) {
            return true;
        }

        if (board.cells[0][2] != ' ' && board.cells[0][2] == board.cells[1][1] && board.cells[0][2] == board.cells[2][0]) {
            return true;
        }
        return false; //wenn kein Gewinner gibt
    }

}