import java.util.ArrayList;

/**
 * Clase Puerto
 * 
 */
public class Puerto
{
    private ArrayList<Amarre> amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto(int numeroDeAmarres)
    {   
        amarres = new ArrayList<>();
        
        for (int i = 0; i < numeroDeAmarres; i++) {
            amarres.add(new Amarre(i));
        }
        
    }

    public void mostrarEstado()
    {
        for (Amarre amarre : amarres) {
            System.out.println(amarre);
        }
    }
    
    public void alquilar(Cliente cliente, Barco barco, int numeroDeDias)
    {
        if (hayAmarresLibres()) {
            int posicionAmarreLibre = posicionPrimerAmarreLibre();
            amarres.get(posicionAmarreLibre).ocupar(new Alquiler(cliente, barco, numeroDeDias));
        }
        else {
            System.out.println("No hay amarres libres");
        }
    }
    
    public boolean hayAmarresLibres()
    {
        return posicionPrimerAmarreLibre() != -1;
    }
    
    public int posicionPrimerAmarreLibre()
    {
        int posicionPrimerAmarreLibre = -1;
        int i = 0;
        while ((i < amarres.size()) && (posicionPrimerAmarreLibre == -1)) {
            if (amarres.get(i).disponible()) {
                posicionPrimerAmarreLibre = i;
            }
            i++;
        }
        return posicionPrimerAmarreLibre;           
    }
    
    public void liquidarAmarre(int numeroAmarre)
    {
        System.out.println("Precio del alquiler: " + amarres.get(numeroAmarre).precioAlquilerActual());
        amarres.get(numeroAmarre).desocupar();
    }
}
