
/**
 * Clase Yate
 * 
 */
public class Yate extends EmbarcacionAMotor
{
    private int numeroCamarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(float eslora, String matricula, int anoFabricacion, int potencia, int numeroCamarotes)
    {
        super(eslora, matricula, anoFabricacion, potencia);        
        this.numeroCamarotes = numeroCamarotes;
    }

    public int coeficienteBernua() 
    {
        return super.coeficienteBernua() + numeroCamarotes;
    }
    
}
