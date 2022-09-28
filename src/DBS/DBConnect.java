package DBS;
public class DBConnect{
    int id;
    String DBName;

    public DBConnect(){
        id = 5;
        DBName = "Tesla";
    }
    public String GetIdConcat(){
        return DBName+id;
    }
}