package org.example.chess.pieceFactory;

public class Queen implements IPiece{
    @Override
    public IPiece getPiece() {
        return new Queen();
    }
}
