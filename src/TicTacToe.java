import java.util.Scanner;

public class TicTacToe {

    static boolean noWinner = true;
    static String theWinner = "";

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        while(noWinner == true) {

            Scanner input = new Scanner(System.in);

            System.out.println("Player 1, enter your placement (1-9): ");
            int player1Position = input.nextInt();
            playMove(gameBoard, player1Position, "Player 1");
            checkForWinner(gameBoard);

            System.out.println("Player 2, enter your placement (1-9): ");
            int player2Position = input.nextInt();
            playMove(gameBoard, player2Position, "Player 2");
            checkForWinner(gameBoard);
        }
        System.out.println("The winner is " + theWinner);
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
        printGameBoard(gameBoard);
    }

    public static void checkForWinner(char[][] gameBoard) {

        /*
        * H: horizontal line
        * V: vertical line
        * D: diagonal line
        */

        if(gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') { //H1

            noWinner = false;
            theWinner = "Player 1";
        }
        else if(gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') { //H2

            noWinner = false;
            theWinner = "Player 1";
        }

        else if(gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X') { //H3

            noWinner = false;
            theWinner = "Player 1";
        }

        else if(gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X') { //V1

            noWinner = false;
            theWinner = "Player 1";
        }

        else if(gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X') { //V2

            noWinner = false;
            theWinner = "Player 1";
        }

        else if(gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X') { //V3

            noWinner = false;
            theWinner = "Player 1";
        }

        else if(gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X') { //D1

            noWinner = false;
            theWinner = "Player 1";
        }

        else if(gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X') { //D2

            noWinner = false;
            theWinner = "Player 1";
        }

        else if(gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') { //H1

            noWinner = false;
            theWinner = "Player 2";
        }
        else if(gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') { //H2

            noWinner = false;
            theWinner = "Player 2";
        }

        else if(gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4] == 'O') { //H3

            noWinner = false;
            theWinner = "Player 2";
        }

        else if(gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0] == 'O') { //V1

            noWinner = false;
            theWinner = "Player 2";
        }

        else if(gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O') { //V2

            noWinner = false;
            theWinner = "Player 2";
        }

        else if(gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4] == 'O') { //V3

            noWinner = false;
            theWinner = "Player 2";
        }

        else if(gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O') { //D1

            noWinner = false;
            theWinner = "Player 2";
        }

        else if(gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O') { //D2

            noWinner = false;
            theWinner = "Player 2";
        }
    }
}