/*
 * класс для работы с таблицой persondata
 * и классом CRUDU
 * @author AlexEm
 * @version 1.0
 *
 * */
public class PersonData {

    int id;
    String name;
    String phone;
    String gender;
    String cyti;

    @Override
    public String toString() {
        return "PersonData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", cyti='" + cyti + '\'' +
                '}';
    }

    public PersonData(){}
    public PersonData(int id, String name, String phone, String gender, String cyti) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.cyti = cyti;
    }
}
