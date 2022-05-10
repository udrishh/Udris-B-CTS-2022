package state.clase;

public class Autobuz {
    private Stare stare;
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.stare = new StareLaCapatLinie();
        this.nrAutobuz = nrAutobuz;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void pleacaInCursa() {
        new StareInCursa().doAction(this);
    }

    public void intraInService() {
        new StareInService().doAction(this);
    }

    public void ieseDinService() {
        new StareLaCapatLinie().doAction(this);
    }

    public void ajungeLaCapatDeLinie() {
        new StareLaCapatLinie().doAction(this);
    }
}
