package composite.main;

import composite.clase.Autobuz;
import composite.clase.Grup;
import composite.clase.MijlocTransport;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        MijlocTransport a1 = new Autobuz("STB1","MERCEDES",10);
        MijlocTransport a2 = new Autobuz("STB2","OTOKAR",8);
        MijlocTransport a3 = new Autobuz("STB3","OTOKAR",48);

        MijlocTransport g1 = new Grup("Mici");
        MijlocTransport g2 = new Grup("Mari");
        MijlocTransport g3 = new Grup("Flota");

        try {
            g1.adaugaMijlocTransport(a1);
            g1.adaugaMijlocTransport(a2);
            g2.adaugaMijlocTransport(a3);
            g2.adaugaMijlocTransport(g1);
            g3.adaugaMijlocTransport(g2);
        } catch (ExecutionControl.NotImplementedException ex) {
            ex.printStackTrace();
        }

        g3.afiseazaDescriere();
    }
}
