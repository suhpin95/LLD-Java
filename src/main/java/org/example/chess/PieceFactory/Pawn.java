package org.example.chess.PieceFactory;

public class Pawn implements IPiece{
    @Override
    public IPiece getPiece() {
        return new Pawn();
    }
}
