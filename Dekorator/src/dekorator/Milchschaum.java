package dekorator;


public class Milchschaum extends ZutatDekorierer
{

    public Milchschaum(String beschreib, Getränk g) {
        super(beschreib, g);
    }

 
    
    public double preis()
    {
        return 0.10 + getGetränk().preis();
    }

    @Override
    public String getBeschreibung() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}