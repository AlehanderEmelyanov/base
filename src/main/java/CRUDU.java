import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDU {

    public static List<PersonData> getPersonU(String query){
        List<PersonData> people = new ArrayList<>();

        try(Connection connection=DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id =resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String gender = resultSet.getString("gender");
                String cyti = resultSet.getString("cyti");

                people.add(new PersonData(id , name , phone , gender ,cyti));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return people;
    }

    public static List<PersonData> createPersonU(PersonData personData){
        List<PersonData> people = new ArrayList<>();

        try(Connection connection=DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlComand.insU);
        ) {
            int c = 1;
            preparedStatement.setInt(c , personData.id);
            c++;
            preparedStatement.setString(c , personData.name);
            c++;
            preparedStatement.setString(c , personData.phone);
            c++;
            preparedStatement.setString(c , personData.gender);
            c++;
            preparedStatement.setString(c , personData.cyti);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return people;
    }

}
