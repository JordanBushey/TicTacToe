public class GameBoard {
    //gameBoard has 9 fields

   // public char[] boardArray =  {
   //         '~', '~', '~', '~', '~', '~', '~', '~', '~'
   // };

    public char topLeft;
    public char topMid;
    public char topRight;
    public char midLeft;
    public char midMid;
    public char midRight;
    public char bottomLeft;
    public char bottomMid;
    public char bottomRight;
    public boolean isWinner;

    //Constructor used to initialize the class
    private void gameBoard(char sTopLeft, char sTopMid, char sTopRight,
                     char sMidLeft, char sMidMid, char sMidRight,
                     char sBotRight, char sBotMid, char sBotLeft, boolean sIsWinner ){
        topLeft = sTopLeft;
        topMid = sTopMid;
        topRight =sTopRight;
        midLeft = sMidLeft;
        midMid = sMidMid;
        midRight = sMidRight;
        bottomLeft = sBotLeft;
        bottomMid = sBotMid;
        bottomRight = sBotRight;
        isWinner = sIsWinner;
    }

    public void userOneTurn(String newValue) {
        if (newValue.equals("TL")){
            topLeft = 'X';
        } else if (newValue.equals("TM") && !Character.toString(topMid).equals("O")){
            topMid = 'X';
        } else if (newValue.equals("TR")) {
            topRight = 'X';
        }else if (newValue.equals("Middle Left")) {
            midLeft = 'X';
        }else if (newValue.equals("Middle Middle")) {
            midMid = 'X';
        }else if (newValue.equals("Middle Right")) {
            midRight = 'X';
        }else if (newValue.equals("Bottom Left")) {
            bottomLeft = 'X';
        }else if (newValue.equals("Bottom Middle")) {
            bottomMid = 'X';
        }else if (newValue.equals("Bottom Right")) {
            bottomRight = 'X';
        }else {
            System.err.println("This is not an option orrrrr maybe I broke it :(");
        }
    }

    public void userTwoTurn(String newValue) {
        if (newValue.equals("TL")){
            topLeft = 'O';
        } else if (newValue.equals("TM") && !Character.toString(topMid).equals("X")){
            topMid = 'O';
        } else if (newValue.equals("TR")) {
            topRight = 'O';
        }else if (newValue.equals("ML")) {
            midLeft = 'O';
        }else if (newValue.equals("MM")) {
            midMid = 'O';
        }else if (newValue.equals("MR")) {
            midRight = 'O';
        }else if (newValue.equals("Bottom Left")) {
            bottomLeft = 'O';
        }else if (newValue.equals("Bottom Middle")) {
            bottomMid = 'O';
        }else if (newValue.equals("Bottom Right")) {
            bottomRight = 'O';
        }else {
            System.err.println("This is not an option orrrrr maybe I broke it :(");
        }
    }

    public boolean checkWinner(boolean newValue) {
        boolean lWinner = newValue;
        if (Character.toString(topLeft).equals(Character.toString(topMid)) && Character.toString(topMid).equals(Character.toString(topRight)) && Character.toString(topLeft).equals("X")){
            System.out.println("Player X is the winner!");
            isWinner = true;
            return isWinner;
        }
    }    //Methods for the class to obtain the field values
    public void setTL(char newValue) {
        topLeft = newValue;
    }

    public void setTM(char newValue) {
        topMid = newValue;
    }

    public void getBoard() {
        System.out.println(Character.toString(topLeft) + '|' + Character.toString(topMid) + '|' + Character.toString(topRight));
//        System.out.println("______");
        System.out.println(Character.toString(midLeft) + '|' + Character.toString(midMid) + '|' + Character.toString(midRight));
//        System.out.println("______");
        System.out.println(Character.toString(bottomLeft) + '|' + Character.toString(bottomMid) + '|' + Character.toString(bottomRight));
        System.out.println("Select an available option.");
        System.out.println("Top Right | Top Middle | Top Left");
    }

}
