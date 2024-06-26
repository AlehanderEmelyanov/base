import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD {



    public static List<Person> getPerson(String query){
        List<Person> people = new ArrayList<>();

        try(Connection connection=DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id =resultSet.getInt("id");
                String email = resultSet.getString("email");
                String pasword = resultSet.getString("pasword");

                people.add(new Person(id , email , pasword));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return people;
    }

    public static List<Person> create(Person person){
        List<Person> people = new ArrayList<>();

        try(Connection connection=DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlComand.insP);
        ) {
            int c = 1;
            preparedStatement.setString(c , person.email);
            c++;
            preparedStatement.setString(c , person.pasword);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return people;

    }

    public static List<Person> updatPe(int id , String email){
        List<Person> people = new ArrayList<>();

        try(Connection connection=DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlComand.upPe);
        ) {

            preparedStatement.setString(1 , email);
            preparedStatement.setInt(2 ,id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return people;
    }

    public static void delete(int id){

        try(Connection connection=DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlComand.delP);
        ) {


            preparedStatement.setInt(1 ,id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



}
