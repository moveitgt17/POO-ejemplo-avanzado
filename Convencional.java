
public class Convencional extends Telefono {
    public Convencional(){
        planLlamada = new Prepago();
        planDatos = new SinGiga();
        planMensajitos = new Silver();
    }
    public void display(){
        System.out.println("Hola, soy un frijolito");
    }
}
