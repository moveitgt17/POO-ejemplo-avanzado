public class TelefonoSpec {
   private Fabricante fabricante;
   private Modelo modelo;
   private String serie;
   private String color;
   private int IMEI;

    public TelefonoSpec() {
    }

    public TelefonoSpec(Fabricante fabricante, Modelo modelo, String serie, String color, int IMEI) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.serie = serie;
        this.color = color;
        this.IMEI = IMEI;
    }

    /**
     * @return the fabricante
     */
    public Fabricante getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the modelo
     */
    public Modelo getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the IMEI
     */
    public int getIMEI() {
        return IMEI;
    }

    /**
     * @param IMEI the IMEI to set
     */
    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "TelefonoSpec{" + "fabricante=" + fabricante + ", modelo=" + modelo + ", serie=" + serie + ", color=" + color + ", IMEI=" + IMEI + '}';
    }
    
    
   
}
