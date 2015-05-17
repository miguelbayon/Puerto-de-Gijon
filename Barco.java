
/**
 * Clase Barco
 * 
 */
public class Barco
{
    private float eslora;
    private String matricula;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(float eslora, String matricula, int anoFabricacion)
    {
        this.eslora = eslora;
        this.matricula = matricula;
        this.anoFabricacion = anoFabricacion;
    }

    public String toString()
    {
        String texto = "Datos del barco:\n";
        texto += "- Eslora: " + eslora + "\n";
        texto += "- Matricula: " + matricula + "\n";
        texto += "- anoFabricacion" + anoFabricacion + "\n";
        return texto;
    }
    
    public int coeficienteBernua()     
    {
        return 0;
    }
    
    public float getEslora()
    {
        return eslora;
    }
}
