package adapter.clase.metrou;

import adapter.clase.stb.ValidatorSTB;

public class ValidatorAdapterObiecte implements ValidatorSTB {
    private ValidatorMetrou validatorMetrou;

    public ValidatorAdapterObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaBliet();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }

}
