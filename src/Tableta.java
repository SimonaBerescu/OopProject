public class Tableta extends Device implements ObiectElectronic{
    @Override
    void porneste() {
        System.out.println("Tableta porneste");
    }


    @Override
    public boolean eConectat() {
        return false;
    }
}
