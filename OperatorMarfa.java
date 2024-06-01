import org.javatuples.Pair;

import java.util.ArrayList;

public class OperatorMarfa extends Angajat {
    public OperatorMarfa(String nume, String username, String parola, int salariu) {
        super(nume, username, parola, "OperatorMarfa", salariu);
    }
    public void adaugareProdus(ArrayList<Pair<Produs, Serviciu>> p, Produs e){
        Serviciu s=new Serviciu("",0,"","");
        Pair<Produs, Serviciu> a=new Pair<>(e, s);
        p.add(a);
    }
    public void modificareCantitate(Produs e, int x, ArrayList<Pair<Produs, Serviciu>> p){
        for(int i=0;i<p.toArray().length;i++){
            if(p.get(i).getValue0()==e){
                p.get(i).getValue0().setCantitate(e.getCantitate()+x);
            }
        }
    }
}
