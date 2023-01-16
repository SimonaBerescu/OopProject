public class Maratonist extends Sportiv{
    @Override
    void seAntreneaza() {
        System.out.println("Maratonistul de antreneaza");
    }

    public Maratonist(String proba, String tara) {
        super(proba, tara);
    }
}
