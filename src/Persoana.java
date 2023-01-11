public class Persoana {
    String nume;
    String prenume;
    int varsta;
    String gen;

    //constructor: pentru a nu le da o valoare mai sus
    Persoana(){
        gen = "m";
        nume = "unknown";
        prenume = "unknown";
        varsta = 0;
    }

    Persoana (String nume, String prenume){
        //this se refera la atributul din clasa curenta
        this.nume = nume;
        this.prenume = prenume;
    }

    public Persoana(String nume, String prenume, int varsta, String gen) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
    }
}
