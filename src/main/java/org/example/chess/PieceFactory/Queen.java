package org.example.chess.PieceFactory;

public class Queen implements IPiece{
    @Override
    public IPiece getPiece() {
        return new Queen();
    }
}
