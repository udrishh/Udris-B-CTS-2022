package facade.main;

import facade.clase.Autobuz;
import facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new Autobuz());
        facade.deschideUsi();
        facade.liberUsi();
    }
}
