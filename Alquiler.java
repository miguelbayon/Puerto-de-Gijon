
/**
 * Clase Alquiler
 * 
 */
public class Alquiler
{
    private Barco barco;
    private Cliente cliente;
    private int numeroDeDias;
    private final int COSTE_METRO_ESLORA = 10;
    private final int MULTIPLICADOR_COSTE = 300;
    
    
    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(Cliente cliente, Barco barco, int numeroDeDias)
    {
        this.barco = barco;
        this.cliente = cliente;
        this.numeroDeDias = numeroDeDias;
    }

    public String toString()
    {
        String texto = "Datos del alquiler\n";
        texto += "========================\n";
        texto += barco;
        texto += cliente;
        texto += "Numero de dias del alquiler: " + numeroDeDias;
        return texto;
    }
    
    public float getCoste()
    {
        return (numeroDeDias * COSTE_METRO_ESLORA * barco.getEslora()) + (MULTIPLICADOR_COSTE * barco.coeficienteBernua());
    }
}
