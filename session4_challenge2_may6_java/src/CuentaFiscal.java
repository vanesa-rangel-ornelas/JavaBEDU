import java.util.Objects;

public class CuentaFiscal {
    //atributos
    private final String rfc;
    private double saldo_disponible;

    //metodos
    //constructor de validacion
    public CuentaFiscal(String rfc,double saldo_disponible){
        this.rfc = rfc;
        if (saldo_disponible<=0) {
            System.out.println("el monto no puede ser negativo ");
            this.saldo_disponible = 0;
        }
        else
            this.saldo_disponible = saldo_disponible;
    }

    //getters
    public String getRfc(){
        return rfc;
    }
    public double getSaldo_disponible(){
        return saldo_disponible;
    }

    //funcion que dice si son iguales o no
    public boolean validarRfc(DeclaracionImpuestos d){
        return Objects.equals(this.rfc,d.rfccontribuyente());
    }

    //procedimiento para mostrar datos
    public void mostrarInformacion(){
        System.out.println("cuenta fiscal enviada por rfc " + rfc + " por $" + saldo_disponible);
    }
}
