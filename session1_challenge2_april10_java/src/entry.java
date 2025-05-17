public class entry {
    //attributes
    static String event_name;
    static double ticket_price;

    //constructor
    public entry (String event_name, double ticket_price){
        this.event_name = event_name;
        this.ticket_price = ticket_price;
    }

    //method
    public void show_information(){
        System.out.print("Event: " + event_name + " | Price: $" + ticket_price );
    }
}