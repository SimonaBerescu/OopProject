public class Film {
    private String titlu;
    int anAparitie;
    double rating;
    boolean potrivitPtCopii;
    public static String unText = "Toate filmele sunt frumoase";

    /*campul titlu fiind private nu se poate apela din alte claase, nici macar din main. Astfel ca trebuie sa creem
    un getter (metoda prin care sa apelam valorea titlu), si un setter - pentru a atribui o valoare campului titlu
    */
    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    /*  public static String getUnText() {
        return unText;
    }

    public static void setUnText(String unText) {
        Film.unText = unText;}*/

    public Film(){
        this.titlu = "unknown";
        this.anAparitie = 2000;
        this.rating = 10;
        this.potrivitPtCopii = false;
        System.out.println("primul constructor e apelat");
    }


    public void afiseazaDacaEPotrivitPtCopii() {
        if (this.potrivitPtCopii) {
            System.out.println(this.titlu+" e potrivit pentru copii");
        } else {
            System.out.println(this.titlu+" nu e potrivit pentru copii");
        }

    }

    public Film(String titlu, int anAparitie, boolean potrivitPtCopii) {
        this.titlu = titlu;
        this.anAparitie = anAparitie;
        this.potrivitPtCopii = potrivitPtCopii;
    }

    public String afisezaRating(){
        return (this.titlu+" are rating "+this.rating);
    }
    public static String afiseazaUnText() {
    return unText;
    }



}