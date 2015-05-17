
/**
 * Clase Amarre
 * 
 */
public class Amarre
{
    private int posicion;
    private Alquiler alquiler;


    /**
     * Constructor for objects of class Amarre
     */
    public Amarre(int posicion)
    {
        this.posicion = posicion;
        alquiler = null;
    }
    
    public void ocupar(Alquiler alquiler)
    {
        if (this.alquiler == null) {
            this.alquiler = alquiler;
        }
        else {
            System.out.println("Error: el amarre está alquilado actualmente.");
        }
    }

    public String toString()
    {
        String texto = "Amarre nº " + posicion + "\n";
        if (alquiler != null) {
            texto += alquiler;
        }
        else {
            texto += "Libre";
        }
        texto += "\n";
        return texto;
    }
    
    public boolean disponible() 
    {
        return alquiler == null;
    }
    
    public float precioAlquilerActual()
    {
        float precio = 0;
        if (alquiler != null) {
            precio = alquiler.getCoste();
        }
        else {
            System.out.println("Error: el amarre no estaba alquilado");
        }
        return precio;
    }
    
    public void desocupar()
    {
        alquiler = null;
    }
}
