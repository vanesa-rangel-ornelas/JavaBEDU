public class Pasajero {
    //atributos
    String nombre;
    String pasaporte;

    //metodos
    //constructor con atributos
    public Pasajero (String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }
    //setters y getters
    //set=colocar, como estas colocando es un procedimiento, hace algo pero no te lo regresa, es un void
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPasaporte(String pasaporte){
        this.pasaporte = pasaporte;
    }
    //get=traer, te devuelve un valor, sera el que te mostrara por lo que es una funcion
    public String getNombre(){
        return nombre;
    }
    public String getPasaporte(){
        return pasaporte;
    }
}
