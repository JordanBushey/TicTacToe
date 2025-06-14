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

    public void setTM(char newValue) {
        topMid = newValue;
    }

    public String getTopLeft() {
        return Character.toString(topLeft);
    }

    public String getTopMid() {
        return Character.toString(topMid);
    }

    public String getTopRight() {
        return Character.toString(topRight);
    }

    public String getMidLeft() {
        return Character.toString(midLeft);
    }

    public String getMidMid() {
        return Character.toString(midMid);
    }

    public String getMidRight() {
        return Character.toString(midRight);
    }

    public String getBottomLeft() {
        return Character.toString(bottomLeft);
    }

    public String getBottomMid() {
        return Character.toString(bottomMid);
    }

    public String getBottomRight() {
        return Character.toString(bottomRight);
    }


}
