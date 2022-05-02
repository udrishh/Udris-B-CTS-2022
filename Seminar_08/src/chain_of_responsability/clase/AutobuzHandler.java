package chain_of_responsability.clase;

public class AutobuzHandler extends Handler {
    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if (distanta < limita) {
            System.out.println("Poti sa folosesti autobuzul.");
        } else {
            super.handler.afisareMijlocTransport(distanta);
        }
    }
}
