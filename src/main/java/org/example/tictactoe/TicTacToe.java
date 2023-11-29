package org.example.tictactoe;


import java.util.Objects;
import java.util.Stack;

/**
 * REQ
 * 1. Are we going to use AI or 2 players -- > 2 players
 * 2. Are we providing Undo Op --> no but there's list of moves that a user can download with location
 * 3. Are we providing statistics --> no we are not, we can loop back to this in the future
 * 4. Is there a provision for Spectating --> no
 */

public class TicTacToe {

    /**
     * The getMoves method takes in the Player and provides the winning move
     * The previous location is provided that would help in understanding the next moves
     * @param player
     * @param location
     */

    int currentPlayer;
    String[][] board = new String[3][3];
    Stack<Move> moves = new Stack<>();
    public TicTacToe(){
        currentPlayer = 1;
        init();
    }

    private void init(){
        for(int i  = 0 ; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = " ";
            }
        }
    }
    public void getMoves(Move location) throws IllegalArgumentException{
        if(!isValid(location)){
            throw new IllegalArgumentException("Can't move");
        }
        board[location.getX_coordinate()][location.getY_coordinate()] = currentPlayer == 1? "X" : "0";
        currentPlayer = 3 - currentPlayer;
        moves.push(location);
    }

    /**
     * Checks the boundary condition of the matrix
     * @param location
     */
    boolean isValid(Move location){
        if(location.getX_coordinate() < 0 || location.getX_coordinate() > 2 || location.getY_coordinate() < 0 ||
                location.getY_coordinate() > 2 || !Objects.equals(board[location.getX_coordinate()][location.getY_coordinate()], " ")){
            return false;
        }
        return true;
    }

    /**
     * Return the user who has won the match
     * We can check this row-wise, col-wise, diagonal-wise and reverse-diagonal wise
     */
    public String getWinner(){
        String winner = null;
        for(int i = 0; i < board.length; i++){
            if(board[i][0] != " " && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                winner = board[i][1];
            }
            if(board[0][i] != " " && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                winner = board[1][i];
            }
        }
        return winner;
    }

    public void undoMove(){
        Move location = moves.pop();
        board[location.getX_coordinate()][location.getY_coordinate()] = " ";
    }

    public void display(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println("");
        }
    }
}
