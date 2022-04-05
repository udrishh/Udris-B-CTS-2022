package builder.main;

import builder.clase.Autobuz;
import builder.clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new AutobuzBuilder().setNumeSofer("Sofer autobuz").setDeschideUsi(true).setnrLocuri(34)
                .setOpresteCapat(false).setNrlinie(120).build();
        System.out.println(autobuz.toString());
    }
}
