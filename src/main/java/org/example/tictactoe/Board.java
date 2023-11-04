package org.example.tictactoe;

public class Board {
    int capacity;
    public Board(int capacity){
        this.capacity = capacity;
    }
    private Character[][] spots;

    public void init(){
        for(int i =0; i < capacity; i++){
            for(int j = 0; j < capacity; j++){
                spots[i][j] = '\0';
            }
        }
    }

    public Character[][] getBoard(){
        return this.spots;
    }
}
