package decorator.clase;

public class PrinterMesajAniversar extends Decorator{
    public PrinterMesajAniversar(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaVerso() {
        System.out.println("La multi ani!");
    }
}
