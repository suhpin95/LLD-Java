package org.example.snakesLadders;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Check valid move
 * Keep in mind the snakes and ladder part;
 */
public class Move {

    Map<Integer, Integer> snakes;
    Map<Integer, Integer> ladder;

    Queue<Player> playerList;
    Board board;

    public Move(Board board, Queue players){
        this.playerList = players;
        this.board = board;
    }
    public boolean isValidMove(int location){
        return location < 101 && location >= 0;
    }

    public Player move(){
        AtomicReference<Player> winner = null;
        /**
         * Loop until there's a winner
         */
        while(playerList.size() > 1) {
            Player player = playerList.poll();
            int location = player.getLocation();
            int diceRoll = getNextMove();
            if (snakes.containsKey(location + diceRoll)) {
                location = snakes.get(location + diceRoll);
            }
            if (ladder.containsKey(diceRoll + location)) {
                location = ladder.get(diceRoll + location);
            }
            if (isValidMove(location + diceRoll)) {
                player.setLocation(location + diceRoll);
            }
            if (isWinner(player)) {
                winner.set(player);
                break;
            } else {
                playerList.offer(player);
            }
        }
        return winner.get();
    }

    public int getNextMove(){
        int rollDice = (int) (Math.random() * (6-1)+ 1);
        return rollDice;
    }

    public boolean isWinner(Player player){
        return player.getLocation() == 100 ? true : false;
    }

    public void setSnakes(Map<Integer, Integer> snakes) {
        this.snakes = snakes;
    }

    public void setLadder(Map<Integer, Integer> ladder) {
        this.ladder = ladder;
    }
}
