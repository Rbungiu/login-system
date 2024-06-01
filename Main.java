import org.javatuples.Pair;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Pair<Angajat, Integer>> prioAngajat=new ArrayList<>();
    static ArrayList<Pair<Produs, Serviciu>> produseSiServicii=new ArrayList<>();
    static ArrayList<Angajat> angajati=new ArrayList<>();
    static Vanzator vanzator =new Vanzator("Mihai Porumb", "vanzator01", "6996", 2000);
    static Admin admin =new Admin("Simona Vlad", "admin01", "7309", 3000);
    static Mecanic mecanic=new Mecanic("Mihnea Dorobantiu", "mecanic01", "6879", 2500);
    static OperatorMarfa opMarfa=new OperatorMarfa("Ion Casangiu", "opmarfa01", "5363",2000);
    static Produs monitor=new Produs("MonitorAsus", 10, 800);
    static Serviciu reparareMonitor=new Serviciu("Reparatie Monitor", 100, "", "");
    static Produs pastaTermica=new Produs("Pasta Termica Artic", 100, 30);
    static Serviciu aplicarePt=new Serviciu("Aplicare pasta termica", 10, "", "Pasta Termica");
    static Produs MemorieRam=new Produs("Corsaire Vengence 16gb ddr4", 50, 399.99);
    static Serviciu instalareMR=new Serviciu("Instalare Memorie Ram", 80, "", "Memorie Ram");
    static Produs laptop=new Produs("Asus TUf A15", 5, 5000);
    static Serviciu cr=new Serviciu("Curatare laptop", 50, "", "");
    static Pair<Produs, Serviciu> mon=new Pair<>(monitor, reparareMonitor);
    static Pair<Produs, Serviciu> pasta=new Pair<>(pastaTermica, aplicarePt);
    static Pair<Produs, Serviciu> ram=new Pair<>(MemorieRam, instalareMR);
    static Pair<Produs, Serviciu> lap=new Pair<>(laptop, cr);
    static Pair<Angajat, Integer> Admin=new Pair<>(admin,1);
    static Pair<Angajat, Integer> Vanzator=new Pair<>(vanzator,2);
    static Pair<Angajat, Integer> Mecanic=new Pair<>(mecanic,3);
    static Pair<Angajat, Integer> OpMarfa=new Pair<>(opMarfa,4);
    static String username, parola, alegere;
    public static void main(String[] args) {
        angajati.add(admin);
        angajati.add(vanzator);
        angajati.add(mecanic);
        angajati.add(opMarfa);
        produseSiServicii.add(mon);
        produseSiServicii.add(pasta);
        produseSiServicii.add(ram);
        produseSiServicii.add(lap);
        prioAngajat.add(Admin);
        prioAngajat.add(Vanzator);
        prioAngajat.add(Mecanic);
        prioAngajat.add(OpMarfa);
        int flag1=3;
        int flag2=1;
        String denumireProdus;
        Produs produs;
        int cantitate;
        double pret;
        String denumireServiciu;
        Serviciu serviciu;
        while(flag1>0 && flag2>0){
            int operatiune=0;
            System.out.println("Va rugam introduceti username-ul:");
            username=sc.next();
            System.out.println("Va rugam introduceti parola:");
            parola=sc.next();
            int x, i;
            double vanzariVanzator=0, vanzariMecanic=0;
            for(i=0;i<angajati.toArray().length;i++){
                int ok=0;
                if(Objects.equals(angajati.get(i).getUsername(), username) && Objects.equals(angajati.get(i).getParola(), parola)){
                    for(int j=0;j<prioAngajat.toArray().length;j++){
                        if(angajati.get(i)==prioAngajat.get(j).getValue0()){
                            x=prioAngajat.get(j).getValue1();
                            switch (x){
                                case 1:
                                    while(operatiune!=4) {
                                        System.out.println("Ce doriti sa faceti?:");
                                        System.out.println("1.Afiseaza angajati");
                                        System.out.println("2.Afiseaza produsele si serviciile");
                                        System.out.println("3.Afiseaza vanzarile");
                                        System.out.println("4.Deconectare");
                                        operatiune= Integer.parseInt(sc.next());
                                        switch (operatiune) {
                                            case 1:
                                                admin.afiseazaAngajati(angajati);
                                                break;
                                            case 2:
                                                admin.afiseazaProduse(produseSiServicii);
                                                break;
                                            case 3:
                                                admin.afiseazaVanzari(vanzator, mecanic);
                                                break;
                                            case 4:
                                                break;
                                        }
                                    }
                                    ok = 1;
                                    break;
                                case 2:
                                    while(operatiune!=3) {
                                        System.out.println("Ce doriti sa faceti?:");
                                        System.out.println("1.Vanzare produs");
                                        System.out.println("2.Adunarea vanzarii totale");
                                        System.out.println("3.Deconectare");
                                        operatiune= Integer.parseInt(sc.next());
                                        switch (operatiune) {
                                            case 1:
                                                System.out.println("Ce produs a fost vandut?");
                                                denumireProdus=sc.next();
                                                System.out.println("Cate bucati au fost vandute?");
                                                cantitate= Integer.parseInt(sc.next());
                                                for(int k=0;k<produseSiServicii.toArray().length;k++){
                                                   if(Objects.equals(denumireProdus, produseSiServicii.get(k).getValue0().getDenumire())){
                                                       produs=produseSiServicii.get(k).getValue0();
                                                       Pair<Produs, Integer> produs1=new Pair<>(produs, cantitate);
                                                       vanzator.vanzare(produseSiServicii, produs1, vanzator.getVanzari());
                                                       System.out.println("Vanzare adaugata cu succes");
                                                       break;
                                                   }
                                                }
                                                break;
                                            case 2:
                                                vanzator.vanzariTotale(vanzator.getVanzari(), vanzariVanzator);
                                                System.out.println("Vanzari adaugate la totalul vanzarilor");
                                                break;
                                            case 3:
                                                break;
                                        }
                                    }
                                    ok=1;
                                    break;
                                case 3:
                                    while(operatiune!=4) {
                                        System.out.println("Ce doriti sa faceti?:");
                                        System.out.println("1.Adaugare serviciu cerut");
                                        System.out.println("2.Schimbarea stadiului unui serviciu");
                                        System.out.println("3.Total venit din servicii terminate");
                                        System.out.println("4.Deconectare");
                                        operatiune= Integer.parseInt(sc.next());
                                        switch (operatiune) {
                                            case 1:
                                                System.out.println("Care este numele serviciului cerut?");
                                                denumireServiciu=sc.next();
                                                for(int k=0;k<produseSiServicii.toArray().length;k++){
                                                    if(Objects.equals(denumireServiciu, produseSiServicii.get(k).getValue1().getDenumire())){
                                                        serviciu=produseSiServicii.get(k).getValue1();
                                                        mecanic.setserviciiCerute(serviciu);
                                                        System.out.println("Serviciul cerut a fost adaugat cu succes");
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 2:
                                                System.out.println("Care este numele serviciul cautat?");
                                                denumireServiciu=sc.next();
                                                for(int k=0;k<produseSiServicii.toArray().length;k++){
                                                    if(Objects.equals(denumireServiciu, produseSiServicii.get(k).getValue1().getDenumire())){
                                                        serviciu=produseSiServicii.get(k).getValue1();
                                                        String stadiu;
                                                        System.out.println("La ce stadiu a a juns serviciul?");
                                                        stadiu=sc.next();
                                                        mecanic.schimbareStadiu(mecanic.getserviciiCerute(), serviciu, stadiu);
                                                        System.out.println("Stadiul serviciului a fost modificat cu succes");
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 3:
                                                mecanic.serviciuTerminat(mecanic.getserviciiCerute(),vanzariMecanic);
                                                System.out.println("A fost modificat cu succes totalul venitului din serviciile terminate");
                                                break;
                                            case 4:
                                                break;
                                        }
                                    }
                                    ok=1;
                                    break;
                                case 4:
                                    while(operatiune!=3) {
                                        System.out.println("Ce doriti sa faceti?:");
                                        System.out.println("1.Adaugare produs nou in depozit");
                                        System.out.println("2.Adaugare marfa produs");
                                        System.out.println("3.Deconectare");
                                        operatiune= Integer.parseInt(sc.next());
                                        switch (operatiune) {
                                            case 1:
                                                System.out.println("Care este denumirea noului produs");
                                                denumireProdus=sc.next();
                                                System.out.println("Cate bucati au fost aduse?");
                                                cantitate= Integer.parseInt(sc.next());
                                                System.out.println("Care este pretul noului produs?");
                                                pret= Double.parseDouble(sc.next());
                                                Produs produs1=new Produs(denumireProdus, cantitate, pret);
                                                opMarfa.adaugareProdus(produseSiServicii, produs1);
                                                System.out.println("Prods adugat cu succes");
                                                break;
                                            case 2:
                                                System.out.println("Care este denumirea produsului pentru care se va schimba cantitatea?");
                                                denumireProdus=sc.next();
                                                for(int k=0;k<produseSiServicii.toArray().length;k++){
                                                    if(Objects.equals(denumireProdus, produseSiServicii.get(k).getValue0().getDenumire())){
                                                        produs=produseSiServicii.get(k).getValue0();
                                                        System.out.println("Cate unitati vor fi adaugate la totalul cantitatii?");
                                                        cantitate= Integer.parseInt(sc.next());
                                                        opMarfa.modificareCantitate(produs, cantitate, produseSiServicii);
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 3:
                                                break;
                                        }
                                    }
                                    ok=1;
                                    break;
                            }
                            break;
                        }
                    }
                }
                if(ok==1){
                    break;
                }
            }
            if(i==angajati.toArray().length){
                flag1--;
                if(flag1>0){
                    System.out.println("Username sau parola incorecta. Mai aveti "+ flag1 +" incercari");
                }
            }
            if(flag1>0) {
                System.out.println("Doriti sa inchideti programul? DA sau NU?");
                alegere = sc.next();
                switch (alegere) {
                    case "DA":
                        flag2 = 0;
                        break;
                    case "NU":
                        break;
                }
            }
        }
        if(flag1==0){
            System.out.println("A-ti introdus username-ul sau parola incorect de prea multe ori. Va rugam reincercati mai tarziu");
        }
        if(flag2==0){
            System.out.println("Program inchis cu succes");
        }
    }
}