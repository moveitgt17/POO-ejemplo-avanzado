
public abstract class Telefono {
    protected int SKU;
    protected float precio;
    protected TelefonoSpec telefonospec;
    protected PlanLlamada planLlamada;
    protected PlanDatos planDatos;
    protected PlanMensaje planMensajitos;
    
   public abstract void display();
   
   
   public void llamar(){
      //performance = desempeño
       System.out.println("Tengo una tarifa de Q/seg:" + getPlanLlamada().tarifa() );
   }
   
   public void navegar(){
       //performance = desempeño
       if(getPlanDatos().capacidad()>0.0f){
           System.out.println("Puedo navegar");
       }else{
           System.out.println("No puedo navegar");
       }
   }
   public void mensajear(){
       //performance = desempeño
       System.out.println("Tengo para usar" + getPlanMensajitos().cantidad() + "Mensajitos");
   }
   public void setPlanLlamada(PlanLlamada planLlamada){
       this.planLlamada = planLlamada;
   }
    public void setPlanDatos(PlanDatos planDatos){
       this.planDatos = planDatos;
   }
     public void setPlanMensajitos(PlanMensaje planMensajitos){
       this.planMensajitos = planMensajitos;
   }

    /**
     * @return the SKU
     */
    public int getSKU() {
        return SKU;
    }

    /**
     * @param SKU the SKU to set
     */
    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the telefonospec
     */
    public TelefonoSpec getTelefonospec() {
        return telefonospec;
    }

    /**
     * @param telefonospec the telefonospec to set
     */
    public void setTelefonospec(TelefonoSpec telefonospec) {
        this.telefonospec = telefonospec;
    }

    /**
     * @return the planLlamada
     */
    public PlanLlamada getPlanLlamada() {
        return planLlamada;
    }

    /**
     * @return the planDatos
     */
    public PlanDatos getPlanDatos() {
        return planDatos;
    }

    /**
     * @return the planMensajitos
     */
    public PlanMensaje getPlanMensajitos() {
        return planMensajitos;
    }

    @Override
    public String toString() {
        return "Telefono{" + "SKU=" + SKU + ", precio=" + precio + ", telefonospec=" + telefonospec + ", planLlamada=" + planLlamada + ", planDatos=" + planDatos + ", planMensajitos=" + planMensajitos + '}';
    }
   
}
