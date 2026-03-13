//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Path filePath = Paths.get("Lecture1CIP/src/binaryData.bin");
    byte[] dataToWrite = {1,2,3,4,'C'};

    try{
        Files.write(filePath,dataToWrite);
        System.out.println("Data written");

        byte[] readData = Files.readAllBytes(filePath);
        System.out.println("Read Data: ");

        for(byte data:readData){
            System.out.print(data+" ");
        }
        System.out.println();


    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
