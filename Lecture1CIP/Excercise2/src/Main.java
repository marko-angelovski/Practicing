import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
void main() {
    Path filePath = Paths.get("Lecture1CIP/src/example.txt");
    try{
        List<String> lines = Files.readAllLines(filePath);
        System.out.println("Number of liens: " + lines.size());
    } catch (IOException e) {
        throw new RuntimeException(e);
    }


}
