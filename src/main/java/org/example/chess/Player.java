package org.example.chess;

import lombok.Getter;

public class Player {

    @Getter
    int id;
    @Getter
    String name;
    public Player(int id, String name){
        this.id = id;
        this.name = name;
    }
}
