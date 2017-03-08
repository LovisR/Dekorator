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
}