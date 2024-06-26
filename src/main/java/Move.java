public class Move {

    int id_move;
    int iditems;
    int idperson;

    @Override
    public String toString() {
        return "Move{" +
                "id_move=" + id_move +
                ", iditems=" + iditems +
                ", idperson=" + idperson +
                '}';
    }

    public Move() {
    }

    public Move(int id_move, int iditems, int idperson) {
        this.id_move = id_move;
        this.iditems = iditems;
        this.idperson = idperson;
    }
}
