
public enum Modelo {
    P30, H2, M5;
    public String toString(){
        switch(this){
            case P30:
                return "Modelo P30";
             case H2:
                 return "Modelo H2";
             case M5:
                 return "Modelo M5";
             default :
                 return "Sin Modelo especifico"; 
        }}
}
