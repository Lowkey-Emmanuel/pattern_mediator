import java.util.HashSet;

public class TestMediator {
         
    public static void main(String[] args) {
            
        FeuMediator mediator = new FeuMediator();
        Feu rouge = new Feu("Rouge", mediator);
        Feu vert = new Feu("Vert", mediator);
        Feu jaune = new Light("Jaune", mediator);
            
        rouge.turnON();
        vert.turnON();
        jaune.turnON();
    }
}