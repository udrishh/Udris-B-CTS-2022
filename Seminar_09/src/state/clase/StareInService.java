package state.clase;

public class StareInService implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if (autobuz.getStare() instanceof StareLaCapatLinie) {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " a intrat in service");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate intra in service.");
        }
    }
}
