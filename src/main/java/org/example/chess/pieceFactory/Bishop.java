package org.example.chess.pieceFactory;

public class Bishop implements IPiece {
    @Override
    public IPiece getPiece() {
        return new Bishop();
    }
}
