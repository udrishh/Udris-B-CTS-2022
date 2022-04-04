package builder.main;

import builder.clase.Autobuz;
import builder.clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNrInmatriculare("B 101 GGG").setNrLinie("103").setNumeSofer("Sofer");

        Autobuz autobuz1 = new AutobuzBuilder().setNrLinie("300").setNumeSofer("Al doilea sofer").build();
        Autobuz autobuz2 = autobuzBuilder.build();

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
    }
}
