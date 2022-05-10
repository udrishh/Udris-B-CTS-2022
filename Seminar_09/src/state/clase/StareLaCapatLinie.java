package state.clase;

public class StareLaCapatLinie implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if (!(autobuz.getStare() instanceof StareLaCapatLinie)) {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " a ajuns la capat de linie.");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " este deja la capat de linie");
        }
    }
}
