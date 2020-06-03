
public class Inteligente extends Telefono{
     public Inteligente(){
        planLlamada = new Prepago();
        planDatos = new TresGiga();
        planMensajitos = new Silver();
    }
    public void display(){
        System.out.println("Hola, soy un Inteligente");
    }
}
