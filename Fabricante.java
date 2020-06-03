public enum Fabricante {
    SAMSUNG, HUAWEI, MOTOROLA;
    public String toString(){
        switch(this){
            case SAMSUNG:
                return "Fabricante SAMSUNG";
             case HUAWEI:
                 return "Fabricante HUAWEI";
             case MOTOROLA:
                 return "Fabricante Motorola";
             default :
                 return "Sin fabricante especifico"; 
        }}
    
}
