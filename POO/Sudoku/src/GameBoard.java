import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    List<List<Space>> gameBoard;

    public GameBoard() {
        this.gameBoard = new ArrayList<>();
    }

    public void teste(){
        gameBoard.get(0).add(new Space());
    }

    /*
        5 3 . | . 7 . | . . .
        6 . . | 1 9 5 | . . .
        . 9 8 | . . . | . 6 .
        ------+-------+------
        8 . . | . 6 . | . . 3
        4 . . | 8 . 3 | . . 1
        7 . . | . 2 . | . . 6
        ------+-------+------
        . 6 . | . . . | 2 8 .
        . . . | 4 1 9 | . . 5
        . . . | . 8 . | . 7 9

     */
}
