import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    if(!Desktop.isDesktopSupported()){
        System.out.println("Desktop operations are not supported!");
        return;
    }
    Desktop desktop = Desktop.getDesktop();
    try{
        URI mailto = new URI("mailto:mitov@bss.com.mk?subject=Test%20Subject&body=Message%20Body");
        desktop.mail(mailto);
    } catch (URISyntaxException | IOException e) {
        throw new RuntimeException(e);
    }
}
