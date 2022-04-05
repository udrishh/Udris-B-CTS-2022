package builder.clase;

public class AutobuzBuilder implements Builder {
    private String numeSofer;
    private String model;
    private int nrlinie;
    private int nrLocuri;
    private String nrInamtriculare;
    private boolean deschideUsi;
    private boolean opresteCapat;

    @Override
    public Autobuz build() {
        return new Autobuz(numeSofer, model, nrlinie, nrLocuri, nrInamtriculare, deschideUsi, opresteCapat);
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNrlinie(int nrlinie) {
        this.nrlinie = nrlinie;
        return this;
    }

    public AutobuzBuilder setnrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
        return this;
    }

    public AutobuzBuilder setNrInamtriculare(String nrInamtriculare) {
        this.nrInamtriculare = nrInamtriculare;
        return this;
    }

    public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
        return this;
    }

    public AutobuzBuilder setOpresteCapat(boolean opresteCapat) {
        this.opresteCapat = opresteCapat;
        return this;
    }
}
