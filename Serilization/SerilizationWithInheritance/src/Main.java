//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ChildClass childClass = new ChildClass();
    childClass.setProductId(6099);
    childClass.setProduct("Book");
    childClass.setBrand("UACS");
    String fileName ="obj.txt";
    System.out.println(childClass);

    try {
        SerilizationLib.writeObject(childClass, fileName);
        System.out.println("Object serialized");
        ChildClass ncc = (ChildClass) SerilizationLib.readObject(fileName);
        System.out.println("After serialization!");
        System.out.println(ncc);

    } catch (IOException | ClassNotFoundException e) {
        throw new RuntimeException(e);
    }


}
