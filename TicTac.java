import java.util.Arrays;
import java.util.Scanner;

class Board {
    char[][] board = {
            { '*', '*', '*' },
            { '*', '*', '*' },
            { '*', '*', '*' },
    };

    public void displayBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    public boolean placeGamePiece(int row, int col, char key) {
        if (row < 0 || row > 2) {
            System.out.println(" Out of range erorr! ");
            return false;
        }
        if (col < 0 || col > 2) {
            System.out.println(" Out of range erorr! ");
            return false;
        }
        if (board[row][col] == '*') {
            board[row][col] = key;
            return true;
        }

        return false;

    }

    public boolean checkWinner() {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == 'o' && board[row][1] == 'o' && board[row][2] == 'o') {
                System.out.println(" Player 1 wins! ");
                return true;
            } else if (board[row][0] == 'x' && board[row][1] == 'x' && board[row][2] == 'x') {
                System.out.println(" Player 2 wins! ");
                return true;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == 'o' && board[1][col] == 'o' && board[2][col] == 'o') {
                System.out.println(" Player 1 wins! ");
                return true;
            } else if (board[0][col] == 'x' && board[1][col] == 'x' && board[2][col] == 'x') {
                System.out.println(" Player 2 wins! ");
                return true;
            }
        }
        if (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') {
            System.out.println(" Player 1 wins! ");
            return true;
        }
        if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') {
            System.out.println(" Player 2 wins! ");
            return true;
        }
        if (board[2][0] == 'o' && board[1][1] == 'o' && board[0][2] == 'o') {
            System.out.println(" Player 1 wins! ");
            return true;
        }
        return false;

    }
}

public class TicTac {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Board gameBoard = new Board();

        gameBoard.displayBoard();

        int row = 0;
        int col = 0;
        int currentPlayer = 1;
        boolean ret = false;
        int count = 0;

        while (true) {
            clearScreen();
            gameBoard.displayBoard();
            System.out.print(" Enter row col or 'q' to quit");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                System.out.println(" Goodbye!");
                break;
            } else {
                row = in.nextInt();
                col = in.nextInt();

                if (currentPlayer == 1) {
                    ret = gameBoard.placeGamePiece(row, col, 'o');

                } else {
                    ret = gameBoard.placeGamePiece(row, col, 'x');

                }
                if (ret = true) {
                    count++;
                    if (currentPlayer == 1) {
                        currentPlayer = 2;
                    } else {
                        currentPlayer = 1;
                    }

                    if (gameBoard.checkWinner() == true) {
                        gameBoard.displayBoard();
                        break;
                    }

                    if (count == 9) {

                        clearScreen();
                        gameBoard.displayBoard();
                        System.out.println(" No more moves ");
                        break;
                    }
                } else {
                    System.out.println(" Inavlid Move ");
                }

            }

        }
    }
}