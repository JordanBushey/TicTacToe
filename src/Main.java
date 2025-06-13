import java.util.Scanner; //Import Scanner Class for user input

public class Main {
    public static void main(String[] args) {

        //Create the Scanner Object
        Scanner melissa = new Scanner(System.in);
        System.out.println("Enter username:");

        String userName = melissa.nextLine(); // Read User input using scanner object

        System.out.println("Let's Play Tic Tac Toe " + userName + "!");
        System.out.println("Game Board");
        System.out.println("- - -");
        System.out.println("- - -");
        System.out.println("- - -");
        //Create Player 1 - Ask user to input name
        class gameBoard {
            //gameBoard has 9 fields
            public int topLeft;
            public int topMid;
            public int topRight;
            public int midLeft;
            public int midMid;
            public int midRight;
            public int bottomLeft;
            public int bottomMid;
            public int bottomRight;

            //Constructor used to initialize the class
            public gameBoard(int sTopLeft, int sTopMid, int sTopRight,
                             int sMidLeft, int sMidMid, int sMidRight,
                             int sBotRight, int sBotMid, int sBotLeft){
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
            //Methods for the class
            public void setTL(int newValue) {
                topLeft = newValue;
            }


        }

        //Create Player Builder Class

        //Create Game Board
        // 9 objects

        //Method to count turns

        //Create Scoreboard

        //Method to determine winner

        //Method to determine tie


    }
}