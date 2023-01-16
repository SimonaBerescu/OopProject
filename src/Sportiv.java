abstract class Sportiv {
    public String proba;
    public String tara;

    abstract void seAntreneaza();
    public void seOdihneste(){
        System.out.println("Sportivul se odihneste");
    }

    public Sportiv(String proba, String tara){
        this.tara=tara;
        this.proba=proba;
    }


}
