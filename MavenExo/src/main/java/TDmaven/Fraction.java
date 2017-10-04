/**
 * Décrivez votre classe Fraction2 ici.
 *
 * @author (KETAM)
 * @version (04-10-2017)
 */
public class Fraction2 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int numerateur;
    private int denominateur;
    
    static Fraction2 ZERO = new Fraction2(0,1);
    static Fraction2 UN = new Fraction2(1,1);

    public Fraction2(int num, int denom)
    {
        this.numerateur = num;
        this.denominateur = denom;
    }
    
    public Fraction2(int num)
    {
        this(num, 1);
    }
    
    public Fraction2()
    {
        this(0, 1);
    }
    
    public int getNum(){ return numerateur; }
    public int getDenom(){ return denominateur; }
    
    public double doubleValue()
    {
        return ((double) numerateur / (double) denominateur); 
    }
    
    public Fraction2 add(Fraction2 f)
    {
        Fraction2 fraction = new Fraction2(numerateur * f.getDenom() + denominateur * f.getNum(), 
                                    denominateur * f.getDenom());
        return fraction;
    }
    
    public int PGCD(int a,int b)
    {
        int x,y,z;
        if (a > b) 
        {   
            x = a; 
            y = b; 
        } 
        else 
        {   x=b; 
            y=a; 
        } 
        z= x % y; 
       while(z!=0) 
       { x = y; 
         y = z; 
         z = x % y; 
       }
       return y;
    }
    public Fraction2 reduction(Fraction2 f)
    {
        int p= PGCD ( f.numerateur , f.denominateur);
        Fraction2 fraction = new Fraction2(f.getNum()/p,f.getDenom()/p);
        return fraction;
    }
    
    public boolean equal(Fraction2 f1,Fraction2 f2)
    {
        f1 = reduction(f1);
        f2 = reduction(f2);
        if((f1.numerateur == f2.numerateur)&&(f1.denominateur == f2.denominateur))
            return true;
        return false;
    }
    
    public String toString()
    {
        return (this.numerateur + "/" + this.denominateur);
    }
    

    public boolean compare(Fraction2 f1,Fraction2 f2)
    {
        double x,y;
        x= (double)f1.numerateur/(double) f1.denominateur;
        y= (double) f2.numerateur /(double) f2.denominateur;
        if(x>y)
            return false;
        return true;
    }
    


}
