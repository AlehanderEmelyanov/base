public class sqlComand {
    public static String insP = "insert into person(email , pasword) values(?,?);";
    public static String upPe = "update person set email = ? where id = ?";
    public static String delP = "delete from person where id = ?;";
    public static String insU = "insert into person(id , name , phone , gender , cyti) values(? , ? , ? , ? , ?);";
}
