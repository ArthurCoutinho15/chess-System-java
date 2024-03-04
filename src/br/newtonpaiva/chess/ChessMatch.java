package br.newtonpaiva.chess;

import br.newtonpaiva.board.Board;
import br.newtonpaiva.board.Position;
import br.newtonpaiva.chess.pieces.King;
import br.newtonpaiva.chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i< board.getRows(); i++){
            for (int j = 0; j <board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePieces(new Rook(board, Color.WHITE), new Position(0,0));
        board.placePieces(new King(board, Color.BLACK), new Position(0,4));
        board.placePieces(new King(board, Color.WHITE), new Position(7,4));
    }

}
