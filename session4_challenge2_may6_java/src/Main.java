import java.util.Objects;

public class Main{
    public static void main(String []args){
        //creando 2 objetos
        DeclaracionImpuestos declaracion1 = new DeclaracionImpuestos("raov06",355.55);
        CuentaFiscal cuenta1 = new CuentaFiscal("raov06",3.99);

        //metodos
        System.out.println("declaracion enviada por rfc " + declaracion1.rfccontribuyente() + " por $" + declaracion1.monto_declarado());
        cuenta1.mostrarInformacion();

        boolean validar_rfc = cuenta1.validarRfc(declaracion1);
        System.out.println("¿RFC valido para esta cuenta? "+ validar_rfc);
    }
}