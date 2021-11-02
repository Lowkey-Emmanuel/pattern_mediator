import java.util.HashSet;

public class TestMediator {
         
    public static void main(String[] args) {
            
        FeuMediator mediator = new FeuMediator();
        Feu red = new Feu("Red", mediator);
        Feu green = new Feu("Green", mediator);
        Feu yellow = new Light("Yellow", mediator);
            
        red.turnON();
        green.turnON();
        yellow.turnON();
    }
}