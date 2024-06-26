import java.util.List;

public class Main {
    public static void main(String[] args){


        Move move = new Move();

        move.iditems=1;
        move.idperson=3;

        CRUDMove.create(move);
    }
}
