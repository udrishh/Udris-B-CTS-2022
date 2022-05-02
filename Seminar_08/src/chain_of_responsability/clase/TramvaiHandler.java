package chain_of_responsability.clase;

public class TramvaiHandler extends Handler {
    public TramvaiHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if (distanta < limita) {
            System.out.println("Poti sa folosesti tramvaiul.");
        } else {
            super.handler.afisareMijlocTransport(distanta);
        }
    }
}
