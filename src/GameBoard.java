import javax.swing.*;

public class GameBoard {

    public char[] boardSquares;
    public boolean isWinner;
    public int player;


    //Constructor used to initialize the class
    public GameBoard() {
        boardSquares = new char[9];
        for (int i = 0; 9 > i; i++) {
            boardSquares[i] = '*';
        }
        isWinner = false;
        player = 1;
    }

    public void resetBoard() {
        boardSquares = new char[9];
        for (int i = 0; 9 > i; i++) {
            boardSquares[i] = '*';
        }
        isWinner = false;
        player = 1;
    }

    public char getBoardSquare(int index){
        return boardSquares[index];
    }

    public void setBoardSquares(int index, String newValue) {
        boardSquares[index] = newValue.charAt(0);
    }

    public int getPlayer() {
        return player;
    }

    public void switchPlayer() {
        if (player == 1) {
            player = 2;
        } else player = 1;
    }

    public void checkWinner() {
        if (boardSquares[0] == boardSquares[1] && boardSquares[1] == boardSquares[2] && !Character.toString(getBoardSquare(0)).equals("*")) {
            isWinner = true;
        } else if (boardSquares[0] == boardSquares[3] && boardSquares[3] == boardSquares[6] && !Character.toString(getBoardSquare(6)).equals("*")) {
            isWinner = true;
        } else if (boardSquares[0] == boardSquares[4] && boardSquares[4] == boardSquares[8] && !Character.toString(getBoardSquare(8)).equals("*")) {
            isWinner = true;
        }else if (boardSquares[3] == boardSquares[4] && boardSquares[4] == boardSquares[5] && !Character.toString(getBoardSquare(5)).equals("*")) {
            isWinner = true;
        }else if (boardSquares[6] == boardSquares[7] && boardSquares[7] == boardSquares[8] && !Character.toString(getBoardSquare(8)).equals("*")) {
            isWinner = true;
        }else if (boardSquares[1] == boardSquares[4] && boardSquares[4] == boardSquares[7] && !Character.toString(getBoardSquare(7)).equals("*")) {
            isWinner = true;
        }else if (boardSquares[2] == boardSquares[5] && boardSquares[5] == boardSquares[8] && !Character.toString(getBoardSquare(8)).equals("*")) {
            isWinner = true;
        }else if (boardSquares[2] == boardSquares[4] && boardSquares[4] == boardSquares[6] && !Character.toString(getBoardSquare(6)).equals("*")) {
            isWinner = true;
        }else {isWinner = false;}
    }

}
