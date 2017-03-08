package dekorator;

public class Hausmischung extends Getränk
{

    public Hausmischung(String beschreib) {
        super(beschreib);
    }
    public double preis()
    {
        return 0.89;
    }
    
}
