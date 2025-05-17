public record entry_record (String event_name, double ticket_price){
    public void show_information(){
        System.out.print("Event: " + event_name + " | Price: $" + ticket_price );
    }
}
