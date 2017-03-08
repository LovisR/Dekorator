package dekorator;

public class Dekorator 
{

    public static void main(String[] args) 
    {
        DunkleRöstung dR = new DunkleRöstung("Dunkle Röstung");
        Schoko s = new Schoko("Schoko",dR);
        Milchschaum m = new Milchschaum("Milchschaum", s);
        System.out.println(m.getBeschreibung());
        System.out.println(m.preis());
    }
    
}
