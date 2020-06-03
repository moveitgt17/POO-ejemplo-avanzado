import java.util.ArrayList;

public class Inventario {
    private ArrayList<Telefono> telefonos;

    public Inventario() {
        telefonos = new ArrayList<Telefono>();
    }

    /**
     * @return the telefonos
     */
    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    /**
     * @param telefonos the telefonos to set
     */
    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
    
    public void addTelefono(Telefono telefono){
        telefonos.add(telefono);
    }
    
    
   // public void addTelefono(int SKU, PlanLlamada planLlamada, PlanDatos planDatos, PlanMensaje planMensaje, float precio, TelefonoSpec telefonoSpec){
     //   telefonos.add(0, new PlanLlamada, new newPlanDatos(), new PlanMensaje(), 0.0f, new TelefonoSpec());
    //}
    
    //public ArrayList<Telefono> buscarTeleno(TelefonoSpec telefonospec){
        
      //  return ArrayList<Telefono>;
    //}

    @Override
    public String toString() {
        return "Inventario{" + "telefonos=" + telefonos + '}';
    }

    
    
    
}
