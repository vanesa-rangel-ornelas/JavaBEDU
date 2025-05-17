//vanesa rangel ornelas
import java.util.Scanner;
public class Main{
    public static void  main(String[] args){
        //objects
        Scanner out = new Scanner(System.in);
        pharmacySimulator medicament = new pharmacySimulator();

        //methods
        System.out.println("Please enter medicament's name ");
        medicament.name = out.nextLine();
        System.out.println("Please enter medicament´s price ");
        medicament.price = out.nextDouble();
        System.out.println("Please enter pieces of medicament ");
        medicament.pieces = out.nextInt();
        out.close();

        medicament.show_information();
    }
}