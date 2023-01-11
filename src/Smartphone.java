public class Smartphone extends Device{
    private String marca = "No name";
    @Override
    void porneste() {
        System.out.println("Telefonul porneste");
    }

    @Override
    public void seOpreste() {
        super.seOpreste();
    }
}
