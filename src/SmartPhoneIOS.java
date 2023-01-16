public class SmartPhoneIOS extends Smartphone{
    public SmartPhoneIOS(String marca, String pret) {
        super(marca, pret);
    }

    @Override
    void porneste() {
        System.out.println("Telefonul iOS porneste");
    }
    void pretIOS(){
        super.pret="1000 euro";
        System.out.println("Smartphone-ul iOS are pretul: "+super.pret);
    }

}
