package dekorator;

public class DunkleRöstung extends Getränk
{

    public DunkleRöstung(String beschreib) {
        super(beschreib);
    }
    public double preis()
    {
        return 0.99;
    }
    
}
