package br.newtonpaiva.chess.pieces;

import br.newtonpaiva.board.Board;
import br.newtonpaiva.chess.ChessPiece;
import br.newtonpaiva.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
