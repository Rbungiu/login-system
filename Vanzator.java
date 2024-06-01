import org.javatuples.Pair;

import java.util.ArrayList;

public class Vanzator  extends Angajat {
    private ArrayList<Double> vanzari=new ArrayList<>();
    public Vanzator(String nume, String username, String parola, int salariu) {
        super(nume, username, parola, "Vanzator", salariu);
    }
    public void vanzare(ArrayList<Pair<Produs, Serviciu>> p, Pair<Produs, Integer>vandut, ArrayList<Double> vanzari) {
        for (int i = 0; i < p.toArray().length; i++) {
            if(p.get(i).getValue0()==vandut.getValue0() && p.get(i).getValue0().getCantitate()>=vandut.getValue1()){
                p.get(i).getValue0().setCantitate(p.get(i).getValue0().getCantitate()-vandut.getValue1());
                vanzari.add(p.get(i).getValue0().getPret()*vandut.getValue1());
            }
        }
    }
    public double vanzariTotale(ArrayList<Double> vandut, double p){
        for(int i=0;i<vandut.toArray().length;i++){
            p=p+vandut.get(i);
        }
        return p;
    }
    public ArrayList<Double> getVanzari() {
        return vanzari;
    }
    public void setVanzari(double p) {
        this.vanzari.add(p);
    }

}
