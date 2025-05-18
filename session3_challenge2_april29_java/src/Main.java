public class Main{
    public static void main(String[]args){
        //creando 2 objetos
        //factura con rfc
        Factura factura1 = new Factura(456.50,"Servicio de consultoria","RASJFFAJS6");
        Factura facturanull = new Factura(1800.00,"reparacion de equipo",null);

        //metodos
        System.out.println(factura1.getResumen());
        System.out.println(facturanull.getResumen());
    }
}