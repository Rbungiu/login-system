import org.javatuples.Pair;

import java.util.ArrayList;

public class Admin extends Angajat{
    public Admin(String nume, String username, String parola, int salariu) {
        super(nume, username, parola, "Admin", salariu);
    }
    public void afiseazaAngajati(ArrayList<Angajat> angajat){
        System.out.println("Angajati:");
        for (Angajat value : angajat) {
            System.out.println(value.toString());
        }
    }
    public void afiseazaProduse(ArrayList<Pair<Produs, Serviciu>> p){
        System.out.println("Produse:");
        for(int i=0;i<p.toArray().length;i++){
            System.out.println(p.get(i).getValue0());
        }
    }
    public void afiseazaVanzari(Vanzator vanzator, Mecanic mecanic){
        System.out.println("Total vanzari vanzator:");
        System.out.println(vanzator.vanzariTotale(vanzator.getVanzari(), 0));
        System.out.println("Total vanzari mecanic:");
        System.out.println(mecanic.serviciuTerminat(mecanic.getserviciiCerute(), 0));
    }
}
