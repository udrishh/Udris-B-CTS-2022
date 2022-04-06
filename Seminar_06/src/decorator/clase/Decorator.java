package decorator.clase;

public abstract class Decorator implements PrinterBilet{
    private PrinterBilet printerBilet;

    public Decorator(PrinterBilet printerBilet) {
        this.printerBilet = printerBilet;
    }

    @Override
    public void afiseazaDescriere(){
        printerBilet.afiseazaDescriere();
    }

    public abstract void afiseazaVerso();
}
