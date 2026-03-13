//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
void main() {
    final Path dirPath = Paths.get("../");
    final String extension = ".txt";

    try(DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath,"*"+extension)){
        for(Path entry:stream){
            System.out.println(entry);
        }

    }catch(IOException e){
        e.printStackTrace();

    }


}
