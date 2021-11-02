/**
 * Represente lle feu tricolore (Rouge, Vert, Jaune)
 */
class Feu {
//Les etats d'1 couleur du feu tricolore 
    enum Etat {
        ON, OFF
    }
 
    private String couleur;
    private Etat etatActuel;
    private FeuMediator mediator;
 
//Creer un objet Feu et l'enregistre au niveau du mediateur
    protected Feu(String couleur, FeuMediator mediator) {
        this.couleur = couleur;
        this.FeuMediator = mediator;
        mediator.ajouteFeu(this);
    }
 
//La couleur du feu passe à ON et notify le mediateur
    void turnON() {
        etatActuel = Etat.ON;
        System.out.printf("%s est en mode %s \n", this, etatActuel.ON);
        FeuMediator.notifMediator(this);
    }
 
//La couleur du feu passe à OFF
    void turnOFF() {
        etatActuel = Etat.OFF;
        System.out.printf("%s est en mode %s \n", this, etatActuel.OFF);
    }
 
//return couleur
    @Override
    public String toString() {
        return couleur;
    }
}