package factorymethod.fabrici;

import factorymethod.clase.MijlocTransport;

public interface Fabrica {
    public abstract MijlocTransport getMijlocTransport(String nrInmatriculare);
}
