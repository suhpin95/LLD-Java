package org.example.chess.pieceFactory;

public class PieceFactory {
    /**
     * Returns the type of piece
     * @param pieceName
     * @return
     */
    public IPiece getPiece(String pieceName) throws IllegalArgumentException{
        switch (pieceName.toLowerCase()) {
            case "rook" -> {
                return new Rook();
            }
            case "queen" -> {
                return new Queen();
            }
            case "king" -> {
                return new King();
            }
            case "pawn" -> {
                return new Pawn();
            }
            case "bishop" -> {
                return new Bishop();
            }
            default -> {
                throw new IllegalArgumentException("This Piece doesn't exists in chess");
            }
        }
    }
}
