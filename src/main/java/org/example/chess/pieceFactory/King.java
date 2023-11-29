package org.example.chess.pieceFactory;

public class King implements IPiece{
    @Override
    public IPiece getPiece() {
        return new King();
    }
}
