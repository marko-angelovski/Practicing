import java.io.*;

public class SerilizationLib {
    public static void writeObject(Object obj,String fileName) throws IOException {
        FileOutputStream fileInputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        fileInputStream.close();
    }
    public static Object readObject(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object obj = new Object();
        obj = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        return obj;


    }
}
