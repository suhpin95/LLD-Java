package org.example.chess;

import java.util.List;

public class Chess {
    /**
     * has a Board
     * Boards are made up of cells
     * Each cell has a Piece --> Factory pattern
     * Pieces can move --> Strategy Pattern
     *
     */
    Cells[][] cells;
    List<Player> players;

}
