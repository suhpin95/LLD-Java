package org.example.chess.pieceFactory;

public class Pawn implements IPiece{
    @Override
    public IPiece getPiece() {
        return new Pawn();
    }
}
