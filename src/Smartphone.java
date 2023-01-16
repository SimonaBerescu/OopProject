public class Smartphone extends Device{
    public String marca = "No name";
    public String pret="500 euro";
    @Override
    void porneste() {
        System.out.println("Telefonul porneste");
    }

    @Override
    public void seOpreste() {
        super.seOpreste();
    }

    public Smartphone(String marca, String pret) {
        this.marca = marca;
        this.pret = pret;
    }
}
