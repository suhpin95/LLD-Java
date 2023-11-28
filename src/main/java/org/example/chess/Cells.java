package org.example.chess;


import lombok.Getter;

public class Cells {
    @Getter
    private int X;
    @Getter
    private int Y;

    public Cells(int X, int Y){
        this.X = X;
        this.Y = Y;
    }
}
