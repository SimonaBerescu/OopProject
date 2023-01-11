public class Elev {
    public String nume;
    public static String diriginte;

    public Elev(String nume) {
        this.nume = nume;
    }

    public void afisezaElevDiriginte(){
        System.out.println(this.nume+" are ca diriginte pe "+diriginte);
    }
}
