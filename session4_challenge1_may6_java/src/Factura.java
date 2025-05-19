import java.util.HashSet;
import java.util.Objects;

public class Factura {
    //atributos
    protected String folio;
    protected String cliente;
    protected double total;

    //metodos
    //constructor con parametros
    public Factura(String folio,String cliente,double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    //toString
    @Override
    public String toString(){
        return "Factura[folio= " + folio +", cliente= " + cliente + ", total= $" + total + " ]\n";
    }

    //equals
    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass())return false;

        Factura otra = (Factura) object;
        return this.folio.equals(otra.folio);
    }

    //hashcode
    @Override
    public int hashCode(){
        return Objects.hash(folio);
    }
}
