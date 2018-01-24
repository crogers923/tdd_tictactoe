public class TicTacToeSolved {
    protected static int size = 9;
    protected char[] board;

    public char[] getBoard() {
        return board;
    }


    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        TicTacToeSolved.size = size;
    }

    public TicTacToeSolved() {
        board = new char[getSize()];
    }

    public boolean boardSpaceIsBlank(){
        boolean isBlank = true;
        return isBlank;
    }

    public boolean boardSpaceIsFilled(){
        boolean isFilled = true;
        return isFilled;
    }

    public void playToken(char token) throws Exception{
        if(token!='X' || token!='Y'){
            throw new Exception();
        }
    }

    public char[] placeTokenInSpace(char token, int spacePosition){
        char[] array = new char[spacePosition+1];
        array[spacePosition] = token;
        return array;
    }

    public void placeTokenInSpace_Refactored(char token, int spacePosition){
        board[spacePosition] = token;
    }

    public boolean isBoardFull(){
        for(int i = 0; i<size; i++){
            if(board[i]==0){
                return false;
            }
        }
        return true;
    }
}
