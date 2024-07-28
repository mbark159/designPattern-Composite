import fs.File;
import fs.Folder;

public class App {
    public static void main(String[] args) {
        Folder root = new Folder("ROOT");
        root.addComposant(new File("java.txt"));
        root.addComposant(new File("pom.xml"));

        Folder src =(Folder) root.addComposant(new Folder("src"));
        src.addComposant(new File("image1.png"));
        src.addComposant(new File("image2.png"));

        root.afficher();
    }
}
