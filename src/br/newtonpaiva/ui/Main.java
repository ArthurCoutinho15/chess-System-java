package br.newtonpaiva.ui;

import br.newtonpaiva.board.Board;
import br.newtonpaiva.board.Position;
import br.newtonpaiva.chess.ChessMatch;
import br.newtonpaiva.chess.ChessPiece;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}