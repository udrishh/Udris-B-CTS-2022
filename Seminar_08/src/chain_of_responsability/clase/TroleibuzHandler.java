package chain_of_responsability.clase;

public class TroleibuzHandler extends Handler {
    public TroleibuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if (distanta < limita) {
            System.out.println("Poti sa folosesti troliebuzul.");
        } else {
            super.handler.afisareMijlocTransport(distanta);
        }
    }
}
