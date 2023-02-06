public class Smartphone extends Device{
    protected String marca = "No name";
    protected String pret="500 euro";
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
