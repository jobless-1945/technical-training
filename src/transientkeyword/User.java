package transientkeyword;
import java.io.*;

//To achieve serialization we implement the serialization interface
public class User implements Serializable{
    String usnm="Vyshnav";
    transient  String pass="12345";
}
class TransientDemo{
    public static void main(String[] args) throws Exception{
        User user=new User();
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("user.ser"));
        os.writeObject(user);
        os.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("user.ser"));
        User user1=(User)ois.readObject();
        System.out.println(user1.usnm);
        System.out.println(user1.pass);
    }
}
