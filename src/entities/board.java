package entities;

public class board {
    public String[][] board=new String[8][8];

    public void iniciador(){
        for (int i=0;i<8;i++) {
            for (int c = 0; c < 8; c++) {
                board[i][c] =" - ";
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        for (int i=0;i<8;i++) {
            for (int c = 0; c < 8; c++) {
                s.append(board[i][c]);
            }
            s.append("\n");
        }
        return s.toString();
    }

}
