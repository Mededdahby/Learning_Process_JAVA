import Tests.Animal;

import java.util.List;

public class collections {

    public void affiche(List<? extends Animal> list){
        for( Animal a : list){
            a.affiche();
        }
    }
}
