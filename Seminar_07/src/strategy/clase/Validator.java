package strategy.clase;

public class Validator {
    private ModPlata modPlata;
    private float pret;

    public Validator(float pret) {
        this.pret = pret;
        this.modPlata = new CardStb();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void validareCalatorie() {
        modPlata.plateste(pret);
    }
}
