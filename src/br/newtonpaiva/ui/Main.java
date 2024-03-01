package br.newtonpaiva.ui;

import br.newtonpaiva.board.Board;
import br.newtonpaiva.board.Position;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(8,8);

        System.out.println(board);
    }
}