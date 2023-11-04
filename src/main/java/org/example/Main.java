package org.example;

import org.example.snakesLadders.Board;
import org.example.snakesLadders.Move;
import org.example.snakesLadders.Player;

import java.util.*;

/**
 * Certainly! Here's a system design interview question related to a chess board:
 *
 * **Design a Snakes and ladders
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Initialize with 2 players
         */
        Player player1 = new Player("Test1", 10);
        Player player2 = new Player("Test2", 8);
        Queue<Player> players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        Board board = new Board(100);
        Move moves = new Move(board, players);

        Map<Integer, Integer> snakes = new HashMap<>();
        snakes.put(50, 35);
        snakes.put(15, 8);
        moves.setSnakes(snakes);

        Map<Integer, Integer> ladder = new HashMap<>();
        ladder.put(5, 13);
        ladder.put(45, 72);
        ladder.put(10, 65);
        moves.setLadder(ladder);

        List<Player> winners = moves.move();
        winners.forEach(e -> System.out.println(e));

    }
}