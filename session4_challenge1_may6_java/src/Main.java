public class Main{
    public static void main(String[]args){
        //creando 2 objetos
        Factura factura1 = new Factura("1234","jesus diaz",457.90);
        Factura factura2 = new Factura("1234","vanesa rangel",457.90);

        //usando el metodo to string
        System.out.println(factura1.toString());
        System.out.println(factura2.toString());

        //usando equals
        System.out.println(factura1.equals(factura2));
    }
}