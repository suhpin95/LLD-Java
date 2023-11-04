package org.example.snakesLadders;

import java.util.ArrayList;
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

    public List<Player> move() {
        List<Player> winners = new ArrayList<>();

        while (winners.isEmpty()) {
            for (Player player : playerList) {
                int location = player.getLocation();
                int diceRoll = getNextMove();

                if (snakes.containsKey(location + diceRoll)) {
                    location = snakes.get(location + diceRoll);
                } else if (ladder.containsKey(location + diceRoll)) {
                    location = ladder.get(location + diceRoll);
                } else if (isValidMove(location + diceRoll)) {
                    location += diceRoll;
                }

                player.setLocation(location);

                if (isWinner(player)) {
                    winners.add(player);
                }
            }
        }

        return winners;
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
