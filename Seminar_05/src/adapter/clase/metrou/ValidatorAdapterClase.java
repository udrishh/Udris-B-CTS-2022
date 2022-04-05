package adapter.clase.metrou;

import adapter.clase.stb.ValidatorSTB;

public class ValidatorAdapterClase extends ValidatorScanare implements ValidatorSTB {

    @Override
    public void valideazaBilet() {
        super.valideazaAbonament();
    }

    @Override
    public void valideazaAbonament() {
        super.valideazaAbonament();
    }
}
