import java.util.Objects;

public class Angajat {
    private String nume;
    private String username;
    private String parola;
    private String tip;
    private int salariu;
    public Angajat(String nume, String username, String parola, String tip, int salariu) {
        this.nume = nume;
        this.username = username;
        this.parola = parola;
        this.tip = tip;
        this.salariu=salariu;
    }
    public String getNume() {
        return nume;
    }
    public String getUsername() {
        return username;
    }
    public String getParola() {
        return parola;
    }
    public String getTip() {
        return tip;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "nume=" + nume +
                ", username=" + username +
                ", parola=" + parola +
                ", tip=" + tip +
                ", salariu=" + salariu;
    }
}
