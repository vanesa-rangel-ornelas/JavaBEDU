import java.util.Optional;
public class Factura {
    //atributos
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    //metodos
    //constructor con parametros
    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    //getter (obtener=traer=mostrar)
    public String getResumen(){
        String info = "Factura generada \n";
        info+= "Descripcion: " + descripcion + "\n";
        info+= "Monto: " + monto + "\n";
        info+= "RFC: " + rfc.orElse("[no proporcionado]") + "\n";
        return info;
    }
}
