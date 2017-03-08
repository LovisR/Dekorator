package dekorator;

public class Entkoffeiniert extends Getränk
{

    public Entkoffeiniert(String beschreib) {
        super(beschreib);
    }
    public double preis()
    {
        return 1.05;
    }
    
}
