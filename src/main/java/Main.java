import java.util.List;

public class Main {
    public static void main(String[] args){


        List<Person> people = CRUD.getPerson("select * from person");
        System.out.println(people);


    }
}
