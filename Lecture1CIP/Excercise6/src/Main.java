//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Path filePath = Paths.get("Lecture1CIP/src/binaryData.bin");
    String textToAppend = "FUUUUNN";
    try {
        Files.write(filePath,textToAppend.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        System.out.println("Appended");

    }catch (IOException e){
        e.printStackTrace();
    }
}
