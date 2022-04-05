package builder.clase;

public class Autobuz {
    private String numeSofer;
    private String model;
    private int nrlinie;
    private int nrLoccuri;
    private String nrInamtriculare;
    private boolean deschideUsi;
    private boolean opresteCapat;

    Autobuz(String numeSofer, String model, int nrlinie, int nrLoccuri, String nrInamtriculare, boolean deschideUsi, boolean opresteCapat) {
        this.numeSofer = numeSofer;
        this.model = model;
        this.nrlinie = nrlinie;
        this.nrLoccuri = nrLoccuri;
        this.nrInamtriculare = nrInamtriculare;
        this.deschideUsi = deschideUsi;
        this.opresteCapat = opresteCapat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrlinie=").append(nrlinie);
        sb.append(", nrLoccuri=").append(nrLoccuri);
        sb.append(", nrInamtriculare='").append(nrInamtriculare).append('\'');
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", opresteCapat=").append(opresteCapat);
        sb.append('}');
        return sb.toString();
    }


}
