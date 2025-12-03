import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String phoneNum;
    int indexNum;
    transient int recordNum;

    public Student(int indexNum, int recordNum, String phoneNum, String name) {
        this.indexNum = indexNum;
        this.recordNum = recordNum;
        this.phoneNum = phoneNum;
        this.name = name;
    }
    public Student(){

    }
}
