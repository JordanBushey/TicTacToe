public class GameBoard {
    //gameBoard has 9 fields
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

    //Methods for the class to obtain the field values
    public void setTL(char newValue) {
        topLeft = newValue;
    }

    public String getTopLeft() {
        String dTopLeft = Character.toString(topLeft);
        return dTopLeft;
    }

    public String getTopMid() {
        String dTopMid = Character.toString(topMid);
        return dTopMid;
    }


}
