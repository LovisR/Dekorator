package dekorator;

public abstract class ZutatDekorierer extends Getränk
{
    private Getränk getränk;
    
    public ZutatDekorierer(String beschreib, Getränk g) {
        super(beschreib);
        getränk = g;
    }

    public Getränk getGetränk()
    {
        return getränk;
    }
    public abstract String getBeschreibung();
}
