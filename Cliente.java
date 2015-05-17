
/**
 * Clase Cliente
 * 
 */
public class Cliente
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String toString()
    {
        String texto = "Datos del cliente\n";
        texto += "- Nombre " + nombre + "\n";
        texto += "- DNI: " + dni + "\n";
        return texto;
    }
}
