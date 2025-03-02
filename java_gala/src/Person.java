//Jauna klase: Mainīgie, kuriem vēl nav iedotas vērtības
public class Person {
    String vards;
    String uzvards;
    String valsts;
    int vecums;
    double svars;
    double augums_m;
    double ienakumi_menesi;
    boolean patikProgramet;

// Konstruktors - lai automizētu un ievadītu mainīgajiem vērtības. This ir, lai zinātu, kas ir kas.

    public void Person(String vards, String uzvards, String valsts, int vecums, double svars, double augums_m, double ienakumi_menesi, boolean patikProgramet) {

    }

// Metode informācijas izvadei, kur ir statiskais + mainīgais

    public void printInfo() {
        System.out.println("Personas dati:");
        System.out.println("Vārds: " + vards);
        System.out.println("Uzvārds: " + uzvards);
        System.out.println("Vecums: " + vecums);
        System.out.println("Augums metros: " + augums_m + " m");
        System.out.println("Svars: " + svars + " kg");
        System.out.println("Valsts: " + valsts);
        System.out.println("Mēneša ienākumi: " + ienakumi_menesi + " EUR");
        System.out.println("Patīk programmēt: " + (patikProgramet ? "Jā" : "Nē"));
    }
    }