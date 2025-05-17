
public class pharmacySimulator {

    //attributes
    String name;
    double price;
    int pieces;

    //methods
    void show_information(){

        var total = price*pieces;
        boolean aplicaDescuento = total > 500;
        var descuento = aplicaDescuento ? total*0.15 : 0;
        double finalTotal = total - descuento;

        System.out.println("Medicament: " + name);
        System.out.println("Pieces: " + pieces);
        System.out.println("Unitary price: $" + price);
        System.out.println("Total: $" + total);
        System.out.println("Apply discount? " + aplicaDescuento);
        System.out.println("Discount: $" + descuento);
        System.out.println("Final total: $" + finalTotal);
    }
}
