package org.example.chess.PieceFactory;

public class PieceFactory {
    /**
     * This is the factory to produce desired piece
     */
    public IPiece getPiece(String pieceName){
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
                System.out.println("Invalid choice");
                return null;
            }
        }
    }
}
