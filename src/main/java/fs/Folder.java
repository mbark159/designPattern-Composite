package fs;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant{
    private List<Composant> composants = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        System.out.println(getTab() + "- FOLDER : " + name);
        for (Composant c : composants){
            c.afficher();
        }
    }

    public Composant addComposant(Composant composant){
        this.composants.add(composant);
        composant.level = this.level + 1;
        return composant;
    }

    public void removeComposant(Composant composant){
        composants.remove(composant);
    }
}
