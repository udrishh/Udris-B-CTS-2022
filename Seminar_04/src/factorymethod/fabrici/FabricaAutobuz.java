package factorymethod.fabrici;

import factorymethod.clase.Autobuz;
import factorymethod.clase.MijlocTransport;

public class FabricaAutobuz implements Fabrica{
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
