//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Student s = new Student(6078,1234,"+38978328568","Marko");
    StudentFileStream sf = new StudentFileStream();
    System.out.println("Before serialization!");
    sf.printData(s);

    try{
        sf.writeToFile(s,"student.txt");
        Student news = sf.readFromFile("student.txt");
        System.out.println("After serialization");
        sf.printData(news);

    } catch (IOException | ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
}
