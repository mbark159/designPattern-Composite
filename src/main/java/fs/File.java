package fs;

public class File extends Composant{
    public File(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        System.out.println(getTab() + "- FILE => " + name);
    }
}
