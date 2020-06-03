
public class ComunicacionesTelefonicasGT {
    private static void initTelefonos(Inventario inventario){
        Telefono t1 = new Inteligente();
         Telefono t2 = new Inteligente();
          Telefono t3 = new Inteligente();
        inventario.addTelefono(t1);
        inventario.addTelefono(t2);
        inventario.addTelefono(t3);
        System.out.println(inventario.toString());
    }
    
    public static void main(String[] args){
       Inventario inv = new Inventario();
       initTelefonos(inv);
    }
}
