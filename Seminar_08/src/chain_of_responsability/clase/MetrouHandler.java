package chain_of_responsability.clase;

public class MetrouHandler extends Handler {
    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if (distanta < limita) {
            System.out.println("Poti sa folosesti metroul.");
        } else {
            super.handler.afisareMijlocTransport(distanta);
        }
    }
}
