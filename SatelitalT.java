
public class SatelitalT extends Telefono{

    public SatelitalT() {
        planLlamada = new Satelital();
        planDatos= new CincoGiga();
        planMensajitos = new Golden();
    }
    public void display(){
        System.out.println("Soy un satelital");
    }
    
}
