package flyweight.main;

import flyweight.clase.Autobuz;
import flyweight.clase.AutobuzLinie;
import flyweight.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1 = new Autobuz("Mercedes", 2000, 80);
        AutobuzLinie a2 = new Autobuz("Otokar", 1990, 80);
        AutobuzLinie a3 = new Autobuz("Audi", 2005, 80);
        AutobuzLinie a4 = new Autobuz("Mercedes", 2010, 50);
        AutobuzLinie a5 = new Autobuz("Fiat", 2020, 40);

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        a1.descrie(flyweightFactory.getLinie(168));
        a2.descrie(flyweightFactory.getLinie(226));
        a3.descrie(flyweightFactory.getLinie(168));
        a4.descrie(flyweightFactory.getLinie(137));
    }
}
