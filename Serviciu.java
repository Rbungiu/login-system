public class Serviciu {
    private String denumire;
    private double pret;
    private String stadiu;
    private String partiNecesare;
    public Serviciu(String denumire, double pret, String stadiu, String partiNecesare) {
        this.denumire = denumire;
        this.pret = pret;
        this.stadiu = stadiu;
        this.partiNecesare = partiNecesare;
    }
    public String getDenumire() {
        return denumire;
    }
    public double getPret() {
        return pret;
    }
    public String getStadiu() {
        return stadiu;
    }
    public String getPartiNecesare() {
        return partiNecesare;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public void setPret(double pret) {
        this.pret = pret;
    }
    public void setStadiu(String stadiu) {
        this.stadiu = stadiu;
    }
    public void setPartiNecesare(String partiNecesare) {
        this.partiNecesare = partiNecesare;
    }

    @Override
    public String toString() {
        return "denumire=" + denumire +
                ", pret=" + pret +
                ", stadiu=" + stadiu +
                ", partiNecesare=" + partiNecesare;
    }

}
