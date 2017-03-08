package dekorator;

public class Espresso extends Getränk
{

    public Espresso(String beschreib) {
        super(beschreib);
    }
    public double preis()
    {
        return 1.99;
    }
    
}
