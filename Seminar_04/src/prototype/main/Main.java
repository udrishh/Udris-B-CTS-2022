package prototype.main;

import prototype.clase.Autobuz;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz a1 = new Autobuz("Sofer Autobuz1");
        Autobuz a2 = (Autobuz) a1.copiaza();
        a2.setSofer("Sofer Autobuz2");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
