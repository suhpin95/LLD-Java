package org.example.chess.PieceFactory;

public class Rook implements IPiece {
    @Override
    public IPiece getPiece() {
        return new Rook();
    }
}
