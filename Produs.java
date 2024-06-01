public class Produs {
    private String denumire;
    private int cantitate;
    private double pret;
    public Produs (String denumire, int cantitate, double pret) {
        this.denumire = denumire;
        this.cantitate = cantitate;
        this.pret = pret;
    }
    public String getDenumire() {
        return denumire;
    }
    public int getCantitate() {
        return cantitate;
    }
    public double getPret() {
        return pret;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "denumire=" + denumire  +
                ", cantitate=" + cantitate +
                ", pret=" + pret;
    }

}
