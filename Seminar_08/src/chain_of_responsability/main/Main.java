package chain_of_responsability.main;

import chain_of_responsability.clase.*;

public class Main {
    public static void main(String[] args) {
        // BUCURESTI
        Handler autobuzHandler = new AutobuzHandler(5);
        Handler tramvaiHandler = new TramvaiHandler(10);
        Handler troleibuzHandler = new TroleibuzHandler(3);
        Handler metrouHandler = new MetrouHandler(1000);

        troleibuzHandler.setNextHandler(autobuzHandler);
        autobuzHandler.setNextHandler(tramvaiHandler);
        tramvaiHandler.setNextHandler(metrouHandler);

        troleibuzHandler.afisareMijlocTransport(7);
        troleibuzHandler.afisareMijlocTransport(20);
        troleibuzHandler.afisareMijlocTransport(2);
        troleibuzHandler.afisareMijlocTransport(4);

        System.out.println();

        // CLUJ
        Handler autobuzHandler2 = new AutobuzHandler(1000);
        Handler tramvaiHandler2 = new TramvaiHandler(2);
        Handler troleibuzHandler2 = new TroleibuzHandler(5);

        tramvaiHandler2.setNextHandler(troleibuzHandler2);
        troleibuzHandler2.setNextHandler(autobuzHandler2);

        tramvaiHandler2.afisareMijlocTransport(1);
        tramvaiHandler2.afisareMijlocTransport(3);
        tramvaiHandler2.afisareMijlocTransport(10);
    }
}
