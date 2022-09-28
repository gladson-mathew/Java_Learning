
import DBS.DBConnect;
public class Main{
    public static void main(String[] args) {
        System.out.println("test");
        DBConnect db = new DBConnect();
        System.out.println(db.GetIdConcat());   
        
    }
}
