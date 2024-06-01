import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Objects;

public class Mecanic  extends Angajat{
    private ArrayList<Serviciu> serviciiCerute=new ArrayList<>();
    public Mecanic(String nume, String username, String parola, int salariu) {
        super(nume, username, parola, "Mecanic", salariu);
    }
    public void schimbareStadiu(ArrayList<Serviciu> s, Serviciu ser, String c){
        for(int i=0;i<s.toArray().length;i++){
            if(s.get(i)==ser){
                s.get(i).setStadiu(c);
            }
        }
    }
    public double serviciuTerminat(ArrayList<Serviciu> s, double p){

        for(int i=0;i<s.toArray().length;i++){
            if(Objects.equals(s.get(i).getStadiu(), "terminat")){
                 p=p+s.get(i).getPret();
            }
        }
        return p;
    }

    public ArrayList<Serviciu> getserviciiCerute() {
        return serviciiCerute;
    }

    public void setserviciiCerute(Serviciu se) {
        this.serviciiCerute.add(se);
    }
}
