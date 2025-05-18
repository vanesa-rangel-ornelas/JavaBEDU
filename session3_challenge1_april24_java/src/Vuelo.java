public class Vuelo{
    //attributes
    final String codigo_vuelo;
    String destino;
    String hora_salida;
    boolean reservacion;

    //methods
    //constructor con variables
    public Vuelo(String codigo_vuelo,String destino,String hora_salida,boolean reservacion){
        this.codigo_vuelo = codigo_vuelo;
        this.destino = destino;
        this.hora_salida = hora_salida;
        this.reservacion = reservacion;
    }
    //funcion para asignar pasajero
    public boolean reservarAsiento(boolean reservacion){
        boolean espacio = false;
        if (!espacio)
             return true;
        else
            return true;
    }
}
