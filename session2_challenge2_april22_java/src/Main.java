//vanesa rangel ornelas
import java.util.Scanner;

public class Main{//stars class
    public static void main(String[] args){//starts main
        //attributes
        int select;
        float withdrawal = 0;
        float plus = 0.00F;
        var balance = 2000.00;
        Main user = new Main();
        Scanner keyboard = new Scanner(System.in);

        //methods
        do {//starts do
            System.out.print("Welcome to automatic cashier \n1.Check balance \n2.Deposit money \n3.Whitdraw money \n4.Exit \n");
            select = keyboard.nextInt();
                keyboard.nextLine();

                switch (select) {//starts switch
                    case 1:
                        System.out.println("your sald is $" + balance);
                        break;

                    case 2:
                        System.out.println("please enter deposit´s value ");
                        plus = keyboard.nextFloat();
                        if (plus>0) {
                            balance += plus;
                            System.out.println("now your sald is $" + balance);
                        }
                        else
                            System.out.println("invalid value ");
                        break;

                    case 3:
                        System.out.println("enter withdrawal´s value");
                        withdrawal = keyboard.nextFloat();

                        if (withdrawal<=0) {
                            System.out.println("invalid value ");
                            continue;
                        }
                        if (withdrawal < balance) {
                            balance -= withdrawal;
                            System.out.println("now your sald is $" + balance);
                        } else
                            System.out.println("insufficient balance ");
                        break;

                    case 4:
                        System.out.println("tanks for use my program ");
                }//end switch
        }//end do
            while (select != 4) ;
    }//ends main
}//ends class