import java.util.Random;

public class TicTacToe {
    private Button[][] boards = new Button[3][3];
    private boolean firstPlayer = true;

    Random random = new Random(2);
    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boards[i][j] = Button.EMPTY;
            }
        }

    }

    public void player(){
        if(random.nextInt(2) == 0){
            firstPlayer = true;
        }

        else{
            firstPlayer = false;
        }
    }

    public void playPosition(int position1 , int position2){
        validate(position1);
        validate(position2);
        if(firstPlayer){
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(position1 - 1 == i && position2 - 1 == j && boards[i][j] == Button.EMPTY){
                        boards[i][j] = Button.X;
                    }

                    else{throw new IllegalArgumentException("Space has been taken");}
                }
            }
        }

        else{
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(position1 - 1 == i && position2 - 1 == j && boards[i][j] == Button.EMPTY){
                        boards[i][j] = Button.O;
                    }
                    else{throw new IllegalArgumentException("Space has been taken");}
                }
            }

        }


    }

    private static void validate(int position){
        if(position < 1 || position > 3){
            throw new IllegalArgumentException("Invalid position");
        }



    }

    public String xWins(){
        return "X WINS";
    }

    public void checkWinner(){
        if(boards[0][0] == Button.X && boards[0][1] == Button.X && boards[0][2] == Button.X){
            xWins();
        }
        if(boards[1][0] == Button.X && boards[1][1] == Button.X && boards[1][2] == Button.X){
            xWins();
        }
        if(boards[2][0] == Button.X && boards[2][1] == Button.X && boards[2][2] == Button.X){
            xWins();
        }

        if(boards[0][0] == Button.X && boards[1][0] == Button.X && boards[2][0] == Button.X){
            xWins();
        }

        if(boards[0][1] == Button.X && boards[1][1] == Button.X && boards[2][1] == Button.X){
            xWins();
        }

        if(boards[0][2] == Button.X && boards[1][2] == Button.X && boards[2][2] == Button.X){
            xWins();
        }

        if(boards[0][0] == Button.X && boards[1][1] == Button.X && boards[2][2] == Button.X){
            xWins();
        }

        if(boards[0][2] == Button.X && boards[1][1] == Button.X && boards[2][0] == Button.X){
            xWins();
        }




        if(boards[0][0] == Button.O && boards[0][1] == Button.O && boards[0][2] == Button.O){
            oWins();
        }
        if(boards[1][0] == Button.O && boards[1][1] == Button.O && boards[1][2] == Button.O){
            oWins();
        }
        if(boards[2][0] == Button.O && boards[2][1] == Button.O && boards[2][2] == Button.O){
            oWins();
        }

        if(boards[0][0] == Button.O && boards[1][0] == Button.O && boards[2][0] == Button.O){
            oWins();
        }

        if(boards[0][1] == Button.O && boards[1][1] == Button.O && boards[2][1] == Button.O){
            oWins();
        }

        if(boards[0][2] == Button.O && boards[1][2] == Button.O && boards[2][2] == Button.O){
            oWins();
        }

        if(boards[0][0] == Button.O && boards[1][1] == Button.O && boards[2][2] == Button.O){
            oWins();
        }

        if(boards[0][2] == Button.O && boards[1][1] == Button.O && boards[2][0] == Button.O){
            oWins();
        }
    }

    public String oWins() {
        return "O WINS";
    }
}
