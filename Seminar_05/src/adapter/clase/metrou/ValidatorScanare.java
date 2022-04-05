package adapter.clase.metrou;

public class ValidatorScanare implements ValidatorMetrou{
    @Override
    public void valideazaBliet() {
        System.out.println("Biletul de metrou a fost validat");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Abonamentul de metrou a fost validat");
    }

    @Override
    public void valideazaBilet2Calatorii() {
        System.out.println("Biletul STB pentru 2 calatorii a fost validat");
    }
}
