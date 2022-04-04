package factorymethod.fabrici;

import factorymethod.clase.MijlocTransport;
import factorymethod.clase.Troleibuz;

public class FabricaTroleibuz implements Fabrica{

    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
