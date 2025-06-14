import java.util.Scanner; //Import Scanner Class for user input

public class Main {
    public static void main(String[] args) {

        //Create the Scanner Object
        Scanner scanner = new Scanner(System.in);

        //  String userName = scanner.nextLine(); // Read User input using scanner object

        //Initialize the board
        GameBoard gameBoard = new GameBoard();

        gameBoard.getBoard();

        gameBoard.topLeft = '~';
        gameBoard.topMid = '~';
        gameBoard.topRight ='~';
        gameBoard.midLeft ='~';
        gameBoard.midMid ='~';
        gameBoard.midRight ='~';
        gameBoard.bottomLeft ='~';
        gameBoard.bottomMid ='~';
        gameBoard.bottomRight ='~';

        gameBoard.getBoard();

        gameBoard.getBoard();

        String turnOne = scanner.nextLine();

        gameBoard.userOneTurn(turnOne);

        gameBoard.getBoard();

        //Create a 2 users and method for X or O

        //Create Player Builder Class

        //Create Game Board
        // 9 objects

        //Method to count turns

        //Create Scoreboard

        //Method to determine winner

        //Method to determine tie


    }
}