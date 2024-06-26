import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDMove {
    public static List<Move> create(Move move){
        List<Move> moves = new ArrayList<>();

        try(Connection connection=DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlComand.insM);
        ) {
            int c = 1;
            preparedStatement.setInt(c , move.iditems);
            c++;
            preparedStatement.setInt(c , move.idperson);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return moves;

    }
}
