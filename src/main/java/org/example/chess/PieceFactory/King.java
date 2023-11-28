package org.example.chess.PieceFactory;

public class King implements IPiece{
    @Override
    public IPiece getPiece() {
        return new King();
    }
}
