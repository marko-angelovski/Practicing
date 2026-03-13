import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
void main() {
    Path directoryPath = Paths.get("Lecture1CIP");
    try(Stream<Path> entries = Files.list(directoryPath)){
        if(entries.findFirst().isPresent()){
            System.out.println("Directory is not empty!");
        }else{
            System.out.println("Directory is empty");
        }

    }catch (IOException e){
        e.printStackTrace();
    }
}
