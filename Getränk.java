package dekorator;

public abstract class Getränk 
{
    private String beschreibung;
    
    public Getränk(String beschreib)
    {
        beschreibung = beschreib;
    }
    
    public String getBeschreibung()
    {
        return beschreibung;
    }
    
    public abstract double preis();
}
