package builder.clase;

public class Autobuz {
    private String numeSofer;
    private String nrInmatriculare;
    private String nrLinie;
    private boolean deschideUsi;
    private boolean oprireCapatLinie;
    private String textDerulat;
    private int nrLocuri;

    Autobuz() {
        numeSofer = "Nume Sofer";
        nrInmatriculare = "B 001 AAA";
        nrLinie = "1";
        deschideUsi = true;
        oprireCapatLinie = true;
        textDerulat = "N/A";
        nrLocuri = 20;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrLinie='").append(nrLinie).append('\'');
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", oprireCapatLinie=").append(oprireCapatLinie);
        sb.append(", textDerulat='").append(textDerulat).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    void setNrLinie(String nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
    }

    void setOprireCapatLinie(boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

    void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

    void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }
}
