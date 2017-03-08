package dekorator;


public class Milch extends ZutatDekorierer
{
    public Milch(String beschreib, Getränk g) {
        super(beschreib, g);
    }

   
    
    public double preis()
    {
        return 0.10 + getGetränk().preis();
    }
    
    public String getBeschreibung()
    {
        return 
    }
}
