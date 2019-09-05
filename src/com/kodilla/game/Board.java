package com.kodilla.game;

import java.util.ArrayList;

public class Board {
    ArrayList<Symbol> board;

    public ArrayList<Symbol> getBoard() {
        return board;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Board)) return false;

        Board board1 = (Board) o;

        return board != null ? board.equals(board1.board) : board1.board == null;
    }

    @Override
    public int hashCode() {
        return board != null ? board.hashCode() : 0;
    }

    public void createBoard() {
        board = new ArrayList<>();
        board.add(new Blank());
        board.add(new Blank());
        board.add(new Blank());
        board.add(new Blank());
        board.add(new Blank());
        board.add(new Blank());
        board.add(new Blank());
        board.add(new Blank());
        board.add(new Blank());

    }

    public void nextMove(int place, Symbol symbol) {
        if(board.get(place) == Blank()) {
            board.set(place, symbol);
        } else {
            System.out.println("Move not allowed, this place is already taken. Please, choose other place.");
        }
    }

    public void checkIfVictory() {
        if((board.get(0) == Cross() && board.get(1) == Cross() && board.get(2) == Cross()) ||
                (board.get(3) == Cross() && board.get(4) == Cross() && board.get(5) == Cross()) ||
                (board.get(6) == Cross() && board.get(7) == Cross() && board.get(2) == Cross()) ||
                (board.get(0) == Cross() && board.get(3) == Cross() && board.get(6) == Cross()) ||
                (board.get(1) == Cross() && board.get(4) == Cross() && board.get(7) == Cross()) ||
                (board.get(2) == Cross() && board.get(5) == Cross() && board.get(8) == Cross()) ||
                        (board.get(0) == Cross() && board.get(4) == Cross() && board.get(8) == Cross()) ||
                        (board.get(2) == Cross() && board.get(4) == Cross() && board.get(6) == Cross()) ||

                        (board.get(0) == Circle() && board.get(1) == Circle() && board.get(2) == Circle()) ||
                        (board.get(3) == Circle() && board.get(4) == Circle() && board.get(5) == Circle()) ||
                        (board.get(6) == Circle() && board.get(7) == Circle() && board.get(2) == Circle()) ||
                        (board.get(0) == Circle() && board.get(3) == Circle() && board.get(6) == Circle()) ||
                        (board.get(1) == Circle() && board.get(4) == Circle() && board.get(7) == Circle()) ||
                        (board.get(2) == Circle() && board.get(5) == Circle() && board.get(8) == Circle()) ||
                        (board.get(0) == Circle() && board.get(4) == Circle() && board.get(8) == Circle()) ||
                        (board.get(2) == Circle() && board.get(4) == Circle() && board.get(6) == Circle())) {

            //here comes the code if someone won
        }

    }
}
