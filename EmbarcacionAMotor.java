
/**
 * Clase EmbarcacionAMotor
 * 
 */
public class EmbarcacionAMotor extends Barco
{
    private int potencia;
    
    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(float eslora, String matricula, int anoFabricacion, int potencia)
    {
        super(eslora, matricula, anoFabricacion);
        this.potencia = potencia;
    }

    public int coeficienteBernua() 
    {
        return potencia;
    }
}
