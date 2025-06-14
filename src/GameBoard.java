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

    //Constructor used to initialize the class
    private void gameBoard(char sTopLeft, char sTopMid, char sTopRight,
                     char sMidLeft, char sMidMid, char sMidRight,
                     char sBotRight, char sBotMid, char sBotLeft){
        topLeft = sTopLeft;
        topMid = sTopMid;
        topRight =sTopRight;
        midLeft = sMidLeft;
        midMid = sMidMid;
        midRight = sMidRight;
        bottomLeft = sBotLeft;
        bottomMid = sBotMid;
        bottomRight = sBotRight;
    }

    public void userOneTurn(String newValue) {
        if (newValue.equals("Top Left")){
            topLeft = 'X';
        } else if (newValue.equals("Top Middle")){
            topMid = 'X';
        } else {
            System.err.println("This is not an option orrrrr maybe I broke it :(");
        }
    }

    //Methods for the class to obtain the field values
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
