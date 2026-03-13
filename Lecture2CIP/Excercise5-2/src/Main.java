import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    if(!Desktop.isDesktopSupported()){
        System.out.println("Desktop operations are not supported!");
        return;
    }
    Desktop desktop = Desktop.getDesktop();
    File file = new File("student.txt");
    try{
        desktop.open(file);

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
