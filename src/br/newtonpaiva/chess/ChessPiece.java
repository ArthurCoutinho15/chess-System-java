package br.newtonpaiva.chess;

import br.newtonpaiva.board.Board;
import br.newtonpaiva.board.Piece;

public class ChessPiece extends Piece {
    private Color color;


    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
