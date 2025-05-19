public abstract class UnidadEmergencia {
    //atributo
    String nombre;

    //constructor
    public UnidadEmergencia(String nombre){
        this.nombre= nombre;
    }

    //metodo abstracto
    public abstract void responder();

    //metodo normal o concreto
    public void activarUnidad(){
        System.out.println("Activando unidad: " + nombre);
    }
}