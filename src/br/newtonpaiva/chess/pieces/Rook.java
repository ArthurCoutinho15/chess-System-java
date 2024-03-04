package br.newtonpaiva.chess.pieces;

import br.newtonpaiva.board.Board;
import br.newtonpaiva.chess.ChessPiece;
import br.newtonpaiva.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
