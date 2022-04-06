package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzNoapte;
import proxy.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(4,300);
        autobuz.opresteInStatie();

        autobuz.setNrCalatori(0);
        autobuz.opresteInStatie();

        System.out.println();

        AutobuzNoapte autobuzNoapte = new AutobuzNoapte(autobuz);
        autobuzNoapte.setNrCalatori(2);
        autobuzNoapte.opresteInStatie();

        autobuzNoapte.setNrCalatori(0);
        autobuzNoapte.opresteInStatie();
    }
}
