public class Animal {
    String nume;
    String culoare;
    boolean vegetrian;
    int nrPicioare;
    private String undeTraieste;

    public String getUndeTraieste() {
        return undeTraieste;
    }

    public void setUndeTraieste(String undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    public Animal() {
        nume = "unknown";
        culoare = "unknown";
        vegetrian = false;
        nrPicioare = 0;
    }

    public Animal(String nume, int nrPicioare) {
        this.nume = nume;
        this.nrPicioare = nrPicioare;
    }

    public Animal(String nume, boolean vegetrian) {
        this.nume = nume;
        this.vegetrian = vegetrian;
    }

    public Animal(String nume, String culoare, boolean vegetrian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetrian = vegetrian;
    }

    public Animal(String nume, String culoare, boolean vegetrian, int nrPicioare) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetrian = vegetrian;
        this.nrPicioare = nrPicioare;
    }

    public void mananca(String nume){
        System.out.println(nume+" mananca");
    }

    public void doarme(String nume){
        System.out.println(nume+" doarme");
    }

    public String afiseaza(String nume, String culoare){
    return (nume+" are culoarea "+culoare);
    }

    public void afiseazaNrPicioare(){
       if(nrPicioare==0){
           System.out.println("Nu are picioare");}
       else if (nrPicioare==2){
           System.out.println("Are 2 picioare");
       }
       else if (nrPicioare==4){
           System.out.println("Are 4 picioare");
       }
       else{
           System.out.println("Are alt numar de picioare");
       }
    }


}
