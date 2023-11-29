package org.example;

import org.example.tictactoe.Move;
import org.example.tictactoe.TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Move move = new Move();

        /**
         * 0| ""| ""
         * X| 0 | ""
         * X| ""| 0
         */
        try{
            move.setX_coordinate(0);
            move.setY_coordinate(0);
            game.getMoves(move);

            move.setX_coordinate(2);
            move.setY_coordinate(2);
            game.getMoves(move);

            move.setX_coordinate(1);
            move.setY_coordinate(0);
            game.getMoves(move);

            move.setX_coordinate(1);
            move.setY_coordinate(1);
            game.getMoves(move);

            move.setX_coordinate(2);
            move.setY_coordinate(0);
            game.getMoves(move);

            move.setX_coordinate(0);
            move.setY_coordinate(2);
            game.getMoves(move);

            game.display();


            int player = game.getWinner() == "X" ? 1 : 2;
            System.out.println("Winner is:-"+player);

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}