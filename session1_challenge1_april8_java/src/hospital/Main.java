//vanesa rangel ornelas
package hospital;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //attributes
        Scanner keyboard = new Scanner(System.in);
        patient patient1 = new patient();

        //methods
        System.out.print("enter the patient´s name ");
        patient.name = keyboard.nextLine();
        System.out.print("enter the patient´s age ");
        patient.age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("enter the patient´s dossier ");
        patient.dossier = keyboard.nextLine();
        keyboard.close();

        //method of principal class patient
        patient1.show_information();
    }
}