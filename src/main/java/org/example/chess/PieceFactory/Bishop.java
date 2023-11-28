package org.example.chess.PieceFactory;

public class Bishop implements IPiece {
    @Override
    public IPiece getPiece() {
        return new Bishop();
    }
}
