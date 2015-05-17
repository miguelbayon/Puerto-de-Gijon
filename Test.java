
/**
 * Clase Test
 * 
 */
public class Test
{
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {        
    }

    public void test1()
    {
        Cliente cliente1 = new Cliente("Enrique Iglesias", "71456456H");
        Cliente cliente2 = new Cliente("Juan Magan", "76233233K");
        Cliente cliente3 = new Cliente("Romeo Santos", "72544544L");
        Cliente cliente4 = new Cliente("Jennifer Lopez", "9865865T");

        Barco velero1 = new Velero(23.5F, "DFT444", 1996, 4);        
        Barco embarcacionAMotor1 = new EmbarcacionAMotor(45.2F, "HJJ987", 2002, 1200);
        Barco yate1 = new Yate(70.0F, "KIO123", 2010, 1500, 15);
        
        Puerto puertoGijon = new Puerto(4);
        
        puertoGijon.mostrarEstado();
        
        puertoGijon.alquilar(cliente1, velero1, 10);
        puertoGijon.alquilar(cliente2, embarcacionAMotor1, 5);
        puertoGijon.alquilar(cliente3, yate1, 2);
        
        puertoGijon.mostrarEstado();    
        
        puertoGijon.liquidarAmarre(0);
        puertoGijon.liquidarAmarre(1);
        puertoGijon.liquidarAmarre(2);        
        
        puertoGijon.mostrarEstado();            
    }

}
