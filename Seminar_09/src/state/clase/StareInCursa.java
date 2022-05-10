package state.clase;

public class StareInCursa implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if (autobuz.getStare() instanceof StareLaCapatLinie) {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " a plecat in cursa.");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate pleca in cursa.");
        }
    }
}
