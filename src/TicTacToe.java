import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        while(true) {

            Scanner input = new Scanner(System.in);

            System.out.println("Player 1, enter your placement (1-9): ");
            int player1Position = input.nextInt();
            playMove(gameBoard, player1Position, "Player 1");
            printGameBoard(gameBoard);

            System.out.println("Player 2, enter your placement (1-9): ");
            int player2Position = input.nextInt();
            playMove(gameBoard, player2Position, "Player 2");
            printGameBoard(gameBoard);
        }


    }

    public static void printGameBoard(char[][] gameBoard) {

        for(char[] row : gameBoard) {

            for(char c : row) {

                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void playMove(char[][] gameBoard, int position, String player) {

        char symbol = ' ';
        if(player.equals("Player 1")) {

            symbol = 'X';
        }
        else {

            symbol = 'O';
        }

        switch(position) {

            case 1:
                gameBoard[0][0] = symbol;
                break;

            case 2:
                gameBoard[0][2] = symbol;
                break;

            case 3:
                gameBoard[0][4] = symbol;
                break;

            case 4:
                gameBoard[2][0] = symbol;
                break;

            case 5:
                gameBoard[2][2] = symbol;
                break;

            case 6:
                gameBoard[2][4] = symbol;
                break;

            case 7:
                gameBoard[4][0] = symbol;
                break;

            case 8:
                gameBoard[4][2] = symbol;
                break;

            case 9:
                gameBoard[4][4] = symbol;
                break;
        }
    }
}