/**
 * Décrivez votre classe Fraction2 ici.
 *
 * @author (KETAM)
 * @version (04-10-2017)
 */
public class Fraction 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int numerateur;
    private int denominateur;
    
    static Fraction ZERO = new Fraction(0,1);
    static Fraction UN = new Fraction(1,1);

    public Fraction(int num, int denom)
    {
        this.numerateur = num;
        this.denominateur = denom;
    }
    
    public Fraction(int num)
    {
        this(num, 1);
    }
    
    public Fraction()
    {
        this(0, 1);
    }
    public int getNum(){ return numerateur; }
    public int getDenom(){ return denominateur; }
    
    public double doubleValue()
    {
        return ((double) numerateur / (double) denominateur); 
    }
    public String toString()
    {
        return (this.numerateur + "/" + this.denominateur);
    }
    


}
