package dekorator;


public class Soja extends ZutatDekorierer
{

    public Soja(String beschreib, Getränk g) {
        super(beschreib, g);
    }
 
    
    public double preis()
    {
        return 0.15 + getGetränk().preis();
    }
}