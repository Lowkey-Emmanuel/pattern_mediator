import java/util/hashset;

public class FeuMediator {
//Un feu est ON les autres sont OFF

//Hashset permet de garder une unicité pr les couleur.
    HashSet<Feu> feuSignal = new HashSet<Feu>();

//Enregistre l'objet feu dans le mediateur
    public void ajouteFeu(Feu feu) {
        feuSignal.add(feu);
    }
     
//Retire l'objet feu dans le mediateur
    public void retireFeu(Feu feu) {
        feuSignal.remove(Feu);
    }

    //Met toutes les couleurs en OFF sauf celle activée
    void offToutesLesCouleurs(Feu feu) {
        for (Feu l : feuSignal) {
            if (!(l.equals(feu))) {
                l.turnOFF();
            }
        }
        System.out.println("------------------------------");
    }
 
    /**
     * Quand le feu passe a 1 couleur le mediateur est notifié
     * Toutes les autres couleurs passent à OFF
     */
    public void notifMediator(Feu feu) {
        this.offToutesLesCouleurs(feu);
    }
}