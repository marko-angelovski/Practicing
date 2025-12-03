import java.io.*;

public class StudentFileStream {
    public void printData(Student student){

            System.out.println("Student Details:");
            System.out.println("----------------");
            System.out.println("Name       : " + student.name);
            System.out.println("Phone      : " + student.phoneNum);
            System.out.println("Index No   : " + student.indexNum);
            System.out.println("Record No  : " + student.recordNum);
            System.out.println();

    }
    public void writeToFile(Student student, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student) ;
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("File saved");



    }
    public Student readFromFile(String fileName) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student s = (Student) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();


        return s;

    }
}
