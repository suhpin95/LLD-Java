package org.example.chess.pieceFactory;

public class Rook implements IPiece {
    @Override
    public IPiece getPiece() {
        return new Rook();
    }
}
