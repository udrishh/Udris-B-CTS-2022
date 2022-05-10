package state.main;

import state.clase.Autobuz;
import state.clase.StareLaCapatLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(300);
        autobuz.pleacaInCursa();
        autobuz.intraInService();
        autobuz.ieseDinService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.pleacaInCursa();
//        autobuz.setStare(new StareLaCapatLinie());
        autobuz.intraInService();
        autobuz.pleacaInCursa();
    }
}
