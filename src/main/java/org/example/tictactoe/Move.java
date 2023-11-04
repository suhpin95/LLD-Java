package org.example.tictactoe;

public class Move {

    int capacity;
    Board board;
    int player;
    public Move(int capacity, Board board){
        this.capacity = capacity;
        this.board = board;
        this.player = 1;
    }
    public boolean isValid(int row, int col){
        return (row >= 0 || row < capacity || col >= 0 || col < capacity) && board.getBoard()[row][col] != '\0';
    }

    public void movePiece(int row, int col){
        if(isValid(row, col)){
            // perform operation
            this.board.getBoard()[row][col] = player == 1 ? 'X' : 'O';
            player = 3 - player;
        } else {
            // we can't move ahead
            System.out.println("In Valid move");
        }
    }

    public boolean checkWinner(){
        // check the + diag
        // check the - diag

        for(int row = 0; row < capacity; row++){
            if(board.getBoard()[row][0] == board.getBoard()[row][1] && board.getBoard()[row][2] == board.getBoard()[row][1]){
                return true;
            }
        }

        for(int col = 0; col < capacity; col++){
            if(board.getBoard()[0][col] == board.getBoard()[1][col] && board.getBoard()[1][col] == board.getBoard()[col][2]){
                return true;
            }
        }

        if(board.getBoard()[2][0] == board.getBoard()[1][1] && board.getBoard()[1][1] == board.getBoard()[0][2]){
            return true;
        }
        if(board.getBoard()[0][0] == board.getBoard()[1][1] && board.getBoard()[2][2] == board.getBoard()[1][1]){
            return true;
        }
        return false;
    }
}
