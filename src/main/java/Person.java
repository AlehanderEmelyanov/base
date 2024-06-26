/*
 * класс для работы с таблицой person
 * и классом CRUD
 * @author AlexEm
 * @version 1.0
 *
 * */
public class Person {
    int id=2;
    String email;
    String pasword;


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pasword='" + pasword + '\'' +
                '}';
    }

    public Person(){}
    public Person(int id, String email, String pasword) {
        this.id = id;
        this.email = email;
        this.pasword = pasword;
    }
}
