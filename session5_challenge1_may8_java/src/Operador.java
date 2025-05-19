public class Operador {
    //atributo
    String nombre;

    //constructor
    public Operador(String nombre){
        this.nombre= nombre;
    }

    public void reportarse(){
        System.out.println("Operador: "+ nombre +" reportandose ");
    }
}
