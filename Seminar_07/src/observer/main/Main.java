package observer.main;

import observer.clase.Calator;
import observer.clase.ICalator;
import observer.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new MijlocTransport(130);
        ICalator c1 = new Calator("Nume 1");
        ICalator c2 = new Calator("Nume 2");
        ICalator c3 = new Calator("Nume 3");

        mijlocTransport.adaugaCalator(c1);
        mijlocTransport.adaugaCalator(c2);
        mijlocTransport.trimiteMesajPlecareCapatLinie();
        System.out.println();
        mijlocTransport.stergeCalator(c2);
        mijlocTransport.adaugaCalator(c3);
        mijlocTransport.trimiteMesajPlecareCapatLinie();
    }
}
