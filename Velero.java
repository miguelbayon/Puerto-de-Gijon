
/**
 * Clase Velero
 * 
 */
public class Velero extends Barco
{   
    private int numeroDeMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(float eslora, String matricula, int anoFabricacion, int numeroDeMastiles)
    {
        super(eslora, matricula, anoFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    
    public int coeficienteBernua() 
    {
        return numeroDeMastiles;
    }
}
