package factorymethod.fabrici;

import factorymethod.clase.MijlocTransport;
import factorymethod.clase.Tramvai;

public class FabricaTramvai implements Fabrica{
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
