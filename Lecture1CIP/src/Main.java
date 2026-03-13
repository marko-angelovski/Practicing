//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
void main() {
    long timestamp = System.currentTimeMillis();
    String pathString = "uniqueFile_" + timestamp + ".txt";

    Path filePath = Paths.get(pathString);
    try{
        Files.createFile(filePath);
        System.out.println("Created file: " + filePath );

        File f = new File(pathString);
        System.out.println("Name: " + f.getName());
        System.out.println("Absolute Path: " + f.getAbsolutePath());

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
